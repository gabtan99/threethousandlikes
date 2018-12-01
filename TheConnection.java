import java.sql.*;
import java.util.*;

public class TheConnection {

  private static User currentUser = new User();
  private static String driver = "com.mysql.jdbc.Driver";
  private static String db = "zaloradb";
  private static String url = "jdbc:mysql://localhost/" + db + "?useSSL=false";
  private static String user = "root";
  private static String pass = "password";
  private static Connection conn = null;

  public TheConnection() {
    /*
    Scanner sc = new Scanner(System.in);

    System.out.println("Username: ");
    String username = sc.nextLine();
    System.out.println("Password: ");
    String password = sc.nextLine();

    if (loginUser(username, password))
      System.out.println("Success");
    else
      System.out.println("Fail");


    ArrayList<Product> temp = new ArrayList<Product>();
    temp = getAllProducts();
    for (int i = 0; i < temp.size(); i++) {
      System.out.println(temp.get(i).getProduct_name() + temp.get(i).getPrice());
    }

    */

  }

  public static boolean loginUser(String xemail, String xpassword) {
    String returnUserDetails = "SELECT * FROM useraccounts";

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery(returnUserDetails);

      while (rs.next()) {
        if (rs.getString("email").equals(xemail) && rs.getString("password").equals(xpassword)) {

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
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return false;
  }

  public static boolean registerUser(String email, String password, String first_name, String last_name,
      String contact_number, String gender) {

    try {

      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

      int newusercount = getUserCount() + 1;
      String addNewUser = "INSERT INTO `zaloradb`.`useraccounts` (`user_id`, `email`, `password`, `first_name`, `last_name`, `contact_number`, `gender`, `register_date`)";
      addNewUser = addNewUser + "VALUES ('" + newusercount + "', '" + email + "', '" + password + "', '" + first_name
          + "', '" + last_name + "', '" + contact_number + "', '" + gender + "', '" + getDate() + "')";

      stmt.executeUpdate(addNewUser);

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

    return true;
  }

  public static void logoutUser() {
    currentUser.setUser_id(0);
    currentUser.setPassword(null);
    currentUser.setFirst_name(null);
    currentUser.setLast_name(null);
    currentUser.setRegister_date(null);
    currentUser.setGender(null);
    currentUser.setContact_number(null);
    currentUser.setEmail(null);
  }

  public static ArrayList<Product> getProductsWithKeyword(String keyword) {

    String returnProductsWithKeyword = "SELECT products.* FROM products INNER JOIN brands ON brands.brand_id = products.brand_id WHERE brands.brand_name = '"
        + keyword + "' OR products.product_name LIKE '%" + keyword + "%'";

    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

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
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

    return temp;
  }

  public static ArrayList<Product> getAllProducts() {
    String returnAllProducts = "SELECT * FROM products";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

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
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return temp;
  }

  public static ArrayList<Product> getProductsUnderAType(String AType) {
    String returnProductsUnderAType = "SELECT * FROM products WHERE apparel_type = '" + AType + "'";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

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
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return temp;
  }

  public static ArrayList<Product> getProductsUnderGender(String classification) {
    String returnProductsUnderAType = "SELECT * FROM products WHERE classification = '" + classification + "'";
    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

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
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return temp;
  }

  public static int getUserCount() {

    String returnUserCount = "SELECT COUNT(user_id) as 'usercount' FROM useraccounts";

    int count = 0;

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery(returnUserCount);
      while (rs.next()) {
        count = rs.getInt("usercount");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

    return count;
  }

  public static User getCurrentUser() {
    return currentUser;
  }

  public static String getDate() {
    String returnDate = "SELECT NOW()";

    String date = null;

    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery(returnDate);

      while (rs.next()) {
        date = rs.getString("NOW()");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

    return date;
  }

}
