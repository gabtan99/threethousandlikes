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




    */

  }

  public void showAll() {

    ArrayList<Product> temp = new ArrayList<Product>();
    temp = model.getAllProducts(stmt);
    for (int i = 0; i < temp.size(); i++) {
      System.out.println(temp.get(i).getProduct_name() + temp.get(i).getPrice());
    }

  }

}
