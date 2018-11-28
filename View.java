import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.Shadow;
import javafx.scene.effect.Bloom;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import java.awt.Toolkit;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;
import javafx.stage.WindowEvent;
import java.util.Optional;
import javafx.scene.control.ButtonType;
import java.util.Date;
import javafx.scene.layout.Region;
import java.io.File;
import java.net.URI;
import java.net.URL;
import javafx.util.Duration;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;


public class View extends Application {

  Image zaloralogo = new Image("images/zaloraGIF.gif");
  Image continueP = new Image ("images/Continue.png");
  Image continuep = new Image ("images/ContinueHover.png");


    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Welcome to Zalora!");

        StackPane welcomePage = new StackPane();
        StackPane overlap = new StackPane();
        AnchorPane mainPage = new AnchorPane();

        overlap.getChildren().add(mainPage);

        Scene welcomeScene = new Scene(welcomePage, 1024, 768);
        Scene mainScene = new Scene (overlap, 1280, 720);



        //Welcome Page
        welcomePage.setStyle("-fx-background-color: #E6E7E7");
        ImageView zaloraGIF = new ImageView(zaloralogo);
        welcomePage.getChildren().add(zaloraGIF);

        ImageView continueIMG = new ImageView (continuep);
        continueIMG.setOnMouseClicked(e -> {
          primaryStage.setScene(mainScene);

          // centers the stage to the mid of the screen
          Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
          primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
          primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);


        });
        continueIMG.setOnMouseEntered(e -> {
          continueIMG.setImage(continueP);
        });
        continueIMG.setOnMouseExited(e -> {
          continueIMG.setImage(continuep);
        });

        welcomePage.getChildren().add(continueIMG);
        /////
        //Main Screen









        primaryStage.setScene(welcomeScene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
