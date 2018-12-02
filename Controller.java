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

  public boolean registerUser(String email, String password, String last_name, String first_name, String contact_number) {
    if (model.registerUser(email, password, first_name, last_name, contact_number, "M"))
      return true;
    else
      return false;
  }

}
