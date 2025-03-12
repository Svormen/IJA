import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class of program - create app window
 * @author Jozef Čásar
 * @author Slavomír Svorada
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

        //Readfile file = new Readfile();
        //Goods obj = file.read();
        //Cart cart = new Cart();
        //Controller controller = new Controller();
        //controller.initialize("Stolicka");
        //System.out.println("Zadaj nazvy tovaru (pre koniec objednavky zadaj stlac .):");
        //cart.cart(obj);

    }

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Gui/interface.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1565, 977));
        primaryStage.show();
    }
}
