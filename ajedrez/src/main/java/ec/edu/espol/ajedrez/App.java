package ec.edu.espol.ajedrez;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private ImageView piezaSeleccionada = null;
    
    @Override
    public void start(Stage stage) throws IOException {
//        holiwis
        GridPane gp = new GridPane();
        
        
        int count = 0;
        double dim = 60; 
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle(dim, dim, dim, dim);
                if (count % 2 == 0) {
                    r.setFill(Color.WHITE);
                }
                gp.add(r, j, i);
                count++;
            }
        }
        
        Image image = new Image("torre.png"); 
        ImageView pieza = new ImageView(image);
        pieza.setFitWidth(60);
        pieza.setFitHeight(60);
        gp.add(pieza, 0, 0);
        
        gp.setOnMouseClicked(event -> {
            int col = (int) event.getX() / (int) dim;
            int fila = (int) event.getY() / (int) dim;

            if (piezaSeleccionada != null) {
                GridPane.setColumnIndex(piezaSeleccionada, col);
                GridPane.setRowIndex(piezaSeleccionada, fila);
                piezaSeleccionada = null;
            } else {
                int oldCol = GridPane.getColumnIndex(pieza);
                int oldRow = GridPane.getRowIndex(pieza);
                
                if (col == oldCol && fila == oldRow) {
                    piezaSeleccionada = pieza;
                }
            }
        });
        
        scene = new Scene(gp, 480, 480);
        stage.setTitle("Ajedrez");
        stage.setScene(scene);
        stage.show();
    }

    //cambio

    public static void main(String[] args) {
        launch();
    }

}