import java.sql.*;
import java.util.*;

public class TheConnection {

  private static User currentUser = new User();
  private static Statement stmt;

  public TheConnection() {
    //SQL details
    String driver = "com.mysql.jdbc.Driver";
    String db = "zaloradb";
    String url = "jdbc:mysql://localhost/" + db + "?useSSL=false";
    String user = "root";
    String pass = "password";
    Connection conn = null;

    //Connection attempt
    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      stmt = conn.createStatement();

    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }

  public boolean loginUser(String email, String password) {
    String returnUserDetails = "SELECT * FROM useraccounts";

    try {
      ResultSet rs = stmt.executeQuery(returnUserDetails);

      while (rs.next()) {
        if (rs.getString("email").equals(email) && rs.getString("password").equals(password)) {

          currentUser.setUser_id(rs.getInt("user_id"));
          currentUser.setFirst_name(rs.getString("first_name"));
          currentUser.setLast_name(rs.getString("last_name"));
          currentUser.setEmail(rs.getString("email"));
          currentUser.setContact_number(rs.getString("contact_number"));
          currentUser.setGender(rs.getString("gender"));
          currentUser.setRegister_date(rs.getString("register_date"));
          return true;
        }
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return false;
  }

  public boolean registerUser(String email, String password, String first_name, String last_name,
      String contact_number, String gender) {

    int newusercount = getUserCount() + 1;
    String addNewUser = "INSERT INTO `zaloradb`.`useraccounts` (`user_id`, `email`, `password`, `first_name`, `last_name`, `contact_number`, `gender`, `register_date`)";
    addNewUser = addNewUser + "VALUES ('" + newusercount + "', '" + email + "', '" + password + "', '" + first_name
        + "', '" + last_name + "', '" + contact_number + "', '" + gender + "', '" + getDate() + "')";

    try {

      stmt.executeUpdate(addNewUser);

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;
  }

  public void logoutUser() {
    currentUser.setUser_id(0);
    currentUser.setPassword(null);
    currentUser.setFirst_name(null);
    currentUser.setLast_name(null);
    currentUser.setRegister_date(null);
    currentUser.setGender(null);
    currentUser.setContact_number(null);
    currentUser.setEmail(null);
  }

  public ArrayList<Product> getProductsWithKeyword(String keyword) {

    String returnProductsWithKeyword = "SELECT products.* FROM products INNER JOIN brands ON brands.brand_id = products.brand_id WHERE brands.brand_name = '"
        + keyword + "' OR products.product_name LIKE '%" + keyword + "%'";

    ArrayList<Product> temp = new ArrayList<Product>();

    try {

      ResultSet rs = stmt.executeQuery(returnProductsWithKeyword);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getInt("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return temp;
  }

  public ArrayList<Product> getAllProducts() {
    String returnAllProducts = "SELECT * FROM products";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {

      ResultSet rs = stmt.executeQuery(returnAllProducts);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getInt("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Product> getProductsUnderAType(String AType) {
    String returnProductsUnderAType = "SELECT * FROM products WHERE apparel_type = '" + AType + "'";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsUnderAType);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getInt("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Product> getProductsUnderGender(String classification) {
    String returnProductsUnderAType = "SELECT * FROM products WHERE classification = '" + classification + "'";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsUnderAType);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getInt("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public int getUserCount() {

    String returnUserCount = "SELECT COUNT(user_id) as 'usercount' FROM useraccounts";

    int count = 0;

    try {

      ResultSet rs = stmt.executeQuery(returnUserCount);
      while (rs.next()) {
        count = rs.getInt("usercount");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return count;
  }

  public User getCurrentUser() {
    return currentUser;
  }

  public String getDate() {
    String returnDate = "SELECT NOW()";

    String date = null;

    try {
      ResultSet rs = stmt.executeQuery(returnDate);

      while (rs.next()) {
        date = rs.getString("NOW()");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return date;
  }

}
