import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage primaryStage) {
    TheConnection mainModel = new TheConnection();
    Controller mainController = new Controller(mainModel, primaryStage);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
