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
import javafx.scene.control.PasswordField;
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
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.*;

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
  Image clothingIcon = new Image("images/ClothesIcon.png");
  Image ShoesIcon = new Image("images/ShoesIcon.png");
  Image beautyIcon = new Image("images/BeautIcon.png");
  Image sportsIcon = new Image("images/SportIcon.png");
  Image bagIcon = new Image("images/BagsIcon.png");
  Image accIcon = new Image("images/AccIcon.png");
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
  Image logout = new Image("images/Logout.png");
  Image logout2 = new Image("images/Logout2.png");
  Image clothingSet = new Image("images/ClothingSet.png");
  Image shoeSet = new Image("images/ShoeSet.png");
  Image sportSet = new Image("images/SportSet.png");
  Image beautySet = new Image("images/BeautySet.png");
  Image bagSet = new Image("images/BagSet.png");
  Image accSet = new Image("images/AccessoriesSet.png");
  Image bars = new Image("images/Bars.png");
  Image checkout = new Image("images/CheckOut.png");
  Image checkout2 = new Image("images/CheckOut2.png");
  Image back = new Image("images/backButton.png");
  Image back2 = new Image("images/backHover.png");
  Image brand = new Image("images/2_BrandButton.png");
  Image brand2 = new Image("images/2_BrandHover.png");
  Image men = new Image("images/menButton.png");
  Image men2 = new Image("images/menHover.png");
  Image women = new Image("images/womenButton.png");
  Image women2 = new Image("images/womenHover.png");
  Image admin = new Image("images/Admin.png");
  Image admin2 = new Image("images/AdminButton.png");
  Image adminBar = new Image("images/adminBars.png");
  Image userB = new Image("images/userButton.png");
  Image userH = new Image("images/userHover.png");
  Image orderB = new Image("images/orderButton.png");
  Image orderH = new Image("images/orderHover.png");
  Image brandB = new Image("images/brandsButton.png");
  Image brandH = new Image("images/brandsHover.png");
  Image summaryB = new Image("images/summaryButton.png");
  Image summaryH = new Image("images/summaryHover.png");
  Image productB = new Image("images/productsButton.png");
  Image productH = new Image("images/productsHover.png");
  Image edit = new Image("images/Edit.png");
  Image editH = new Image("images/EditHover.png");
  Image add = new Image("images/Add2.png");
  Image addH = new Image("images/Add.png");

  ImageView clothing = new ImageView(clothingIcon);
  ImageView bag = new ImageView(bagIcon);
  ImageView shoes = new ImageView(ShoesIcon);
  ImageView accessories = new ImageView(accIcon);
  ImageView beauty = new ImageView(beautyIcon);
  ImageView sports = new ImageView(sportsIcon);
  ImageView maleButton = new ImageView(male1);
  ImageView femaleButton = new ImageView(female1);
  ImageView out = new ImageView(logout);
  ImageView account = new ImageView(accountButton);
  ImageView setClothing = new ImageView(clothingSet);
  ImageView setClothing2 = new ImageView(clothingSet);
  ImageView setBeauty = new ImageView(beautySet);
  ImageView setBeauty2 = new ImageView(beautySet);
  ImageView setBag = new ImageView(bagSet);
  ImageView setBag2 = new ImageView(bagSet);
  ImageView setShoes = new ImageView(shoeSet);
  ImageView setShoes2 = new ImageView(shoeSet);
  ImageView setAcc = new ImageView(accSet);
  ImageView setAcc2 = new ImageView(accSet);
  ImageView setSport = new ImageView(sportSet);
  ImageView setSport2 = new ImageView(sportSet);
  ImageView barsV = new ImageView(bars);
  ImageView barsV2 = new ImageView(bars);
  ImageView ViewBase = new ImageView(Base);
  ImageView checkOutV = new ImageView(checkout);
  ImageView backV = new ImageView(back);
  ImageView reg = new ImageView(register);
  ImageView sign = new ImageView(signupHover);
  ImageView log = new ImageView(login);
  ImageView logInV = new ImageView(loginHover);
  ImageView registerV = new ImageView(registerHover);
  ImageView barBase = new ImageView(Basebar);
  ImageView zaloraButtonV = new ImageView(zaloraButton);
  ImageView search = new ImageView(searchButton);
  ImageView cart = new ImageView(cartButton);
  ImageView order = new ImageView(orderButton);
  ImageView apparelType = new ImageView(apparelbar);
  ImageView clothesV = new ImageView(clothingB);
  ImageView shoesV = new ImageView(shoesB);
  ImageView accV = new ImageView(accB);
  ImageView bagsV = new ImageView(bagsB);
  ImageView beautyV = new ImageView(beautyB);
  ImageView sportsV = new ImageView(sportsB);
  ImageView zaloraGIF = new ImageView(zaloralogo);
  ImageView continueIMG = new ImageView(continuep);
  ImageView brandV = new ImageView(brand);
  ImageView menV = new ImageView(men);
  ImageView womenV = new ImageView(women);
  ImageView adminV = new ImageView(admin);
  ImageView adminBarV = new ImageView(adminBar);
  ImageView summaryV = new ImageView(summaryB);
  ImageView orderV = new ImageView(orderB);
  ImageView userV = new ImageView(userB);
  ImageView brandView = new ImageView(brandB);
  ImageView productV = new ImageView(productB);
  ImageView editV = new ImageView(edit);
  ImageView editT = new ImageView(edit);
  ImageView editT2 = new ImageView(edit);
  ImageView addV = new ImageView(add);
  ImageView addV2 = new ImageView(add);

  VBox vertical = new VBox();
  VBox adminPane = new VBox();
  StackPane welcomePage = new StackPane();
  StackPane loginPane = new StackPane();
  AnchorPane accountPage = new AnchorPane();
  VBox orderHistoryPage = new VBox();
  VBox brandPage = new VBox();
  ScrollPane scrollpane = new ScrollPane();
  StackPane registerPane = new StackPane();
  StackPane menu = new StackPane();
  String selectedgender = null;
  ImageView[] productpic;
  AnchorPane[] productpane;
  Text month;
  Text[] productname;
  Text[] productprice;
  Text[] productclassify;
  Text[] productorderquantity;
  Text[] OlapQuantity;
  Text[] OlapMonth;
  TextFlow[] producttextflow;
  TextField[] productquantity;
  Button[] productaddbutton;
  Button[] productremovebutton;
  Text[] orderdetails;
  TilePane[] productgrid;
  Scene loginScene;
  Stage primaryStage;
  TextFlow[] brandtextflow;
  Text[] brandname;
  Button[] brandviewprod;
  String getUserDetails = new String();

  public View(Controller c, Stage primaryStage) {

    this.primaryStage = primaryStage;

    controller = c;
    primaryStage.setTitle("Welcome to Zalora!");

    vertical.getChildren().add(menu);

    Scene welcomeScene = new Scene(welcomePage, 1024, 768);
    loginScene = new Scene(loginPane, 1024, 768);
    Scene registerScene = new Scene(registerPane, 1024, 768);
    Scene mainScene = new Scene(vertical, 1280, 720);

    ////////////WELCOME PAGE (CONTINUE BUTTON)//////////////////
    welcomePage.setStyle("-fx-background-color: #E6E7E7");

    continueIMG.setOnMouseClicked(e -> {
      primaryStage.setScene(loginScene);
    });

    welcomePage.getChildren().add(zaloraGIF);
    welcomePage.getChildren().add(continueIMG);

    //////////////////LOGIN PAGE////////////////////////
    TextField username = new TextField();
    PasswordField password = new PasswordField();

    username.setMaxWidth(300);
    password.setMaxWidth(300);

    logInV.setOnMouseClicked(e -> {
      if (controller.loginUser(username.getText(), password.getText())) {

        primaryStage.setScene(mainScene);
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);

        clearPage();
        viewAllProductsPage();
      } else {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Action Can't be Done");
        alert.setHeaderText("Incorrect Email/Password");
        alert.setContentText("Please enter a valid Email and/or Password");

        alert.showAndWait();
      }
    });

    registerV.setOnMouseClicked(e -> {
      primaryStage.setScene(registerScene);
    });
    adminV.setOnMouseClicked(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent me) {
        AnchorPane promptPane = new AnchorPane();
        Scene promptScene = new Scene(promptPane, 300, 300);
        Stage subStage = new Stage();
        subStage.setTitle("Admin Password");
        PasswordField passed = new PasswordField();
        Text passwordText = new Text("Password: ");
        Button confirmpw = new Button("Confirm");
        passwordText.setFont(Font.font("Madeleina Sans", 20));

        confirmpw.setOnMousePressed(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            if (passed.getText().equals("password"))
              AdminCall();
            subStage.close();
          }
        });

        passed.setMaxWidth(220);
        promptPane.getChildren().add(passed);
        promptPane.getChildren().add(passwordText);
        promptPane.getChildren().add(confirmpw);

        //promptPane.setLeftAnchor(pw, 50.0);
        AnchorPane.setBottomAnchor(passwordText, 180.0);
        AnchorPane.setLeftAnchor(passwordText, 70.0);
        AnchorPane.setTopAnchor(passed, 130.0);
        AnchorPane.setLeftAnchor(passed, 70.0);
        AnchorPane.setLeftAnchor(confirmpw, 110.0);
        AnchorPane.setTopAnchor(confirmpw, 200.0);

        subStage.setScene(promptScene);
        subStage.show();
      }
    });
    adminV.setOnMouseEntered(e -> {
      adminV.setImage(admin2);
    });
    adminV.setOnMouseExited(e -> {
      adminV.setImage(admin);
    });

    StackPane.setMargin(username, new Insets(0, 0, 115, 100));
    StackPane.setMargin(password, new Insets(45, 0, 0, 100));

    loginPane.getChildren().add(log);
    loginPane.getChildren().add(logInV);
    loginPane.getChildren().add(username);
    loginPane.getChildren().add(password);
    loginPane.getChildren().add(registerV);
    loginPane.getChildren().add(adminV);

    ////////////////// REGISTER PAGE ///////////////////////
    TextField last_name = new TextField();
    TextField first_name = new TextField();
    TextField email = new TextField();
    PasswordField password_register = new PasswordField();
    TextField contact = new TextField();

    contact.setMaxWidth(300);
    email.setMaxWidth(300);
    password_register.setMaxWidth(300);
    last_name.setMaxWidth(150);
    last_name.setPromptText("Last Name");
    first_name.setMaxWidth(150);
    first_name.setPromptText("First Name");

    backV.setOnMouseClicked(e -> {
      primaryStage.setScene(loginScene);
    });

    maleButton.setOnMouseClicked(e -> {
      selectedgender = "M";
      maleButton.setImage(male3);
      femaleButton.setImage(female1);
      maleClick();
    });

    femaleButton.setOnMouseClicked(e -> {
      selectedgender = "F";
      maleButton.setImage(male1);
      femaleButton.setImage(female3);
      femaleClick();
    });

    sign.setOnMouseClicked(e -> {
      if (!(email.getText().equals("") || password_register.getText().length() < 6 || last_name.getText().equals("")
          || first_name.getText().equals("") || contact.getText().length() != 11)) {
        if (controller.registerUser(email.getText(), password_register.getText(), last_name.getText(),
            first_name.getText(), contact.getText().toString(), selectedgender))
          primaryStage.setScene(loginScene);
      }
    });

    StackPane.setMargin(last_name, new Insets(0, 30, 135, 0));
    StackPane.setMargin(first_name, new Insets(0, 0, 135, 270));
    StackPane.setMargin(email, new Insets(0, 0, 41, 120));
    StackPane.setMargin(password_register, new Insets(57, 0, 0, 120));
    StackPane.setMargin(contact, new Insets(165, 0, 0, 120));
    registerPane.getChildren().add(reg);
    registerPane.getChildren().add(sign);
    registerPane.getChildren().add(last_name);
    registerPane.getChildren().add(first_name);
    registerPane.getChildren().add(email);
    registerPane.getChildren().add(password_register);
    registerPane.getChildren().add(contact);
    registerPane.getChildren().add(maleButton);
    registerPane.getChildren().add(femaleButton);
    registerPane.getChildren().add(backV);

    ///////////////// HOME PAGE ////////////////////

    TextField searchText = new TextField();
    searchText.setMaxWidth(500);
    searchText.setMaxHeight(45);

    StackPane.setMargin(searchText, new Insets(0, 150, 70, 0));
    StackPane.setMargin(search, new Insets(0, 0, 49, 420));

    menu.setStyle("-fx-background-color: #E6E7E7");
    menu.getChildren().add(barsV);
    menu.getChildren().add(zaloraButtonV);
    menu.getChildren().add(search);
    menu.getChildren().add(account);
    menu.getChildren().add(cart);
    menu.getChildren().add(order);
    menu.getChildren().add(searchText);
    menu.getChildren().add(brandV);
    menu.getChildren().addAll(clothesV, shoesV, bagsV, beautyV, accV, sportsV, menV, womenV);

    //////////////// BUTTONS ////////////////////

    zaloraButtonV.setOnMouseClicked(e -> {
      clearPage();
      viewAllProductsPage();
    });

    search.setOnMouseClicked(e -> {
      clearPage();
      viewProductsWithKeyword(searchText.getText());
    });

    account.setOnMouseClicked(e -> {
      clearPage();
      viewAccountPage();
    });

    cart.setOnMouseClicked(e -> {
      clearPage();
      viewMyCart();
    });

    order.setOnMouseClicked(e -> {
      clearPage();
      viewOrderHistory();
    });

    clothesV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Clothing");
    });

    shoesV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Shoes");
    });

    accV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Accessories");
    });

    bagsV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Bags");
    });

    beautyV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Beauty");
    });

    sportsV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsUnderAType("Sports");
    });

    menV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsForMen();
    });

    womenV.setOnMouseClicked(e -> {
      clearPage();
      viewProductsForWomen();
    });

    brandV.setOnMouseClicked(e -> {
      clearPage();
      viewAllBrands();
    });

    ////////////////////////////////////////////////////////
    brandV.setOnMouseEntered(e -> {
      brandV.setImage(brand2);
    });
    brandV.setOnMouseExited(e -> {
      brandV.setImage(brand);
    });
    menV.setOnMouseEntered(e -> {
      menV.setImage(men2);
    });
    menV.setOnMouseExited(e -> {
      menV.setImage(men);
    });

    womenV.setOnMouseEntered(e -> {
      womenV.setImage(women2);
    });
    womenV.setOnMouseExited(e -> {
      womenV.setImage(women);
    });

    sportsV.setOnMouseEntered(e -> {
      sportsV.setImage(sportsH);
    });

    sportsV.setOnMouseExited(e -> {
      sportsV.setImage(sportsB);
    });

    beautyV.setOnMouseEntered(e -> {
      beautyV.setImage(beautyH);
    });

    beautyV.setOnMouseExited(e -> {
      beautyV.setImage(beautyB);
    });

    bagsV.setOnMouseEntered(e -> {
      bagsV.setImage(bagsH);
    });

    bagsV.setOnMouseExited(e -> {
      bagsV.setImage(bagsB);
    });

    accV.setOnMouseEntered(e -> {
      accV.setImage(accH);
    });

    accV.setOnMouseExited(e -> {
      accV.setImage(accB);
    });

    shoesV.setOnMouseEntered(e -> {
      shoesV.setImage(shoesH);
    });

    shoesV.setOnMouseExited(e -> {
      shoesV.setImage(shoesB);
    });

    clothesV.setOnMouseEntered(e -> {
      clothesV.setImage(clothingH);
    });

    clothesV.setOnMouseExited(e -> {
      clothesV.setImage(clothingB);
    });

    order.setOnMouseEntered(e -> {
      order.setImage(orderHover);
    });

    order.setOnMouseExited(e -> {
      order.setImage(orderButton);
    });

    cart.setOnMouseEntered(e -> {
      cart.setImage(cartHover);
    });

    cart.setOnMouseExited(e -> {
      cart.setImage(cartButton);
    });

    account.setOnMouseEntered(e -> {
      account.setImage(accountHover);
    });

    account.setOnMouseExited(e -> {
      account.setImage(accountButton);
    });

    search.setOnMouseEntered(e -> {
      search.setImage(searchHover);
    });

    search.setOnMouseExited(e -> {
      search.setImage(searchButton);
    });

    zaloraButtonV.setOnMouseEntered(e -> {
      zaloraButtonV.setImage(zaloraHover);
    });

    zaloraButtonV.setOnMouseExited(e -> {
      zaloraButtonV.setImage(zaloraButton);
    });

    sign.setOnMouseEntered(e -> {
      sign.setImage(signup);
    });

    sign.setOnMouseExited(e -> {
      sign.setImage(signupHover);
    });

    femaleButton.setOnMouseExited(e -> {
      femaleButton.setImage(female1);
    });

    femaleButton.setOnMouseEntered(e -> {
      femaleButton.setImage(female2);
    });

    maleButton.setOnMouseEntered(e -> {
      maleButton.setImage(male2);
    });

    maleButton.setOnMouseExited(e -> {
      maleButton.setImage(male1);
    });

    backV.setOnMouseEntered(e -> {
      backV.setImage(back2);
    });

    backV.setOnMouseExited(e -> {
      backV.setImage(back);
    });

    registerV.setOnMouseEntered(e -> {
      registerV.setImage(registerButton);
    });

    registerV.setOnMouseExited(e -> {
      registerV.setImage(registerHover);
    });

    logInV.setOnMouseEntered(e -> {
      logInV.setImage(loginButton);
    });

    logInV.setOnMouseExited(e -> {
      logInV.setImage(loginHover);
    });

    continueIMG.setOnMouseEntered(e -> {
      continueIMG.setImage(continueP);
    });

    continueIMG.setOnMouseExited(e -> {
      continueIMG.setImage(continuep);
    });

    ///////////// SET DEFAULT SCENE /////////////
    primaryStage.setScene(welcomeScene);
    primaryStage.setResizable(false);
    primaryStage.show();

  }

  private void maleClick() {
    maleButton.setOnMouseExited(e -> {
      maleButton.setImage(male3);
    });
  }

  private void femaleClick() {
    femaleButton.setOnMouseExited(e -> {
      femaleButton.setImage(female3);
    });
  }

  private void clearPage() {
    if (vertical.getChildren().size() > 1)
      vertical.getChildren().remove(1);
  }

  private void viewAccountPage() {

    if (accountPage.getChildren().size() != 0) {
      accountPage.getChildren().clear();
    }

    Text name_text = new Text(40, 50, "Name: ");
    Text register_text = new Text(10, 50, "Register Date: ");
    Text contact_text = new Text(10, 50, "Contact Number: ");
    Text sex_text = new Text(10, 50, "Sex: ");
    name_text.setFont(Font.font("Madeleina Sans", 40));
    register_text.setFont(Font.font("Madeleina Sans", 40));
    contact_text.setFont(Font.font("Madeleina Sans", 40));
    sex_text.setFont(Font.font("Madeleina Sans", 40));

    getUserDetails = controller.getCurrentUser().getFirst_name() + " " + controller.getCurrentUser().getLast_name();
    getUserDetails = getUserDetails + "\n" + controller.getCurrentUser().getRegister_date();
    getUserDetails = getUserDetails + "\n" + controller.getCurrentUser().getContact_number();
    getUserDetails = getUserDetails + "\n" + controller.getCurrentUser().getGender();

    Label userDetails = new Label(getUserDetails);
    userDetails.setFont(new Font("Madeleina Sans", 40));

    out.setOnMousePressed(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent e) {
        controller.logoutUser();
        primaryStage.setScene(loginScene);
      }
    });
    out.setOnMouseEntered(e -> {
      out.setImage(logout2);
    });
    out.setOnMouseExited(e -> {
      out.setImage(logout);
    });
    editV.setOnMouseClicked(e -> {
      editAccount();
    });
    editV.setOnMouseEntered(e -> {
      editV.setImage(editH);
    });
    editV.setOnMouseExited(e -> {
      editV.setImage(edit);
    });
    out.setFitHeight(32);
    out.setFitWidth(146);
    editV.setFitHeight(32);
    editV.setFitWidth(146);
    accountPage.getChildren().add(userDetails);
    accountPage.getChildren().add(name_text);
    accountPage.getChildren().add(register_text);
    accountPage.getChildren().add(contact_text);
    accountPage.getChildren().add(sex_text);
    accountPage.getChildren().add(out);
    accountPage.getChildren().add(editV);
    AnchorPane.setTopAnchor(out, 300.0);
    AnchorPane.setTopAnchor(name_text, 147.0);
    AnchorPane.setTopAnchor(register_text, 197.0);
    AnchorPane.setTopAnchor(contact_text, 247.0);
    AnchorPane.setTopAnchor(sex_text, 297.0);
    AnchorPane.setTopAnchor(userDetails, 150.0);
    AnchorPane.setLeftAnchor(userDetails, 600.0);
    AnchorPane.setLeftAnchor(name_text, 452.0);
    AnchorPane.setLeftAnchor(register_text, 349.0);
    AnchorPane.setLeftAnchor(contact_text, 300.0);
    AnchorPane.setLeftAnchor(sex_text, 483.0);
    AnchorPane.setLeftAnchor(out, 500.0);
    AnchorPane.setTopAnchor(out, 400.0);
    AnchorPane.setLeftAnchor(editV, 700.0);
    AnchorPane.setTopAnchor(editV, 400.0);
    vertical.getChildren().add(accountPage);
  }

  private void viewAllProductsPage() {

    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getAllProducts().size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productprice = new Text[count];
    productclassify = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getAllProducts().get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getAllProducts().get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getAllProducts().get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getAllProducts().get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getAllProducts().get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getAllProducts().get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getAllProducts().get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getAllProducts().get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getAllProducts().get(n).getProduct_id(), q))
            System.out.print("Added");

        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewProductsWithKeyword(String keyword) {
    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getProductsWithKeyword(keyword).size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    productprice = new Text[count];
    productclassify = new Text[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsWithKeyword(keyword).get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getProductsWithKeyword(keyword).get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getProductsWithKeyword(keyword).get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getProductsWithKeyword(keyword).get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getProductsWithKeyword(keyword).get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getProductsWithKeyword(keyword).get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getProductsWithKeyword(keyword).get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getProductsWithKeyword(keyword).get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getProductsWithKeyword(keyword).get(n).getProduct_id(), q))
            System.out.print("Added");
        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewProductsUnderAType(String AType) {
    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getProductsUnderAType(AType).size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productprice = new Text[count];
    productclassify = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsUnderAType(AType).get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getProductsUnderAType(AType).get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getProductsUnderAType(AType).get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getProductsUnderAType(AType).get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getProductsUnderAType(AType).get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getProductsUnderAType(AType).get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getProductsUnderAType(AType).get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getProductsUnderAType(AType).get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getProductsUnderAType(AType).get(n).getProduct_id(), q))
            System.out.print("Added");

        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewOrderHistory() {

    if (orderHistoryPage.getChildren().size() != 0) {
      orderHistoryPage.getChildren().clear();
    }

    int n = controller.getOrderHistory().size();

    orderdetails = new Text[n];

    productgrid = new TilePane[n];

    for (int i = 0; i < n; i++) {
      String getOrderHistory = "Order ID: " + controller.getOrderHistory().get(i).getOrder_id();
      getOrderHistory = getOrderHistory + "\nPayment Method: "
          + controller.getOrderHistory().get(i).getPayment_method();
      getOrderHistory = getOrderHistory + "\nShipping Address: "
          + controller.getOrderHistory().get(i).getShipping_address();
      getOrderHistory = getOrderHistory + "\nBilling Address: "
          + controller.getOrderHistory().get(i).getBilling_address();
      getOrderHistory = getOrderHistory + "\nOrder Date: " + controller.getOrderHistory().get(i).getOrder_date();
      getOrderHistory = getOrderHistory + "\nTotal: " + controller.getOrderHistory().get(i).getTotal_amount();

      orderdetails[i] = new Text(getOrderHistory);
      orderdetails[i].setFont(Font.font("Madeleina Sans", 25));
      orderHistoryPage.getChildren().add(orderdetails[i]);

      ////////////////////////////////

      productgrid[i] = new TilePane();

      productgrid[i].setStyle("-fx-border-color: #E6E7E7");
      productgrid[i].setPrefColumns(3);
      productgrid[i].setHgap(20);
      productgrid[i].setVgap(50);

      ArrayList<Product> prod = new ArrayList<Product>();

      int order_id = controller.getOrderHistory().get(i).getOrder_id();

      prod = controller.getProductsInOrder(order_id);

      int count = prod.size();

      productpane = new AnchorPane[count];
      productpic = new ImageView[count];
      producttextflow = new TextFlow[count];
      productname = new Text[count];
      productorderquantity = new Text[count];

      for (int j = 0; j < count; j++) {

        productname[j] = new Text(prod.get(j).getProduct_name());
        productname[j].setFont(Font.font("Madeleina Sans", 20));

        producttextflow[j] = new TextFlow(productname[j]);
        producttextflow[j].setPrefWidth(190);

        if (prod.get(j).getApparel_type().equals("Clothing"))
          productpic[j] = new ImageView(clothingIcon);
        else if (prod.get(j).getApparel_type().equals("Shoes"))
          productpic[j] = new ImageView(ShoesIcon);
        else if (prod.get(j).getApparel_type().equals("Bags"))
          productpic[j] = new ImageView(bagIcon);
        else if (prod.get(j).getApparel_type().equals("Accessories"))
          productpic[j] = new ImageView(accIcon);
        else if (prod.get(j).getApparel_type().equals("Sports"))
          productpic[j] = new ImageView(sportsIcon);
        else
          productpic[j] = new ImageView(beautyIcon);

        productpic[j].setFitWidth(200);
        productpic[j].setFitHeight(200);

        String q = "Qty: ";
        q = q + Integer.toString(prod.get(j).getQuantity()) + "\n";
        productorderquantity[j] = new Text(q);
        productorderquantity[j].setFont(Font.font("Madeleina Sans", 20));

        productpane[j] = new AnchorPane();

        productpane[j].getChildren().add(productpic[j]);
        productpane[j].getChildren().add(producttextflow[j]);
        productpane[j].getChildren().add(productorderquantity[j]);

        AnchorPane.setTopAnchor(producttextflow[j], 210.0);
        AnchorPane.setTopAnchor(productorderquantity[j], 255.0);
        AnchorPane.setRightAnchor(productorderquantity[j], 70.0);

        productgrid[i].getChildren().add(productpane[j]);
      }

      orderHistoryPage.getChildren().add(productgrid[i]);
      /////////////////////////////////////
    }

    scrollpane.setContent(orderHistoryPage);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
    vertical.getChildren().add(scrollpane);
  }

  private void viewMyCart() {

    TilePane grid = new TilePane();
    AnchorPane cartPane = new AnchorPane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getCurrentCart().size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productaddbutton = new Button[count];
    productremovebutton = new Button[count];
    productorderquantity = new Text[count];

    ComboBox<String> payment = new ComboBox<String>();
    payment.getItems().addAll("Cash On Delivery", "Credit Card/Debit Card", "Wallet Credit", "E-Gift Card", "Paypal");
    payment.setPromptText("Select Payment Method");
    payment.setMaxHeight(40);
    payment.setMaxWidth(200);
    Text ship = new Text("Shipping Address:");
    Text bill = new Text("Billing Address:");
    Text total = new Text("TOTAL:");
    Text cartTotal = new Text(" " + controller.getMyCartTotal());
    TextField ShippingAddress = new TextField();
    TextField BillingAddress = new TextField();
    ShippingAddress.setMaxWidth(540);
    ShippingAddress.setMaxHeight(40);
    BillingAddress.setMaxWidth(540);
    BillingAddress.setMaxHeight(40);
    ship.setFont(Font.font("Madeleina Sans", 25));
    bill.setFont(Font.font("Madeleina Sans", 25));
    total.setFont(Font.font("Madeleina Sans", 35));
    cartTotal.setFont(Font.font("Madeleina Sans", 35));
    AnchorPane.setLeftAnchor(cartTotal, 700.00);
    AnchorPane.setTopAnchor(cartTotal, 400.0);
    AnchorPane.setLeftAnchor(total, 700.0);
    AnchorPane.setTopAnchor(total, 300.0);
    AnchorPane.setLeftAnchor(bill, 700.0);
    AnchorPane.setTopAnchor(bill, 124.0);
    AnchorPane.setLeftAnchor(BillingAddress, 700.0);
    AnchorPane.setTopAnchor(BillingAddress, 150.0);
    AnchorPane.setLeftAnchor(ship, 700.0);
    AnchorPane.setTopAnchor(ship, 60.0);
    AnchorPane.setLeftAnchor(ShippingAddress, 700.0);
    AnchorPane.setTopAnchor(ShippingAddress, 90.0);
    AnchorPane.setLeftAnchor(payment, 700.0);
    AnchorPane.setTopAnchor(payment, 200.0);

    if (controller.getCurrentCart().size() > 0) {
      cartPane.getChildren().add(ship);
      cartPane.getChildren().add(ShippingAddress);
      cartPane.getChildren().add(BillingAddress);
      cartPane.getChildren().add(bill);
      cartPane.getChildren().add(payment);
      cartPane.getChildren().add(total);
      cartPane.getChildren().add(cartTotal);
      cartPane.getChildren().add(checkOutV);

    }
    cartPane.getChildren().add(grid);

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getCurrentCart().get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getCurrentCart().get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getCurrentCart().get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getCurrentCart().get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getCurrentCart().get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getCurrentCart().get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productremovebutton[i] = new Button("Remove");
      productremovebutton[i].setFont(Font.font("Madeleina Sans", 14));
      productremovebutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productremovebutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          if (controller.removeFromCart(controller.getCurrentCart().get(n).getSession_ID())) {
            clearPage();
            viewMyCart();
          }
        }
      });

      String q = "Qty: ";
      q = q + Integer.toString(controller.getCurrentCart().get(i).getQuantity());
      productorderquantity[i] = new Text(q);

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productremovebutton[i]);
      productpane[i].getChildren().add(productorderquantity[i]);

      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productremovebutton[i], 253.0);
      AnchorPane.setRightAnchor(productremovebutton[i], 1.0);
      AnchorPane.setTopAnchor(productorderquantity[i], 255.0);
      AnchorPane.setRightAnchor(productorderquantity[i], 70.0);

      grid.getChildren().add(productpane[i]);
    }

    checkOutV.setOnMouseEntered(e -> {
      checkOutV.setImage(checkout2);
    });
    checkOutV.setOnMouseExited(e -> {
      checkOutV.setImage(checkout);
    });
    checkOutV.setOnMouseClicked(e -> {

      if (!(ShippingAddress.getText().equals("") || BillingAddress.getText().equals(""))) {
        if (controller.checkoutCart(payment.getValue(), ShippingAddress.getText(), BillingAddress.getText())) {
          clearPage();
          viewMyCart();
        }
      }
    });

    AnchorPane.setLeftAnchor(checkOutV, 700.0);
    AnchorPane.setTopAnchor(checkOutV, 500.0);
    scrollpane.setContent(cartPane);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewProductsForMen() {
    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getProductsUnderGender("Men").size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productprice = new Text[count];
    productclassify = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsUnderGender("Men").get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getProductsUnderGender("Men").get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getProductsUnderGender("Men").get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getProductsUnderGender("Men").get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getProductsUnderGender("Men").get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getProductsUnderGender("Men").get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getProductsUnderGender("Men").get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getProductsUnderGender("Men").get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getProductsUnderGender("Men").get(n).getProduct_id(), q))
            System.out.print("Added");

        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewProductsForWomen() {
    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getProductsUnderGender("Women").size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productprice = new Text[count];
    productclassify = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsUnderGender("Women").get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getProductsUnderGender("Women").get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getProductsUnderGender("Women").get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getProductsUnderGender("Women").get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getProductsUnderGender("Women").get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getProductsUnderGender("Women").get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getProductsUnderGender("Women").get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getProductsUnderGender("Women").get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getProductsUnderGender("Women").get(n).getProduct_id(), q))
            System.out.print("Added");

        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void viewAllBrands() {
    int count = controller.getAllBrands().size();

    brandtextflow = new TextFlow[count];
    brandname = new Text[count];
    brandviewprod = new Button[count];

    for (int i = 0; i < count; i++) {

      brandname[i] = new Text(controller.getAllBrands().get(i).getBrand_name() + "\nAddress: "
          + controller.getAllBrands().get(i).getAddress() + "\nEmail: " + controller.getAllBrands().get(i).getEmail()
          + "\nContact Number: " + controller.getAllBrands().get(i).getContact_number());
      brandname[i].setFont(Font.font("Madeleina Sans", 30));

      brandtextflow[i] = new TextFlow(brandname[i]);
      brandtextflow[i].setPrefWidth(400);

      brandviewprod[i] = new Button("View Products");
      brandviewprod[i].setFont(Font.font("Madeleina Sans", 20));
      brandviewprod[i].setStyle("-fx-background-color: #59938B");

      int n = i;

      brandviewprod[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          clearPage();
          viewProductsOfBrand(controller.getAllBrands().get(n).getBrand_id());
        }
      });

      brandPage.getChildren().add(brandtextflow[i]);
      brandPage.getChildren().add(brandviewprod[i]);

    }

    scrollpane.setContent(brandPage);
    vertical.getChildren().add(scrollpane);

  }

  private void viewProductsOfBrand(int brand_id) {

    TilePane grid = new TilePane();

    grid.setStyle("-fx-border-color: #E6E7E7");
    grid.setPrefColumns(3);
    grid.setHgap(20);
    grid.setVgap(50);

    int count = controller.getProductsOfBrand(brand_id).size();

    productpane = new AnchorPane[count];
    productpic = new ImageView[count];
    producttextflow = new TextFlow[count];
    productname = new Text[count];
    productprice = new Text[count];
    productclassify = new Text[count];
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsOfBrand(brand_id).get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));
      productprice[i] = new Text("Php " + controller.getProductsOfBrand(brand_id).get(i).getPrice());
      productprice[i].setFont(Font.font("Madeleina Sans", 20));
      productclassify[i] = new Text(controller.getProductsOfBrand(brand_id).get(i).getClassification());
      productclassify[i].setFont(Font.font("Madeleina Sans", 20));

      producttextflow[i] = new TextFlow(productname[i]);
      producttextflow[i].setPrefWidth(190);

      if (controller.getProductsOfBrand(brand_id).get(i).getApparel_type().equals("Clothing"))
        productpic[i] = new ImageView(clothingIcon);
      else if (controller.getProductsOfBrand(brand_id).get(i).getApparel_type().equals("Shoes"))
        productpic[i] = new ImageView(ShoesIcon);
      else if (controller.getProductsOfBrand(brand_id).get(i).getApparel_type().equals("Bags"))
        productpic[i] = new ImageView(bagIcon);
      else if (controller.getProductsOfBrand(brand_id).get(i).getApparel_type().equals("Accessories"))
        productpic[i] = new ImageView(accIcon);
      else if (controller.getProductsOfBrand(brand_id).get(i).getApparel_type().equals("Sports"))
        productpic[i] = new ImageView(sportsIcon);
      else
        productpic[i] = new ImageView(beautyIcon);

      productpic[i].setFitWidth(200);
      productpic[i].setFitHeight(200);

      productquantity[i] = new TextField();
      productquantity[i].setPrefWidth(40);

      productaddbutton[i] = new Button("Add to Cart");
      productaddbutton[i].setFont(Font.font("Madeleina Sans", 14));
      productaddbutton[i].setStyle("-fx-background-color: #59938B");

      int n = i;
      productaddbutton[i].setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          int q = Integer.parseInt(productquantity[n].getText());
          if (controller.addToCart(controller.getProductsOfBrand(brand_id).get(n).getProduct_id(), q))
            System.out.print("Added");

        }
      });

      productpane[i] = new AnchorPane();

      productpane[i].getChildren().add(productquantity[i]);
      productpane[i].getChildren().add(productpic[i]);
      productpane[i].getChildren().add(productprice[i]);
      productpane[i].getChildren().add(productclassify[i]);
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setBottomAnchor(productclassify[i], 28.0);
      AnchorPane.setLeftAnchor(productclassify[i], 120.0);
      AnchorPane.setBottomAnchor(productprice[i], 28.0);
      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 290.0);
      AnchorPane.setRightAnchor(productquantity[i], 85.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 290.0);
      AnchorPane.setRightAnchor(productaddbutton[i], 1.0);

      grid.getChildren().add(productpane[i]);
    }

    scrollpane.setContent(grid);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

  private void editAccount() {
    StackPane accountPane = new StackPane();
    Scene accountScene = new Scene(accountPane, 400, 400);
    Stage accountStage = new Stage();
    accountStage.setScene(accountScene);

    Button edited = new Button("Confirm");
    TextField firstname = new TextField(controller.getCurrentUser().getFirst_name());
    TextField lastname = new TextField(controller.getCurrentUser().getLast_name());
    TextField email_user = new TextField(controller.getCurrentUser().getEmail());
    PasswordField pw_user = new PasswordField();
    TextField contact_num = new TextField(controller.getCurrentUser().getContact_number());
    TextField sex = new TextField(controller.getCurrentUser().getGender());
    PasswordField confirmpw = new PasswordField();

    firstname.setMaxWidth(150);
    lastname.setMaxWidth(150);
    email_user.setMaxWidth(150);
    pw_user.setMaxWidth(150);
    pw_user.setText(controller.getCurrentUser().getPassword());
    contact_num.setMaxWidth(150);
    sex.setMaxWidth(150);
    confirmpw.setMaxWidth(200);
    confirmpw.setPromptText("Confirm password");

    Text details = new Text("Name: \nEmail: \nPassword: \nContact Number: \nSex: ");
    details.setFont(Font.font("Madeleina Sans", 30));

    accountPane.getChildren().add(details);
    accountPane.getChildren().add(edited);
    accountPane.getChildren().addAll(firstname, lastname, email_user, pw_user, contact_num, sex, confirmpw);

    StackPane.setMargin(details, new Insets(0, 200, 10, 0));
    StackPane.setMargin(edited, new Insets(270, 0, 0, 0));
    StackPane.setMargin(firstname, new Insets(0, 100, 150, 0));
    StackPane.setMargin(lastname, new Insets(0, 0, 150, 200));
    StackPane.setMargin(email_user, new Insets(0, 0, 80, 200));
    StackPane.setMargin(pw_user, new Insets(0, 0, 11, 200));
    StackPane.setMargin(contact_num, new Insets(55, 0, 0, 200));
    StackPane.setMargin(sex, new Insets(120, 0, 0, 200));
    StackPane.setMargin(confirmpw, new Insets(200, 0, 0, 0));

    edited.setOnMousePressed(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent e) {

        if (confirmpw.getText().equals(controller.getCurrentUser().getPassword())
            && !(email_user.getText().equals("") || pw_user.getText().length() < 7 || firstname.getText().equals("")
                || lastname.getText().equals("") || contact_num.getText().length() != 11 || sex.getText().equals(""))) {
          controller.editUser(email_user.getText(), pw_user.getText(), firstname.getText(), lastname.getText(),
              contact_num.getText(), sex.getText());
          accountStage.close();
          vertical.getChildren().remove(accountPage);
          viewAccountPage();
        }
      }
    });

    accountStage.show();
  }
  
  private void AddProducts(){
	  StackPane editPPane = new StackPane();
	  Scene editPScene = new Scene(editPPane, 500, 500);
	  Stage editProductStage = new Stage();
	  
	  Button okay = new Button("Done");
	  Text details = new Text("Name:\nBrand Name:\nPrice:\nClassification:\nApparel Type:");
	  details.setFont(Font.font("Madeleina Sans", 30));
	  TextField p_name = new TextField();
	  TextField brand = new TextField();
	  TextField price = new TextField();
	  TextField classification = new TextField();
	  TextField apparel = new TextField();
	  
	  p_name.setPromptText("Name");
	  brand.setPromptText("Brand Name");
	  price.setPromptText("Price");
	  classification.setPromptText("Classification");
	  apparel.setPromptText("Apparel Type");
	  
	  p_name.setMaxWidth(250);
	  brand.setMaxWidth(250);
	  price.setMaxWidth(250);
	  classification.setMaxWidth(250);
	  apparel.setMaxWidth(250);
	  
	  editPPane.getChildren().add(okay);
	  editPPane.getChildren().add(details);
	  editPPane.getChildren().add(p_name);
	  editPPane.getChildren().add(brand);
	  editPPane.getChildren().add(price);
	  editPPane.getChildren().add(classification);
	  editPPane.getChildren().add(apparel);
	  
	  
	  StackPane.setMargin(details, new Insets(0, 200, 0, 0));
	  StackPane.setMargin(okay, new Insets(200, 0, 0, 0));
	  StackPane.setMargin(p_name, new Insets(0, 0, 130, 200));
	  StackPane.setMargin(brand, new Insets(0, 0, 70, 200));
	  StackPane.setMargin(price, new Insets(0, 0, 0, 200));
	  StackPane.setMargin(classification, new Insets(70, 0, 0, 200));
	  StackPane.setMargin(apparel, new Insets(140, 0, 0, 200));
	  
	  okay.setOnMousePressed(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  controller.addNewProduct(p_name.getText(), brand.getText(), Float.parseFloat(price.getText()), classification.getText(), apparel.getText());
			  System.out.println("lez get this bread");
			  editProductStage.close();
		  }
	  });
	  
	  editProductStage.setScene(editPScene);
	  editProductStage.show();
  }
  
  private void AddBrands(){
	  StackPane editBPane = new StackPane();
	  Scene editBScene = new Scene(editBPane, 500, 500);
	  Stage editBrandStage = new Stage();
	  
	  Button okay = new Button("Done");
	  Text details = new Text("\nBrand Name:\nAddress:\nEmail:\nContact Number:");
	  details.setFont(Font.font("Madeleina Sans", 30));
	  TextField b_name = new TextField();
	  TextField address = new TextField();
	  TextField email = new TextField();
	  TextField contact = new TextField();
	  b_name.setPromptText("Brand Name");
	  address.setPromptText("Address");
	  email.setPromptText("Email");
	  contact.setPromptText("Contact");
	  
	  b_name.setMaxWidth(250);
	  address.setMaxWidth(250);
	  email.setMaxWidth(250);
	  contact.setMaxWidth(250);
	  
	  editBPane.getChildren().add(okay);
	  editBPane.getChildren().add(details);
	  editBPane.getChildren().add(b_name);
	  editBPane.getChildren().add(address);
	  editBPane.getChildren().add(email);
	  editBPane.getChildren().add(contact);
	  
	  
	  StackPane.setMargin(details, new Insets(0, 300, 0, 0));
	  StackPane.setMargin(okay, new Insets(220, 0, 0, 0));
	  StackPane.setMargin(b_name, new Insets(0, 0, 70, 220));
	  StackPane.setMargin(address, new Insets(0, 0, 0, 220));
	  StackPane.setMargin(email, new Insets(70, 0, 0, 220));
	  StackPane.setMargin(contact, new Insets(140, 0, 0, 220));
	  
	  okay.setOnMousePressed(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  controller.addNewBrand(b_name.getText(), address.getText(), email.getText(), contact.getText());
			  editBrandStage.close();
		  }
	  });
	  
	  editBrandStage.setScene(editBScene);
	  editBrandStage.show();  
  }
  
  private void EditBrands(String info){
	  StackPane editBPane = new StackPane();
	  Scene editBScene = new Scene(editBPane, 500, 500);
	  Stage editBrandStage = new Stage();
	  
	  Button okay = new Button("Done");
	  Text details = new Text("Brand ID:\nBrand Name:\nAddress:\nEmail:\nContact Number:");
	  details.setFont(Font.font("Madeleina Sans", 30));
	  TextField b_name = new TextField(controller.getAllBrands().get(Integer.parseInt(info) - 1).getBrand_name());
	  TextField brand = new TextField(""+controller.getAllBrands().get(Integer.parseInt(info)-1).getBrand_id());
	  TextField address = new TextField(""+controller.getAllBrands().get(Integer.parseInt(info)-1).getAddress());
	  TextField email = new TextField(controller.getAllBrands().get(Integer.parseInt(info)-1).getEmail());
	  TextField contact = new TextField(controller.getAllBrands().get(Integer.parseInt(info)-1).getContact_number());
	  
	  b_name.setMaxWidth(250);
	  brand.setMaxWidth(250);
	  address.setMaxWidth(250);
	  email.setMaxWidth(250);
	  contact.setMaxWidth(250);
	  
	  editBPane.getChildren().add(okay);
	  editBPane.getChildren().add(details);
	  editBPane.getChildren().add(brand);
	  editBPane.getChildren().add(b_name);
	  editBPane.getChildren().add(address);
	  editBPane.getChildren().add(email);
	  editBPane.getChildren().add(contact);
	  
	  
	  StackPane.setMargin(details, new Insets(0, 300, 0, 0));
	  StackPane.setMargin(okay, new Insets(220, 0, 0, 0));
	  StackPane.setMargin(brand, new Insets(0, 0, 130, 220));
	  StackPane.setMargin(b_name, new Insets(0, 0, 70, 220));
	  StackPane.setMargin(address, new Insets(0, 0, 0, 220));
	  StackPane.setMargin(email, new Insets(70, 0, 0, 220));
	  StackPane.setMargin(contact, new Insets(140, 0, 0, 220));
	  
	  okay.setOnMousePressed(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  controller.editBrand(Integer.parseInt(info), b_name.getText(), address.getText(), email.getText(), contact.getText());
			  editBrandStage.close();
		  }
	  });
	  
	  editBrandStage.setScene(editBScene);
	  editBrandStage.show();
	  
  }
  
  private void EditProduct(String info){
	  StackPane editPPane = new StackPane();
	  Scene editPScene = new Scene(editPPane, 500, 500);
	  Stage editProductStage = new Stage();
	  
	  Button okay = new Button("Done");
	  Text details = new Text("Name:\nBrand Name:\nPrice:\nClassification:\nApparel Type:");
	  details.setFont(Font.font("Madeleina Sans", 30));
	  TextField p_name = new TextField(controller.getAllProducts().get(Integer.parseInt(info) - 1).getProduct_name());
	  TextField brand = new TextField(""+controller.getBrandName(controller.getAllProducts().get(Integer.parseInt(info)-1).getBrand_id()));
	  TextField price = new TextField(""+controller.getAllProducts().get(Integer.parseInt(info)-1).getPrice());
	  TextField classification = new TextField(controller.getAllProducts().get(Integer.parseInt(info)-1).getClassification());
	  TextField apparel = new TextField(controller.getAllProducts().get(Integer.parseInt(info)-1).getApparel_type());
	  
	  p_name.setMaxWidth(250);
	  brand.setMaxWidth(250);
	  price.setMaxWidth(250);
	  classification.setMaxWidth(250);
	  apparel.setMaxWidth(250);
	  
	  editPPane.getChildren().add(okay);
	  editPPane.getChildren().add(details);
	  editPPane.getChildren().add(p_name);
	  editPPane.getChildren().add(brand);
	  editPPane.getChildren().add(price);
	  editPPane.getChildren().add(classification);
	  editPPane.getChildren().add(apparel);
	  
	  
	  StackPane.setMargin(details, new Insets(0, 200, 0, 0));
	  StackPane.setMargin(okay, new Insets(200, 0, 0, 0));
	  StackPane.setMargin(p_name, new Insets(0, 0, 130, 200));
	  StackPane.setMargin(brand, new Insets(0, 0, 70, 200));
	  StackPane.setMargin(price, new Insets(0, 0, 0, 200));
	  StackPane.setMargin(classification, new Insets(70, 0, 0, 200));
	  StackPane.setMargin(apparel, new Insets(140, 0, 0, 200));
	  
	  okay.setOnMousePressed(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  System.out.println(Integer.parseInt(info));
			  controller.editProduct(Integer.parseInt(info), p_name.getText(), brand.getText(), Float.parseFloat(price.getText()), classification.getText(), apparel.getText());
			  System.out.println("productEdit!");
			  editProductStage.close();
		  }
	  });
	  
	  editProductStage.setScene(editPScene);
	  editProductStage.show();
  }

  private void AdminCall() {
    Scene AdminScene = new Scene(adminPane, 1280, 720);
    primaryStage.setScene(AdminScene);

    AnchorPane adminMenu = new AnchorPane();
    VBox olapMonthPane = new VBox();
    VBox olapPane = new VBox();
    AnchorPane screen = new AnchorPane();
    adminMenu.getChildren().add(adminBarV);
    adminMenu.getChildren().add(brandView);
    adminMenu.getChildren().add(userV);
    adminMenu.getChildren().add(summaryV);
    adminMenu.getChildren().add(orderV);
    adminMenu.getChildren().add(productV);
    editT.setFitWidth(146);
    editT.setFitHeight(32);
	editT2.setFitWidth(146);
	editT2.setFitHeight(32);
	addV.setFitWidth(146);
	addV2.setFitWidth(146);
	addV.setFitHeight(32);
	addV2.setFitHeight(32);
	

    brandView.setOnMouseEntered(e -> {
      brandView.setImage(brandH);
    });
    brandView.setOnMouseExited(e -> {
      brandView.setImage(brandB);
    });
    userV.setOnMouseEntered(e -> {
      userV.setImage(userH);
    });
    userV.setOnMouseExited(e -> {
      userV.setImage(userB);
    });
    productV.setOnMouseEntered(e -> {
      productV.setImage(productH);
    });
    productV.setOnMouseExited(e -> {
      productV.setImage(productB);
    });
    summaryV.setOnMouseEntered(e -> {
      summaryV.setImage(summaryH);
    });
    summaryV.setOnMouseExited(e -> {
      summaryV.setImage(summaryB);
    });
    orderV.setOnMouseEntered(e -> {
      orderV.setImage(orderH);
    });
    orderV.setOnMouseExited(e -> {
      orderV.setImage(orderB);
    });
    editT.setOnMouseEntered(e->{
    	editT.setImage(editH);
    });
    editT.setOnMouseExited(e->{
    	editT.setImage(edit);
    });
	editT2.setOnMouseEntered(e->{
		editT2.setImage(editH);
	});
	editT2.setOnMouseExited(e->{
		editT2.setImage(edit);
	});
	addV.setOnMouseEntered(e->{
		addV.setImage(addH);
	});
	addV.setOnMouseExited(e->{
		addV.setImage(add);
	});
	addV2.setOnMouseEntered(e->{
		addV2.setImage(addH);
	});
	addV2.setOnMouseExited(e->{
		addV2.setImage(add);
	});

    adminPane.getChildren().add(adminMenu);

    userV.setOnMouseClicked(e -> {

      if (adminPane.getChildren().size() > 1)
        adminPane.getChildren().remove(1);

      if (screen.getChildren().size() > 0)
        screen.getChildren().clear();

      TableView<User> table = new TableView<User>();
      ObservableList<User> data = FXCollections.observableArrayList(controller.getAllUsers());

      table.setEditable(true);
      TableColumn<User, String> name_column = new TableColumn<User, String>("First Name");
      name_column.setCellValueFactory(new PropertyValueFactory<>("first_name"));

      TableColumn<User, String> last_column = new TableColumn<User, String>("Last Name");
      last_column.setCellValueFactory(new PropertyValueFactory<>("last_name"));
      TableColumn<User, String> mail_column = new TableColumn<User, String>("Email");
      mail_column.setCellValueFactory(new PropertyValueFactory<>("email"));
      TableColumn<User, String> contact_column = new TableColumn<User, String>("Contact Number");
      contact_column.setCellValueFactory(new PropertyValueFactory<>("contact_number"));
      TableColumn<User, String> register_column = new TableColumn<User, String>("Register Date");
      register_column.setCellValueFactory(new PropertyValueFactory<>("register_date"));
      TableColumn<User, String> gender_column = new TableColumn<User, String>("Sex");
      gender_column.setCellValueFactory(new PropertyValueFactory<>("gender"));
      name_column.setMinWidth(100);
      last_column.setMinWidth(100);
      mail_column.setMinWidth(100);
      contact_column.setMinWidth(100);
      register_column.setMinWidth(100);
      gender_column.setMinWidth(100);
      table.setItems(data);
      table.getColumns().add(name_column);
      table.getColumns().add(last_column);
      table.getColumns().add(mail_column);
      table.getColumns().add(contact_column);
      table.getColumns().add(register_column);
      table.getColumns().add(gender_column);

      screen.getChildren().add(table);
      adminPane.getChildren().add(screen);
    });

    orderV.setOnMouseClicked(e -> {

      if (adminPane.getChildren().size() > 1)
        adminPane.getChildren().remove(1);

      if (screen.getChildren().size() > 0)
        screen.getChildren().clear();

      TableView<Order> table = new TableView<Order>();
      ObservableList<Order> data = FXCollections.observableArrayList(controller.getAllOrders());

      table.setEditable(true);
      TableColumn<Order, String> order_column = new TableColumn<Order, String>("Order ID");
      order_column.setCellValueFactory(new PropertyValueFactory<>("order_id"));
      TableColumn<Order, String> payment_column = new TableColumn<Order, String>("Payment Method");
      payment_column.setCellValueFactory(new PropertyValueFactory<>("payment_method"));
      TableColumn<Order, String> date_column = new TableColumn<Order, String>("Order Date");
      date_column.setCellValueFactory(new PropertyValueFactory<>("order_date"));
      TableColumn<Order, String> shipping_column = new TableColumn<Order, String>("Shipping Address");
      shipping_column.setCellValueFactory(new PropertyValueFactory<>("shipping_address"));
      TableColumn<Order, String> billing_column = new TableColumn<Order, String>("Billing Address");
      billing_column.setCellValueFactory(new PropertyValueFactory<>("billing_address"));
      TableColumn<Order, String> total_column = new TableColumn<Order, String>("Total Amount");
      total_column.setCellValueFactory(new PropertyValueFactory<>("total_amount"));
      order_column.setMinWidth(100);
      payment_column.setMinWidth(100);
      date_column.setMinWidth(100);
      shipping_column.setMinWidth(100);
      billing_column.setMinWidth(100);
      total_column.setMinWidth(100);
      table.setItems(data);
      table.getColumns().add(order_column);
      table.getColumns().add(payment_column);
      table.getColumns().add(date_column);
      table.getColumns().add(shipping_column);
      table.getColumns().add(billing_column);
      table.getColumns().add(total_column);

      screen.getChildren().add(table);
      adminPane.getChildren().add(screen);
    });

    brandView.setOnMouseClicked(e -> {

      if (adminPane.getChildren().size() > 1)
        adminPane.getChildren().remove(1);

      if (screen.getChildren().size() > 0) {
        System.out.println("Removed!");
        screen.getChildren().clear();
      }

      TableView<Brand> table = new TableView<Brand>();
      ObservableList<Brand> data = FXCollections.observableArrayList(controller.getAllBrands());

      table.setEditable(true);
      TableColumn<Brand, String> brand_column = new TableColumn<Brand, String>("Brand ID");
      brand_column.setCellValueFactory(new PropertyValueFactory<>("brand_id"));
      TableColumn<Brand, String> bname_column = new TableColumn<Brand, String>("Name");
      bname_column.setCellValueFactory(new PropertyValueFactory<>("brand_name"));
      TableColumn<Brand, String> address_column = new TableColumn<Brand, String>("Address");
      address_column.setCellValueFactory(new PropertyValueFactory<>("address"));
      TableColumn<Brand, String> email_column = new TableColumn<Brand, String>("Email");
      email_column.setCellValueFactory(new PropertyValueFactory<>("email"));
      TableColumn<Brand, String> contactNum_column = new TableColumn<Brand, String>("Contact Number");
      contactNum_column.setCellValueFactory(new PropertyValueFactory<>("contact_number"));
      brand_column.setMinWidth(100);
      bname_column.setMinWidth(100);
      address_column.setMinWidth(100);
      email_column.setMinWidth(100);
      contactNum_column.setMinWidth(100);
      table.setItems(data);
      table.getColumns().add(brand_column);
      table.getColumns().add(bname_column);
      table.getColumns().add(address_column);
      table.getColumns().add(email_column);
      table.getColumns().add(contactNum_column);

      screen.getChildren().add(table);
	  screen.getChildren().add(editT2);
	  screen.getChildren().add(addV2);
      adminPane.getChildren().add(screen);
	  
	  AnchorPane.setTopAnchor(editT2, 420.0);
	  AnchorPane.setLeftAnchor(editT2, 200.0);
	  AnchorPane.setTopAnchor(addV2, 420.0);
	  AnchorPane.setLeftAnchor(addV2, 400.0);
	  
	  editT2.setOnMouseClicked(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  TextInputDialog dialog = new TextInputDialog("name");
			  dialog.setTitle("Edit Product");
			  dialog.setHeaderText("Edit Product");
			  dialog.setContentText("Enter Product ID: ");
				
			  Optional<String> result = dialog.showAndWait();
			  if(result.isPresent())
			  {
				  
				result.ifPresent(name->{
					EditBrands(name);
				});
			  }
				
			
		  }
	  });
	  
	  addV2.setOnMouseClicked(new EventHandler<MouseEvent>(){
		public void handle (MouseEvent e)
		{
		  AddBrands();
		}
	});
    });

    productV.setOnMouseClicked(e -> {

      if (adminPane.getChildren().size() > 1)
        adminPane.getChildren().remove(1);

      if (screen.getChildren().size() > 0) {
        System.out.println("Removed!");
        screen.getChildren().clear();
      }

      TableView<Product> table = new TableView<Product>();
      ObservableList<Product> data = FXCollections.observableArrayList(controller.getAllProducts());

      table.setEditable(true);
      TableColumn<Product, String> product_column = new TableColumn<Product, String>("Product ID");
      product_column.setCellValueFactory(new PropertyValueFactory<>("product_id"));
      TableColumn<Product, String> pname_column = new TableColumn<Product, String>("Name");
      pname_column.setCellValueFactory(new PropertyValueFactory<>("product_name"));
      TableColumn<Product, String> bname_column = new TableColumn<Product, String>("Brand ID:");
      bname_column.setCellValueFactory(new PropertyValueFactory<>("brand_id"));
      TableColumn<Product, String> price_column = new TableColumn<Product, String>("Price");
      price_column.setCellValueFactory(new PropertyValueFactory<>("price"));
      TableColumn<Product, String> classification_column = new TableColumn<Product, String>("Classification");
      classification_column.setCellValueFactory(new PropertyValueFactory<>("classification"));
      TableColumn<Product, String> apparel_column = new TableColumn<Product, String>("Apparel Type");
      apparel_column.setCellValueFactory(new PropertyValueFactory<>("apparel_type"));
      product_column.setMinWidth(100);
      pname_column.setMinWidth(100);
      bname_column.setMinWidth(100);
      price_column.setMinWidth(100);
      classification_column.setMinWidth(100);
      apparel_column.setMinWidth(100);
      table.setItems(data);
      table.getColumns().add(product_column);
      table.getColumns().add(pname_column);
      table.getColumns().add(bname_column);
      table.getColumns().add(price_column);
      table.getColumns().add(classification_column);
      table.getColumns().add(apparel_column);

      screen.getChildren().add(table);
	  screen.getChildren().add(editT);
	  screen.getChildren().add(addV);
      adminPane.getChildren().add(screen);
	  
	  AnchorPane.setTopAnchor(editT, 420.0);
	  AnchorPane.setLeftAnchor(editT, 200.0);
	  AnchorPane.setTopAnchor(addV, 420.0);
	  AnchorPane.setLeftAnchor(addV, 400.0);
	  
	  editT.setOnMouseClicked(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  TextInputDialog dialog = new TextInputDialog("name");
			  dialog.setTitle("Edit Product");
			  dialog.setHeaderText("Edit Product");
			  dialog.setContentText("Enter Product ID: ");
				
			  Optional<String> result = dialog.showAndWait();
			  if(result.isPresent())
			  {
				  
				result.ifPresent(name->{
					EditProduct(name);
				});
			  }
				
			
		  }
	  });
	  
	  addV.setOnMouseClicked(new EventHandler<MouseEvent>(){
		  public void handle(MouseEvent e)
		  {
			  AddProducts();
		  }
	  });
	  
    });

    summaryV.setOnMouseClicked(e -> {
      if (adminPane.getChildren().size() > 1)
        adminPane.getChildren().remove(1);

      if (screen.getChildren().size() > 0) {
        System.out.println("Removed!");
        screen.getChildren().clear();
      }

      Text words = new Text("Total Sales of All Brands in the Year ");
      words.setFont(Font.font("Madeleina Sans", 30));
      TextField year = new TextField();
      Button generate = new Button("Generate");
      year.setPromptText("Year");
      year.setMaxWidth(200);
      year.setMaxHeight(30);

      screen.getChildren().add(words);
      screen.getChildren().add(year);
      screen.getChildren().add(generate);
	  
	  AnchorPane.setTopAnchor(words, 50.0);
	  AnchorPane.setLeftAnchor(words, 200.0 );
	  AnchorPane.setTopAnchor(year, 50.0);
	  AnchorPane.setLeftAnchor(year, 590.0);
	  AnchorPane.setTopAnchor(generate, 85.0);
	  AnchorPane.setLeftAnchor(generate, 400.0);
      //LastPane.getChildren().add(screen);

      generate.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          System.out.println(controller.getOlapAllBrandsQuantity(year.getText()));
          int counter = controller.getOlapAllBrandsQuantity(year.getText()).size();
          OlapQuantity = new Text[counter];
          OlapMonth = new Text[counter];

          Text quant = new Text("Quantity");
          olapPane.getChildren().add(quant);
          Text months = new Text("Month");
          olapMonthPane.getChildren().add(months);
		  
		  AnchorPane.setTopAnchor(quant, 100.0);
		  AnchorPane.setTopAnchor(months, 100.0);
		  AnchorPane.setLeftAnchor(quant, 250.0);
		  AnchorPane.setLeftAnchor(months, 350.0);

          for (int i = 0; i < counter; i++) {
            OlapQuantity[i] = new Text(controller.getOlapAllBrandsQuantity(year.getText()).get(i));
            if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("1"))
              OlapMonth[i] = new Text("January");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("2"))
              OlapMonth[i] = new Text("February");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("3"))
              OlapMonth[i] = new Text("March");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("4"))
              OlapMonth[i] = new Text("April");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("5"))
              OlapMonth[i] = new Text("May");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("6"))
              OlapMonth[i] = new Text("June");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("7"))
              OlapMonth[i] = new Text("Julu");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("8"))
              OlapMonth[i] = new Text("August");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("9"))
              OlapMonth[i] = new Text("September");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("10"))
              OlapMonth[i] = new Text("October");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("11"))
              OlapMonth[i] = new Text("November");
            else if (controller.getOlapAllBrandsMonth(year.getText()).get(i).equals("12"))
              OlapMonth[i] = new Text("December");

            System.out.println(controller.getOlapAllBrandsMonth(year.getText()).get(i));
            System.out.println(OlapMonth[i]);
            olapPane.getChildren().add(OlapQuantity[i]);
            olapMonthPane.getChildren().add(OlapMonth[i]);

          }

          screen.getChildren().add(olapPane);
          screen.getChildren().add(olapMonthPane);
		  
		  AnchorPane.setTopAnchor(olapPane, 120.0);
		  AnchorPane.setTopAnchor(olapMonthPane, 120.0);
		  AnchorPane.setLeftAnchor(olapPane, 250.0);
		  AnchorPane.setLeftAnchor(olapMonthPane, 350.0);
        }
      });
      adminPane.getChildren().add(screen);
    });

  }

}
