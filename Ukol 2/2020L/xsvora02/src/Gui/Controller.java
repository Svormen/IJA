package Gui;
import Code.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.event.ActionEvent;

import java.util.List;

/**
 * Class Controller for working with file interface.fxml
 * @author Jozef Čásar
 * @author Slavomír Svorada
 */
public class Controller{
    @FXML
    /** labelList the list of all labels used in interface.fxml*/
    private List<Label> labelList;
    @FXML
    private Tooltip tooltip;

    @FXML
    private ComboBox<String> order;

    @FXML
    private Button orderButton;

    Cart cart = new Cart();
    Goods obj;

    @FXML
    private void initialize() {
        Readfile file = new Readfile();
        obj = file.read();
        int count = 0;
        order.setPromptText("Vyberte tovar");

        /**
         * The value display in a tool tip. The value
         * displays when the cursor lingers over the component.
         *
         * value  the number to display the count of goods.  If the text is null,
         *              the tool tip is turned off for label.
         */
        for (Map.Entry me : obj.goodsList.entrySet()) {
            String name = "" + me.getKey();
            String value = "" + me.getValue();
            order.getItems().addAll(name);
            labelList.get(count).setText(name);
            labelList.get(count).setTooltip(new Tooltip(value));
            count++;
        }
    }

    /**
     * Function for managing actual count of goods
     * @param event the event representin, when is count changed
     */
    public void orderChanged(ActionEvent event) {
        String orderValue = order.getValue();
        int count = 0;
        for (Map.Entry me : obj.goodsList.entrySet()) {
            String name = "" + me.getKey();
            if( name.equals(orderValue)) {
                obj.getGoodsItem(orderValue);
                String value = "" + me.getValue();
                if (Integer.parseInt(value) > 0)
                    cart.addToCart(orderValue);
                //value = String.valueOf(Integer.parseInt(value) - 1);
                labelList.get(count).setTooltip(new Tooltip(value));
            }
            count++;
        }
    }

    /**
     * Function print ordered goods on terminal when button with
     * text "Vypíš objednaný tovar" is clicked
     * @param event the event button click
     */
    public void write(ActionEvent event) {
        int count = 0;
        for (Map.Entry me : cart.cartList.entrySet()) {
            String name = "" + me.getKey();
            String value = "" + me.getValue();
            System.out.println("Objednavka na tovar: " + value);
            count++;
        }
    }
}
