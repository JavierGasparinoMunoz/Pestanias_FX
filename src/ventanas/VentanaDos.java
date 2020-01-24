package ventanas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class VentanaDos extends Stage {

    String titulo;

    public VentanaDos(String titulo){
        this.titulo = titulo;
        initGUi();
    }

    private void initGUi() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../layouts/layout_ventana_dos_scene_uno.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root,300,300);
        this.setScene(scene);
        this.setTitle(titulo);
        this.initStyle(StageStyle.TRANSPARENT);
        this.show();
    }


}
