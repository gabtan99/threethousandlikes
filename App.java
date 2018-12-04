
/*

javac *.java

Windows:
java -cp "mysql-connector-java-5.1.47-bin.jar;." App

Unix (Mac):
java -cp "mysql-connector-java-5.1.47-bin.jar:." App
*/

import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;

public class App extends Application {
  @Override
  public void start(Stage primaryStage) throws SQLException {
    Database mainModel = new Database();
    Controller mainController = new Controller(mainModel, primaryStage);

  }

  public static void main(String[] args) {
    launch(args);
  }
}
