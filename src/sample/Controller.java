package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
public class Controller {

    @FXML
    private Button togrn;

    @FXML
    private Button tofrt;

    @FXML
    void initialize() {
        togrn.setOnAction(event -> {
            togrn.getScene().getWindow().hide();
            FXMLLoader loader = new  FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/grain.fxml"));

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
        tofrt.setOnAction(event -> {
            tofrt.getScene().getWindow().hide();
            FXMLLoader loader = new  FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fertilizer.fxml"));

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
