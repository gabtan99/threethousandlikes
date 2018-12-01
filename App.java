
/*

javac *.java

Windows:
java -cp "mysql-connector-java-5.1.47-bin.jar;." App

Unix (Mac):
java -cp "mysql-connector-java-5.1.47-bin.jar:." App
*/

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage primaryStage) throws ClassNotFoundException {
    TheConnection mainModel = new TheConnection();
    Controller mainController = new Controller(mainModel, primaryStage);

  }

  public static void main(String[] args) {
    launch(args);
  }
}
