import javafx.stage.Stage;
import java.sql.*;
import java.util.*;

public class Controller {
  TheConnection model;
  View view;
  Statement stmt;

  public Controller(TheConnection m, Stage primaryStage) {
    model = m;
    view = new View(this, primaryStage);

  }

  public boolean registerUser(String email, String password, String last_name, String first_name, String contact_number, String gender) {
    if (model.registerUser(email, password, first_name, last_name, contact_number, gender))
      return true;
    else
      return false;
  }

  public boolean loginUser (String email, String password) {
    if (model.loginUser(email, password)) {
      System.out.println("success");
      return true;
    }
    else
      return false;
  }

  public ArrayList <Product> getAllProducts () {
    return model.getAllProducts();
  }

  public ArrayList <Product> getProductsWithKeyword(String keyword) {
    return model.getProductsWithKeyword(keyword);
  }

  public ArrayList <Product> getProductsUnderAType (String AType) {
    return model.getProductsUnderAType(AType);
  }

  public ArrayList<Product> getProductsUnderGender (String gender) {
    return model.getProductsUnderGender(gender);
  }

  public User getCurrentUser () {
    return model.getCurrentUser();
  }

}
