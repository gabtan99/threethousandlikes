import javafx.stage.Stage;

public class Controller {
  TheConnection model;
  View view;

  public Controller(TheConnection m, Stage primaryStage) {
    model = m;
    view = new View(this, primaryStage);
  }
}
