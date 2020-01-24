package ventanas;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VentanaUno extends Stage {

    public  VentanaUno() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../layouts/layout_ventana_uno.fxml"));
        Scene scene = new Scene(root,600,400);
        this.setScene(scene);
        this.show();
    }

}
