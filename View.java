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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.*;

public class View {

  Controller controller;

  Image zaloralogo = new Image("images/zaloraGIF.gif");
  Image continueP = new Image("images/Continue.png");
  Image continuep = new Image("images/ContinueHover.png");
  Image Base = new Image("images/2_Base.png");
  Image Basebar = new Image("images/Basebar.png");
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
  Image clothingIcon = new Image("images/ClothingIcon.png");
  Image ShoesIcon = new Image("images/ShoeIcon.png");
  Image beautyIcon = new Image("images/BeautyIcon.png");
  Image sportsIcon = new Image("images/SportsIcon.png");
  Image bagIcon = new Image("images/BagIcon.png");
  Image accIcon = new Image("images/AccessoriesIcon.png");
  Image apparelbar = new Image("images/ApparelTypeBar.png");
  Image clothingB = new Image("images/ClothingButton.png");
  Image shoesB = new Image("images/ShoesButton.png");
  Image bagsB = new Image("images/BagsButton.png");
  Image accB = new Image("images/AccessoriesButton.png");
  Image beautyB = new Image("images/BeautyButton.png");
  Image sportsB = new Image("images/SportsButton.png");
  Image clothingH = new Image("images/ClothingHover.png");
  Image shoesH = new Image("images/ShoeHover.png");
  Image bagsH = new Image("images/BagsHover.png");
  Image accH = new Image("images/AccessoriesHover.png");
  Image beautyH = new Image("images/BeautyHover.png");
  Image sportsH = new Image("images/SportsHover.png");
  Image male1 = new Image("images/Male.png");
  Image male2 = new Image("images/male2.png");
  Image male3 = new Image("images/male3.png");
  Image female1 = new Image("images/female.png");
  Image female2 = new Image("images/female2.png");
  Image female3 = new Image("images/female3.png");
  
  
  ImageView clothing = new ImageView(clothingIcon);
  ImageView bag = new ImageView(bagIcon);
  ImageView shoes = new ImageView(ShoesIcon);
  ImageView accessories = new ImageView(accIcon);
  ImageView beauty = new ImageView(beautyIcon);
  ImageView sports = new ImageView(sportsIcon);
  ImageView maleButton = new ImageView(male1);
  ImageView femaleButton = new ImageView(female1);
  

  ScrollPane scroll = new ScrollPane();
  StackPane overlap = new StackPane();

  public View (Controller c, Stage primaryStage) {

    controller = c;

    primaryStage.setTitle("Welcome to Zalora!");

    StackPane welcomePage = new StackPane();
	StackPane loginPane = new StackPane();
	StackPane registerPane = new StackPane();
    AnchorPane mainPage = new AnchorPane();

    overlap.getChildren().add(mainPage);
	//scroll.setPrefSize(1280, 1280);
	//scroll.setFitToWidth(false);
	scroll.setContent(overlap);


    Scene welcomeScene = new Scene(welcomePage, 1024, 768);
	Scene loginScene = new Scene(loginPane, 1024, 768);
	Scene registerScene = new Scene(registerPane, 1024, 768);
    Scene mainScene = new Scene (scroll, 1280, 720);



    //Welcome Page
    welcomePage.setStyle("-fx-background-color: #E6E7E7");
    ImageView zaloraGIF = new ImageView(zaloralogo);
    welcomePage.getChildren().add(zaloraGIF);

		//Register Page
		ImageView reg = new ImageView(register);
		ImageView sign = new ImageView(signupHover);
		TextField last_name = new TextField();
		TextField first_name = new TextField();
		TextField email = new TextField();
		TextField password_register = new TextField();
		TextField contact = new TextField();
		contact.setMaxWidth(300);
		email.setMaxWidth(300);
		password_register.setMaxWidth(300);
		last_name.setMaxWidth(150);
		last_name.setPromptText("Last Name");
		first_name.setMaxWidth(150);
		first_name.setPromptText("First Name");
		registerPane.setMargin(last_name, new Insets( 0, 30, 135, 0));
		registerPane.setMargin(first_name, new Insets( 0, 0, 135, 270));
		registerPane.setMargin(email, new Insets(0, 0, 41, 120));
		registerPane.setMargin(password_register, new Insets(57, 0, 0, 120));
		registerPane.setMargin(contact, new Insets(165, 0, 0, 120));
		registerPane.getChildren().add(reg);
		registerPane.getChildren().add(sign);
		registerPane.getChildren().add(last_name);
		registerPane.getChildren().add(first_name);
		registerPane.getChildren().add(email);
		registerPane.getChildren().add(password_register);
		registerPane.getChildren().add(contact);
		registerPane.getChildren().add(maleButton);
		registerPane.getChildren().add(femaleButton);
		maleButton.setOnMouseEntered(e->{
			maleButton.setImage(male2);
		});
		maleButton.setOnMouseExited(e-> {
			maleButton.setImage(male1);
		});
		maleButton.setOnMouseClicked(e->{
			maleButton.setImage(male3);
			femaleButton.setImage(female1);
			maleClick();
		});
		femaleButton.setOnMouseEntered(e->{
			femaleButton.setImage(female2);
		});
		femaleButton.setOnMouseExited(e-> {
			femaleButton.setImage(female1);
		});
		femaleButton.setOnMouseClicked(e->{
			maleButton.setImage(male1);
			femaleButton.setImage(female3);
			femaleClick();
		});
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
		TextField password = new TextField();
		username.setMaxWidth(300);
		password.setMaxWidth(300);
		StackPane.setMargin(username, new Insets(0, 0, 115, 100));
		StackPane.setMargin(password, new Insets( 45, 0, 0, 100));
		loginPane.getChildren().add(log);
		loginPane.getChildren().add(logIn);
		loginPane.getChildren().add(username);
		loginPane.getChildren().add(password);
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
		ImageView barBase = new ImageView(Basebar);
		ImageView zaloraButtonV = new ImageView(zaloraButton);
		ImageView search = new ImageView(searchButton);
		ImageView account = new ImageView(accountButton);
		ImageView cart = new ImageView(cartButton);
		ImageView order = new ImageView(orderButton);
		ImageView apparelType = new ImageView(apparelbar);
		ImageView clothesV = new ImageView(clothingB);
		ImageView shoesV = new ImageView(shoesB);
		ImageView accV = new ImageView(accB);
		ImageView bagsV = new ImageView(bagsB);
		ImageView beautyV = new ImageView(beautyB);
		ImageView sportsV = new ImageView(sportsB);
		TextField searchText = new TextField();
		ComboBox<String> filter = new ComboBox<String>();
		filter.getItems().addAll("Male", "Female", "All Items");
		filter.setPromptText("Filter By");
		filter.setMaxHeight(50);
		filter.setMaxWidth(300);
		filter.setStyle("-fx-accent:rgb(0, 0, 0)");
		filter.setStyle("-fx-font: 20px \"Madeleina Sans Regular\";");
		searchText.setMaxWidth(500);
		searchText.setMaxHeight(45);
		overlap.setMargin(searchText, new Insets(0, 0, 650, 0));
		overlap.setMargin(filter, new Insets(0, 900, 490, 0));
		overlap.getChildren().add(main_scene);
		overlap.getChildren().add(apparelType);
		overlap.getChildren().add(barBase);
		overlap.getChildren().add(zaloraButtonV);
		overlap.getChildren().add(search);
		overlap.getChildren().add(account);
		overlap.getChildren().add(cart);
		overlap.getChildren().add(order);
		overlap.getChildren().add(searchText);
		overlap.getChildren().addAll(clothesV, shoesV, bagsV, accV, sportsV, beautyV);
		overlap.getChildren().add(filter);
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
		clothesV.setOnMouseClicked(e -> {
			ClothesClick();
		});
		clothesV.setOnMouseEntered(e->{
			clothesV.setImage(clothingH);
		});
		clothesV.setOnMouseExited(e->{
			clothesV.setImage(clothingB);
		});
		shoesV.setOnMouseClicked(e -> {
			ShoesClick();
		});
		shoesV.setOnMouseEntered(e->{
			shoesV.setImage(shoesH);
		});
		shoesV.setOnMouseExited(e->{
			shoesV.setImage(shoesB);
		});
		accV.setOnMouseClicked(e->{
			AccessoriesClick();
		});
		accV.setOnMouseEntered(e->{
			accV.setImage(accH);
		});
		accV.setOnMouseExited(e->{
			accV.setImage(accB);
		});
		bagsV.setOnMouseClicked(e ->{
			BagsClick();
		});
		bagsV.setOnMouseEntered(e->{
			bagsV.setImage(bagsH);
		});
		bagsV.setOnMouseExited(e->{
			bagsV.setImage(bagsB);
		});
		beautyV.setOnMouseClicked(e -> {
			BeautyClick();
		});
		beautyV.setOnMouseEntered(e->{
			beautyV.setImage(beautyH);
		});
		beautyV.setOnMouseExited(e->{
			beautyV.setImage(beautyB);
		});
		sportsV.setOnMouseClicked(e-> {
			SportsClick();
		});
		sportsV.setOnMouseEntered(e->{
			sportsV.setImage(sportsH);
		});
		sportsV.setOnMouseExited(e->{
			sportsV.setImage(sportsB);
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
	private void maleClick()
	{
		maleButton.setOnMouseExited(e-> {
			maleButton.setImage(male3);
		});
	}
	
	private void femaleClick()
	{
		femaleButton.setOnMouseExited(e-> {
			femaleButton.setImage(female3);
		});
	}
	
	private void ClothesClick()
	{
		//ClothingIcon
		removeClicks();
		overlap.getChildren().add(clothing);
	}
	
	private void BagsClick()
	{
		//BagIcon
		removeClicks();
		overlap.getChildren().add(bag);
	}
	
	private void ShoesClick()
	{
		//ShoesIcon
		removeClicks();
		overlap.getChildren().add(shoes);
	}
	
	private void AccessoriesClick()
	{
		//AccessoriesIcon
		removeClicks();
		overlap.getChildren().add(accessories);
	}
	
	private void SportsClick()
	{
		//SportsIcon
		removeClicks();
		overlap.getChildren().add(sports);
	}
	
	private void BeautyClick()
	{
		//BeautyIcon
		removeClicks();
		overlap.getChildren().add(beauty);
	}
	
	private void removeClicks()
	{
		overlap.getChildren().removeAll(beauty, sports, accessories, shoes, bag, clothing);
	}
}

	
