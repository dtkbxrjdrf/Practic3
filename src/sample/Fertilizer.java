package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Fertilizer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Onum1;

    @FXML
    private TextField Onum2;

    @FXML
    private TextField Rezu1;

    @FXML
    private Button Rozrahmd;

    @FXML
    private TextField n1t;

    @FXML
    private TextField pv;

    @FXML
    private TextField krg;

    @FXML
    private Button rnv;

    @FXML
    private TextField Rezu2;

    @FXML
    private Button tomenu2;

    @FXML
    void delet(ActionEvent event) {
        Onum1.setText("");
        Onum2.setText("");
        Rezu1.setText("");
        n1t.setText("");
        pv.setText("");
        krg.setText("");
        Rezu2.setText("");
    }

    @FXML
    public void fertilizer1(javafx.event.ActionEvent actionEvent) {
        int num1 = Integer.parseInt( Onum1.getText());
        int num2 = Integer.parseInt(Onum2.getText());
        int num3 = 100;
        int dil = (num1/num2)*num3;
        Rezu1.setText(String.valueOf(dil+" кг"));
    }

    @FXML
    public void fertilizer2(ActionEvent actionEvent) {
        int num1 = Integer.parseInt(n1t.getText());
        int num2 = Integer.parseInt(pv.getText());
        int num3 = Integer.parseInt(krg.getText());
        int mng = num1*num2*num3;
        Rezu2.setText(String.valueOf(mng+" кг/га"));
    }

    @FXML
    void initialize() {
        tomenu2.setOnAction(event -> {
            tomenu2.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}