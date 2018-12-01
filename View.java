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


public class View {

  Controller controller;

  Image zaloralogo = new Image("images/zaloraGIF.gif");
  Image continueP = new Image("images/Continue.png");
  Image continuep = new Image("images/ContinueHover.png");
  Image Base = new Image("images/2_Base.png");
  Image zaloraButton = new Image("images/2_ZaloraButton.png");
  Image zaloraHover = new Image("images/2_ZaloraHover.png");
  Image searchButton = new Image("images/2_SearchButton.png");
  Image searchHover = new Image("images/2_SearchHover.png");
  Image accountButton = new Image("images/2_AccountButton.png");
  Image accountHover = new Image("images/2_AccountHover.png");
  Image cartButton = new Image("images/2_CartButton.png");
  Image cartHover = new Image("images/2_CartHover.png");
  Image orderButton = new Image("images/2_OrderButton.png");
  Image orderHover = new Image("images/2_OrderHover.png");
  Image login = new Image("images/LogIn.png");
  Image loginButton = new Image("images/LogInButton1.png");
  Image loginHover = new Image("images/LogInButton2.png");
  Image registerButton = new Image("images/RegisterButton1.png");
  Image registerHover = new Image("images/RegisterButton2.png");
  Image register = new Image("images/Register.png");
  Image signup = new Image("images/SignUp.png");
  Image signupHover = new Image("images/SignUp2.png");


  public View (Controller c, Stage primaryStage) {

    controller = c;

    primaryStage.setTitle("Welcome to Zalora!");

    StackPane welcomePage = new StackPane();
    StackPane overlap = new StackPane();
	StackPane loginPane = new StackPane();
	StackPane registerPane = new StackPane();
    AnchorPane mainPage = new AnchorPane();

    overlap.getChildren().add(mainPage);

    Scene welcomeScene = new Scene(welcomePage, 1024, 768);
	Scene loginScene = new Scene(loginPane, 1024, 768);
	Scene registerScene = new Scene(registerPane, 1024, 768);
    Scene mainScene = new Scene (overlap, 1280, 720);



    //Welcome Page
    welcomePage.setStyle("-fx-background-color: #E6E7E7");
    ImageView zaloraGIF = new ImageView(zaloralogo);
    welcomePage.getChildren().add(zaloraGIF);

		//Register Page
		ImageView reg = new ImageView(register);
		ImageView sign = new ImageView(signupHover);
		registerPane.getChildren().add(reg);
		registerPane.getChildren().add(sign);
		sign.setOnMouseClicked(e->{
			primaryStage.setScene(loginScene);
		});
		sign.setOnMouseEntered(e -> {
			sign.setImage(signup);
		});
		sign.setOnMouseExited(e->{
			sign.setImage(signupHover);
		});
	
		//Log-in Page
		ImageView log = new ImageView(login);
		ImageView logIn = new ImageView(loginHover);
		ImageView register = new ImageView(registerHover);
		TextField username = new TextField();
		username.setWidth(10);
		loginPane.getChildren().add(log);
		loginPane.getChildren().add(logIn);
		loginPane.getChildren().add(username);
		loginPane.getChildren().add(register);
		logIn.setOnMouseClicked(e->{
			primaryStage.setScene(mainScene);
			// centers the stage to the mid of the screen
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
		primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		});
		logIn.setOnMouseEntered(e->{
			logIn.setImage(loginButton);
		});
		logIn.setOnMouseExited(e->{
			logIn.setImage(loginHover);
		});
		register.setOnMouseClicked(e->{
			primaryStage.setScene(registerScene);
		});
		register.setOnMouseEntered(e->{
			register.setImage(registerButton);
		});
		register.setOnMouseExited(e-> {
			register.setImage(registerHover);
		});
		

		//Home Page
		ImageView main_scene = new ImageView(Base);
		ImageView zaloraButtonV = new ImageView(zaloraButton);
		ImageView search = new ImageView(searchButton);
		ImageView account = new ImageView(accountButton);
		ImageView cart = new ImageView(cartButton);
		ImageView order = new ImageView(orderButton);
		overlap.getChildren().add(main_scene);
		overlap.getChildren().add(zaloraButtonV);
		overlap.getChildren().add(search);
		overlap.getChildren().add(account);
		overlap.getChildren().add(cart);
		overlap.getChildren().add(order);
		zaloraButtonV.setOnMouseEntered(e -> {
			zaloraButtonV.setImage(zaloraHover);
		});
		zaloraButtonV.setOnMouseExited(e -> {
			zaloraButtonV.setImage(zaloraButton);
		});
		search.setOnMouseEntered(e -> {
			search.setImage(searchHover);
		});
		search.setOnMouseExited(e -> {
			search.setImage(searchButton);
		});
		account.setOnMouseEntered(e->{
			account.setImage(accountHover);
		});
		account.setOnMouseExited(e->{
			account.setImage(accountButton);
		});
		cart.setOnMouseEntered(e -> {
			cart.setImage(cartHover);
		});
		cart.setOnMouseExited(e -> {
			cart.setImage(cartButton);
		});
		order.setOnMouseEntered(e -> {
			order.setImage(orderHover);
		});
		order.setOnMouseExited(e-> {
			order.setImage(orderButton);
		});


    ImageView continueIMG = new ImageView (continuep);
    continueIMG.setOnMouseClicked(e -> {
		primaryStage.setScene(loginScene);
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
