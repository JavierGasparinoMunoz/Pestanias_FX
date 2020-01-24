package controladoras;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class ControladoraVentanaDosSceneDos implements Initializable {
    @FXML
    Button botonUno;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        botonUno.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Scene sceneActual = botonUno.getScene();
                Stage stage = (Stage) sceneActual.getWindow();

                 Parent root = null;
                 try{
                    root = FXMLLoader.load(getClass().getResource("../layouts/layout_ventana_dos_scene_uno.fxml"));
                 } catch(Exception e){
                     e.printStackTrace();
                 }
                 Scene scene = new Scene(root,stage.getWidth(),stage.getHeight());
                 stage.setScene(scene);
            }
        });



    }
}
