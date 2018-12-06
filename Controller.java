import javafx.stage.Stage;
import java.sql.*;
import java.util.*;

public class Controller {
  Database model;
  View view;

  public Controller(Database m, Stage primaryStage) {
    model = m;
    view = new View(this, primaryStage);

  }

  public boolean registerUser(String email, String password, String last_name, String first_name, String contact_number,
      String gender) {
    if (model.registerUser(email, password, first_name, last_name, contact_number, gender))
      return true;
    else
      return false;
  }

  public boolean loginUser(String email, String password) {
    if (model.loginUser(email, password)) {
      System.out.println("success");
      return true;
    } else
      return false;
  }

  public void logoutUser() {
    model.logoutUser();
  }

  public ArrayList<Product> getAllProducts() {
    return model.getAllProducts();
  }

  public ArrayList<Product> getProductsWithKeyword(String keyword) {
    return model.getProductsWithKeyword(keyword);
  }

  public ArrayList<Product> getProductsUnderAType(String AType) {
    return model.getProductsUnderAType(AType);
  }

  public ArrayList<Product> getProductsUnderGender(String gender) {
    return model.getProductsUnderGender(gender);
  }

  public User getCurrentUser() {
    return model.getCurrentUser();
  }

  public ArrayList<Order> getOrderHistory() {
    return model.getOrderHistory();
  }

  public ArrayList<Product> getCurrentCart() {
    return model.getCurrentCart();
  }

  public boolean removeFromCart(int session_id) {
    return model.removeFromCart(session_id);
  }

  public boolean addToCart(int product_id, int quantity) {
    return model.addToCart(product_id, quantity);
  }

  public boolean checkoutCart(String payment_method, String shipping_address, String billing_address) {
    return model.checkoutCart(payment_method, shipping_address, billing_address);
  }

  public ArrayList<Product> getProductsInOrder(int order_id) {
    return model.getProductsInOrder(order_id);
  }

  public ArrayList<Brand> getAllBrands() {
    return model.getAllBrands();
  }

  public ArrayList<Order> getAllOrders() {
    return model.getAllOrders();
  }

  public ArrayList<User> getAllUsers() {
    return model.getAllUsers();
  }

  public ArrayList<Product> getProductsOfBrand(int brand_id) {
    return model.getProductsOfBrand(brand_id);
  }

  public float getMyCartTotal() {
    return model.getMyCartTotal();
  }

  public ArrayList<String> getOlapAllBrands(String year) {
    return model.getOlapAllBrands(year);
  }

  public ArrayList<String> getOlapOneBrand(String brand, String year) {
    return model.getOlapOneBrand(brand, year);
  }

  public boolean addNewProduct(String product_name, String brand_name, float price, String classification,
      String apparel_type) {
    if (model.addNewProduct(product_name, brand_name, price, classification, apparel_type))
      return true;
    else
      return false;
  }

  public boolean addNewBrand(String brand_name, String address, String email, String contact_number) {
    if (model.addNewBrand(brand_name, address, email, contact_number))
      return true;
    else
      return false;
  }

  public boolean editUser(String email, String password, String first_name, String last_name, String contact_number,
      String gender) {
    return model.editUser(email, password, first_name, last_name, contact_number, gender);
  }

  public boolean editBrand(int brand_id, String brand_name, String address, String email, String contact_number) {
    return model.editBrand(brand_id, brand_name, address, email, contact_number);
  }

  public boolean editProduct(int product_id, String product_name, String brand_name, float price, String classification,
      String apparel_type) {

    return model.editProduct(product_id, product_name, brand_name, price, classification, apparel_type);

  }

}
