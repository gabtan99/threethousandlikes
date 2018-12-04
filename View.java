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

  VBox vertical = new VBox();
  StackPane welcomePage = new StackPane();
  StackPane loginPane = new StackPane();
  AnchorPane accountPage = new AnchorPane();
  VBox orderHistoryPage = new VBox();
  ScrollPane scrollpane = new ScrollPane();
  StackPane registerPane = new StackPane();
  StackPane menu = new StackPane();
  String selectedgender = null;
  ImageView[] productpic;
  AnchorPane[] productpane;
  Text[] productname;
  Text[] productorderquantity;
  TextFlow[] producttextflow;
  TextField[] productquantity;
  Button[] productaddbutton;
  Button[] productremovebutton;
  Text[] orderdetails;
  TilePane[] productgrid;
  Scene loginScene;
  Stage primaryStage;

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
      }
    });

    registerV.setOnMouseClicked(e -> {
      primaryStage.setScene(registerScene);
    });

    StackPane.setMargin(username, new Insets(0, 0, 115, 100));
    StackPane.setMargin(password, new Insets(45, 0, 0, 100));

    loginPane.getChildren().add(log);
    loginPane.getChildren().add(logInV);
    loginPane.getChildren().add(username);
    loginPane.getChildren().add(password);
    loginPane.getChildren().add(registerV);

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
      if (controller.registerUser(email.getText(), password_register.getText(), last_name.getText(),
          first_name.getText(), contact.getText().toString(), selectedgender))
        primaryStage.setScene(loginScene);
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
    StackPane.setMargin(searchText, new Insets(0, 0, 70, 0));

    ComboBox<String> filter = new ComboBox<String>();
    filter.getItems().addAll("Male", "Female", "All Items");
    filter.setPromptText("Filter By");
    filter.setMaxHeight(50);
    filter.setMaxWidth(300);
    filter.setStyle("-fx-accent:rgb(0, 0, 0)");
    filter.setStyle("-fx-font: 20px \"Madeleina Sans Regular\";");

    menu.setStyle("-fx-background-color: #E6E7E7");
    menu.getChildren().add(barsV);
    menu.getChildren().add(zaloraButtonV);
    menu.getChildren().add(search);
    menu.getChildren().add(account);
    menu.getChildren().add(cart);
    menu.getChildren().add(order);
    menu.getChildren().add(searchText);
    menu.getChildren().addAll(clothesV, shoesV, bagsV, beautyV, accV, sportsV);

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

    ////////////////////////////////////////////////////////

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

    String getUserDetails = controller.getCurrentUser().getFirst_name() + " "
        + controller.getCurrentUser().getLast_name();
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

    accountPage.getChildren().add(userDetails);
    accountPage.getChildren().add(name_text);
    accountPage.getChildren().add(register_text);
    accountPage.getChildren().add(contact_text);
    accountPage.getChildren().add(sex_text);
    accountPage.getChildren().add(out);
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
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getAllProducts().get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));

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
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 253.0);
      AnchorPane.setRightAnchor(productquantity[i], 95.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 253.0);
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

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsWithKeyword(keyword).get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));

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

      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 253.0);
      AnchorPane.setRightAnchor(productquantity[i], 95.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 253.0);
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
    productquantity = new TextField[count];
    productaddbutton = new Button[count];

    for (int i = 0; i < count; i++) {

      productname[i] = new Text(controller.getProductsUnderAType(AType).get(i).getProduct_name());
      productname[i].setFont(Font.font("Madeleina Sans", 20));

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
      productpane[i].getChildren().add(producttextflow[i]);
      productpane[i].getChildren().add(productaddbutton[i]);

      AnchorPane.setTopAnchor(producttextflow[i], 210.0);
      AnchorPane.setTopAnchor(productquantity[i], 253.0);
      AnchorPane.setRightAnchor(productquantity[i], 95.0);
      AnchorPane.setTopAnchor(productaddbutton[i], 253.0);
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
        q = q + Integer.toString(prod.get(j).getQuantity());
        productorderquantity[j] = new Text(q);

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
	
	System.out.println(controller.getCurrentCart().size());
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
	
	cartPane.getChildren().add(grid);
	if(controller.getCurrentCart().size() > 0)
		cartPane.getChildren().add(checkOutV);

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
            System.out.print("Removed");
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
<<<<<<< HEAD

    checkOutV.setOnMouseEntered(e -> {
      checkOutV.setImage(checkout2);
    });
    checkOutV.setOnMouseExited(e -> {
      checkOutV.setImage(checkout);
    });

    checkOutV.setOnMouseClicked(e -> {
      if (controller.checkoutCart("Cash On Delivery", "Malate", "Makati")) {
        clearPage();
        viewMyCart();
      }
    });

    cartPane.getChildren().add(grid);
    if (controller.getCurrentCart().size() > 1)
      cartPane.getChildren().add(checkOutV);
    AnchorPane.setLeftAnchor(checkOutV, 170.0);
=======
	checkOutV.setOnMouseEntered(e->{
		checkOutV.setImage(checkout2);
	});
	checkOutV.setOnMouseExited(e->{
		checkOutV.setImage(checkout);
	});
	
	AnchorPane.setLeftAnchor(checkOutV, 170.0);
>>>>>>> f73060748bafdaa675b4dc06087b9939275b917f
    scrollpane.setContent(cartPane);
    vertical.getChildren().add(scrollpane);
    VBox.setMargin(scrollpane, new Insets(0, 0, 0, 320));
  }

}
