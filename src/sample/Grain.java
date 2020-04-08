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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Grain {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox Cbp;

    @FXML
    private CheckBox Cbg;

    @FXML
    private CheckBox Cbi;

    @FXML
    private CheckBox Cbo;

    @FXML
    private CheckBox Cbr;

    @FXML
    private CheckBox Cbk;

    @FXML
    private CheckBox Cgh;

    @FXML
    private CheckBox Cbgre;

    @FXML
    private CheckBox Cbm;

    @FXML
    private CheckBox Cbl;

    @FXML
    private TextField Gr;

    @FXML
    private TextField Ppn;

    @FXML
    private TextField Rezu3;

    @FXML
    private Button tomenu1;

    @FXML
    void delet(ActionEvent event) {
        Gr.setText("");
        Ppn.setText("");
        Rezu3.setText("");
    }

    @FXML
    void grain(ActionEvent event) {
        int num1=0;
        if (Cbp.isSelected()){
            num1=38;
        }else if (Cbg.isSelected()){
            num1=30;
        }else if (Cbi.isSelected()){
            num1=40;
        }else if (Cbo.isSelected()){
            num1=30;
        }else if (Cbr.isSelected()){
            num1=3;
        }else if (Cbk.isSelected()){
            num1=300;
        }else if (Cgh.isSelected()){
            num1=225;
        }else if (Cbgre.isSelected()){
            num1=20;
        }else if (Cbl.isSelected()){
            num1=4;
        }else if (Cbm.isSelected()){
            num1=1;
        }else {
            JOptionPane.showMessageDialog(null, "Виберіть один варіант");
        }
        int num2=Integer.parseInt(Gr.getText());
        int num3=Integer.parseInt(Ppn.getText());
        int vp = num1*num2*num3 /(1000*100);
        Rezu3.setText(String.valueOf(vp+" кг/га"));
    }
    @FXML
    void initialize() {
        tomenu1.setOnAction(event -> {
            tomenu1.getScene().getWindow().hide();
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
