import java.sql.*;
import java.util.*;

public class Database {

  private User currentUser = new User();
  private Statement stmt;

  private String driver = "com.mysql.jdbc.Driver";
  private String db = "zaloradb";
  private String url = "jdbc:mysql://localhost/" + db + "?useSSL=false";
  private String user = "root";
  private String pass = "password";
  private Connection conn = null;

  public Database() {

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
          currentUser.setPassword(rs.getString("password"));
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

  public boolean registerUser(String email, String password, String first_name, String last_name, String contact_number,
      String gender) {

    int newusercount = getNewUserID();
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

  public ArrayList<String> getOlapAllBrands(String year) {
    String returnResults = "SELECT carts.quantity as 'quantity', MONTH(orderdetails.order_date) as 'month' FROM carts INNER JOIN orderdetails ON carts.order_id = orderdetails.order_id WHERE YEAR(orderdetails.order_date) = "
        + year + " GROUP BY MONTH(orderdetails.order_date);";

    ArrayList<String> results = new ArrayList<String>();

    try {
      ResultSet rs = stmt.executeQuery(returnResults);

      while (rs.next()) {
        results.add(rs.getString("quantity"));
        results.add(rs.getString("month"));
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return results;
  }

  public ArrayList<String> getOlapOneBrand(String brand, String year) {
    String returnResults = "SELECT carts.quantity as 'quantity', MONTH(orderdetails.order_date) as 'month' FROM carts INNER JOIN orderdetails ON carts.order_id = orderdetails.order_date "
        + "INNER JOIN products ON products.product_id = carts.product_id INNER JOIN brands ON brands.brand_id = products.brand_id WHERE YEAR(orderdetails.order_date) = "
        + year + " AND brands.brand_name LIKE '%" + brand
        + "%' GROUP BY brands.brand_id, MONTH(orderdetails.order_date);";

    ArrayList<String> results = new ArrayList<String>();

    try {
      ResultSet rs = stmt.executeQuery(returnResults);
      while (rs.next()) {
        results.add(rs.getString("quantity"));
        results.add(rs.getString("month"));
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return results;
  }

  public ArrayList<Product> getProductsWithKeyword(String keyword) {

    String returnProductsWithKeyword = "SELECT products.* FROM products INNER JOIN brands ON brands.brand_id = products.brand_id WHERE brands.brand_name = '"
        + keyword + "' OR products.product_name LIKE '%" + keyword + "%'";

    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsWithKeyword);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
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
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
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
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
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
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Product> getProductsOfBrand(int brand_id) {
    String returnProductsOfBrand = "SELECT * FROM products WHERE brand_id = " + brand_id;

    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsOfBrand);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
        temp.add(tproduct);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Product> getProductsInOrder(int order_id) {

    String returnProductsInOrder = "SELECT products.*, carts.quantity FROM carts INNER JOIN products ON products.product_id = carts.product_id WHERE  carts.user_id = "
        + currentUser.getUser_id() + " AND carts.order_id =" + order_id;

    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnProductsInOrder);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
        tproduct.setQuantity(rs.getInt("quantity"));
        temp.add(tproduct);

      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;

  }

  public ArrayList<Product> getCurrentCart() {
    String returnCurrentCart = "SELECT products.*, carts.session_id, carts.quantity FROM carts INNER JOIN products ON products.product_id = carts.product_id WHERE carts.checked_out = 0 AND carts.user_id ="
        + currentUser.getUser_id();

    ArrayList<Product> temp = new ArrayList<Product>();

    try {
      ResultSet rs = stmt.executeQuery(returnCurrentCart);

      while (rs.next()) {
        Product tproduct = new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("brand_id"),
            rs.getFloat("price"), rs.getString("classification"), rs.getString("apparel_type"));
        tproduct.setQuantity(rs.getInt("quantity"));
        tproduct.setSession_ID(rs.getInt("session_id"));
        temp.add(tproduct);
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Brand> getAllBrands() {
    String returnAllBrands = "SELECT * FROM brands";

    ArrayList<Brand> temp = new ArrayList<Brand>();

    try {
      ResultSet rs = stmt.executeQuery(returnAllBrands);
      while (rs.next()) {
        Brand tbrand = new Brand(rs.getInt("brand_id"), rs.getString("brand_name"), rs.getString("address"),
            rs.getString("email"), rs.getString("contact_number"));
        temp.add(tbrand);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Order> getOrderHistory() {

    String returnOrderHistory = "SELECT orderdetails.* FROM orderdetails WHERE user_id = " + currentUser.getUser_id();

    ArrayList<Order> temp = new ArrayList<Order>();

    try {
      ResultSet rs = stmt.executeQuery(returnOrderHistory);
      while (rs.next()) {
        Order torder = new Order(rs.getInt("order_id"), rs.getString("payment_method"), rs.getString("order_date"),
            rs.getString("shipping_address"), rs.getString("billing_address"), rs.getFloat("total_amount"),
            currentUser.getUser_id());
        temp.add(torder);
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public boolean removeFromCart(int session_id) {
    String removeProductFromCart = "DELETE FROM `zaloradb`.`carts` WHERE (`session_id` = '" + session_id + "')";

    try {
      stmt.executeUpdate(removeProductFromCart);
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;
  }

  public boolean addToCart(int product_id, int quantity) {

    String addProductToCart = "INSERT INTO `zaloradb`.`carts` (`session_id`, `user_id`, `product_id`, `quantity`, `checked_out`) VALUES ('"
        + getNewSessionID() + "', '" + currentUser.getUser_id() + "', '" + product_id + "', '" + quantity + "', '0')";

    try {
      stmt.executeUpdate(addProductToCart);

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;

  }

  public boolean checkoutCart(String payment_method, String shipping_address, String billing_address) {

    int orderid = getNewOrderID();

    //adds new order details

    String updateOrderDetails = "INSERT INTO `zaloradb`.`orderdetails` (`order_id`, `payment_method`, `order_date`, `shipping_address`, `billing_address`) VALUES ('"
        + orderid + "', '" + payment_method + "', '" + getDate() + "', '" + shipping_address + "', '" + billing_address
        + "')";

    try {
      stmt.executeUpdate(updateOrderDetails);
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    //makes checkout to 1 and assigns new order_id

    ArrayList<Product> currentcart = new ArrayList<Product>();

    currentcart = getCurrentCart();

    for (int i = 0; i < currentcart.size(); i++) {
      String checkoutCart = "UPDATE `zaloradb`.`carts` SET `checked_out` = '1', `order_id` = '" + orderid
          + "' WHERE (`session_id` = '" + currentcart.get(i).getSession_ID() + "')";

      try {
        stmt.executeUpdate(checkoutCart);
      } catch (SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: " + e.getSQLState());
        System.out.println("VendorError: " + e.getErrorCode());
        return false;
      }
    }

    // updates totalprice and add user ID
    String updateTotalPrice = "UPDATE `zaloradb`.`orderdetails` SET `total_amount` = '" + getTotalOrderPrice(orderid)
        + "', `user_id` = '" + currentUser.getUser_id() + "' WHERE (`order_id` = '" + orderid + "')";

    try {
      stmt.executeUpdate(updateTotalPrice);
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;

  }

  public float getTotalOrderPrice(int order_id) {
    String returnTotalOrderPrice = "SELECT SUM(products.price*carts.quantity) as 'total' FROM products INNER JOIN carts ON products.product_id = carts.product_id WHERE carts.user_id = "
        + currentUser.getUser_id() + " AND carts.order_id = " + order_id;

    float total = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnTotalOrderPrice);

      while (rs.next()) {
        total = rs.getFloat("total");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return total;
  }

  public float getMyCartTotal() {
    String returnMyCartTotal = "SELECT products.price, carts.quantity FROM carts INNER JOIN products ON products.product_id = carts.product_id WHERE carts.checked_out = 0 AND carts.user_id = "
        + currentUser.getUser_id();

    float total = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMyCartTotal);

      while (rs.next()) {
        total += rs.getFloat("price") * rs.getInt("quantity");
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return total;

  }

  public int getNewSessionID() {
    String returnMaxSessionID = "SELECT MAX(session_id) as 'max' FROM carts";
    int newID = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMaxSessionID);

      while (rs.next()) {
        newID = rs.getInt("max");
        newID++;
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return newID;
  }

  public int getNewOrderID() {
    String returnMaxOrderID = "SELECT MAX(order_id) as 'max' FROM carts";

    int newID = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMaxOrderID);

      while (rs.next()) {
        newID = rs.getInt("max");
        newID++;
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return newID;
  }

  public int getNewProductID() {
    String returnMaxProductID = "SELECT MAX(product_id) as 'max' FROM products";

    int newID = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMaxProductID);

      while (rs.next()) {
        newID = rs.getInt("max");
        newID++;
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return newID;
  }

  public int getNewUserID() {
    String returnMaxUserID = "SELECT MAX(user_id) as 'max' FROM useraccounts";

    int newID = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMaxUserID);

      while (rs.next()) {
        newID = rs.getInt("max");
        newID++;
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return newID;
  }

  public int getNewBrandID() {
    String returnMaxBrandID = "SELECT MAX(brand_id) as 'max' FROM carts";

    int newID = 0;

    try {
      ResultSet rs = stmt.executeQuery(returnMaxBrandID);

      while (rs.next()) {
        newID = rs.getInt("max");
        newID++;
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return newID;
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

  public ArrayList<User> getAllUsers() {
    String returnAllUsers = "SELECT * FROM useraccounts";
    ArrayList<User> temp = new ArrayList<User>();

    try {
      ResultSet rs = stmt.executeQuery(returnAllUsers);

      while (rs.next()) {
        User tuser = new User(rs.getInt("user_id"), rs.getString("email"), rs.getString("password"),
            rs.getString("first_name"), rs.getString("last_name"), rs.getString("contact_number"),
            rs.getString("gender"), rs.getString("register_date"));

        temp.add(tuser);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public ArrayList<Order> getAllOrders() {
    String returnAllOrders = "SELECT * FROM orderdetails";
    ArrayList<Order> temp = new ArrayList<Order>();

    try {
      ResultSet rs = stmt.executeQuery(returnAllOrders);

      while (rs.next()) {
        Order torder = new Order(rs.getInt("order_id"), rs.getString("payment_method"), rs.getString("order_date"),
            rs.getString("shipping_address"), rs.getString("billing_address"), rs.getFloat("total_amount"),
            rs.getInt("user_id"));
        temp.add(torder);
      }
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }
    return temp;
  }

  public boolean addNewBrand(String brand_name, String address, String email, String contact_number) {
    String addNewBrand = "INSERT INTO `zaloradb`.`brands` (`brand_id`, `brand_name`, `address`, `email`, `contact_number`) VALUES ('"
        + getNewBrandID() + "', '" + brand_name + "', '" + address + "', '" + email + "', '" + contact_number + "')";

    try {
      stmt.executeUpdate(addNewBrand);

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;
  }

  public boolean addNewProduct(String product_name, String brand_name, float price, String classification,
      String apparel_type) {

    int brand_id = verifyBrand(brand_name);

    if (brand_id != 0) {

      String addNewProduct = "INSERT INTO `zaloradb`.`products` (`product_id`, `product_name`, `brand_id`, `price`, `classification`, `apparel_type`) VALUES ('"
          + getNewProductID() + "', '" + product_name + "', '" + brand_id + "', '" + price + "', '" + classification
          + "', '" + apparel_type + "')";

      try {
        stmt.executeUpdate(addNewProduct);
      } catch (SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: " + e.getSQLState());
        System.out.println("VendorError: " + e.getErrorCode());
        return false;
      }

      return true;

    }

    return false;
  }

  public int verifyBrand(String brand_name) {
    String verifyBrand = "SELECT brand_id FROM brands WHERE brand_name = '" + brand_name + "'";

    try {
      ResultSet rs = stmt.executeQuery(verifyBrand);

      if (rs.next()) {
        return rs.getInt("brand_id");
      }

    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    }

    return 0;
  }

  public boolean editUser(String email, String password, String first_name, String last_name, String contact_number,
      String gender) {

    String editUser = "UPDATE `zaloradb`.`useraccounts` SET `email` = '" + email + "', `password` = '" + password
        + "', `first_name` = '" + first_name + "', `last_name` = '" + last_name + "', `contact_number` = '"
        + contact_number + "', `gender` = '" + gender + "' WHERE (`user_id` = '" + currentUser.getUser_id() + "')";

    try {
      stmt.executeUpdate(editUser);
      currentUser.setEmail(email);
      currentUser.setPassword(password);
      currentUser.setFirst_name(first_name);
      currentUser.setLast_name(last_name);
      currentUser.setContact_number(contact_number);
      currentUser.setGender(gender);
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;

  }

  public boolean editBrand(int brand_id, String brand_name, String address, String email, String contact_number) {
    String editBrand = "UPDATE `zaloradb`.`brands` SET `brand_name` = '" + brand_name + "', `address` = '" + address
        + "', `email` = '" + email + "', `contact_number` = '" + contact_number + "' WHERE (`brand_id` = '" + brand_id
        + "')";

    try {
      stmt.executeUpdate(editBrand);
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
      return false;
    }

    return true;
  }

  public boolean editProduct(int product_id, String product_name, String brand_name, float price, String classification,
      String apparel_type) {

    int brand_id = verifyBrand(brand_name);

    if (brand_id != 0) {

      String editProduct = "UPDATE `zaloradb`.`products` SET `product_name` = '" + product_name + "', `brand_id` = '"
          + brand_id + "', `price` = '" + price + "', `classification` = '" + classification + "', `apparel_type` = '"
          + apparel_type + "' WHERE (`product_id` = '" + product_id + "')";

      try {
        stmt.executeUpdate(editProduct);
      } catch (SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: " + e.getSQLState());
        System.out.println("VendorError: " + e.getErrorCode());
        return false;
      }

      return true;

    }

    return false;

  }
}
