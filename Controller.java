import javafx.stage.Stage;
import java.sql.*;
import java.util.*;

public class Controller {
  Database model;
  View view;
  Statement stmt;

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

}
