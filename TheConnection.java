
import java.sql.*;
import java.util.*;

public class TheConnection {

  private static int currentUserID = 0;

  public TheConnection() throws ClassNotFoundException {

    Connection conn = null;

    // SQL DETAILS
    String driver = "com.mysql.jdbc.Driver";
    String db = "zaloradb";
    String url = "jdbc:mysql://localhost/" + db;
    String user = "root";
    String pass = "password";

    //QUERY STATEMENTS

    // GETTING CONNECTED
    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected to database : " + db);
      Statement stmt = conn.createStatement();

      /*
      Scanner sc = new Scanner(System.in);

      System.out.print("Username: ");
      String email = sc.nextLine();
      System.out.print("Password: ");
      String password = sc.nextLine();

      if (validateUserDetails(stmt, email, password)) {
        System.out.println("Success");
      } else
        System.out.println("Fail");

      System.out.print("Search: ");
      String keyword = sc.nextLine();
      sc.close();

      ArrayList<String> brands = new ArrayList<String>();
      brands = getProductsWithKeyword(stmt, keyword);

      for (int i = 0; i < brands.size(); i++) {
        System.out.println(brands.get(i));
      }
      */

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
  }
  /*
  public static void getBrandList(ResultSet rs) {
    try {
      while (rs.next()) {
        String brand_id = rs.getString("brand_id");
        String brand_name = rs.getString("brand_name");
        String address = rs.getString("address");
        String email = rs.getString("email");
        int contact_number = rs.getInt("contact_number");
        System.out.println(brand_id + "\t" + brand_name + "\t" + address + "\t" + email + "\t" + contact_number);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
  }
  */

  public static boolean validateUserDetails(Statement stmt, String xemail, String xpassword) {

    String returnUserDetails = "SELECT email, password, first_name, last_name FROM useraccounts";

    try {
      ResultSet rs = stmt.executeQuery(returnUserDetails);
      while (rs.next()) {
        if (rs.getString("email").equals(xemail) && rs.getString("password").equals(xpassword)) {
          setCurrentUserID(rs.getInt("user_id"));
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

  public static ArrayList<String> getProductsWithKeyword(Statement stmt, String keyword) {

    String returnProductsWithKeyword = "SELECT products.* FROM products INNER JOIN brands ON brands.brand_id = products.brand_id WHERE brands.brand_name = '"
        + keyword + "' OR products.product_name LIKE '%" + keyword + "%'";

    ArrayList<String> temp = new ArrayList<String>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsWithKeyword);
      while (rs.next()) {
        temp.add(rs.getString("product_name") + " - PHP " + rs.getString("price"));
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public int getCurrentUserID() {
    return currentUserID;
  }

  public static void setCurrentUserID(int id) {
    currentUserID = id;
  }
}
