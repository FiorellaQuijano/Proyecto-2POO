/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ajedrez;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Fiorella Quijano
 */
public class Respaldo {
    
//
//    private static Scene scene;
//    private ImageView piezaSeleccionada = null;
//    
//    @Override
//    public void start(Stage stage) throws IOException {
//        GridPane gp = new GridPane();
//        
//        int count = 0;
//        double dim = 60; 
//        for (int i = 0; i < 8; i++) {
//            count++;
//            for (int j = 0; j < 8; j++) {
//                Rectangle r = new Rectangle(dim, dim, dim, dim);
//                if (count % 2 == 0) {
//                    r.setFill(Color.WHITE);
//                }
//                gp.add(r, j, i);
//                count++;
//            }
//        }
//
//        StackPane root = new StackPane();
//        root.setAlignment( Pos.CENTER); 
//        root.getChildren().add(gp); 
//        
//        Image image = new Image("torre.png"); 
//        ImageView pieza = new ImageView(image);
//        pieza.setFitWidth(60);
//        pieza.setFitHeight(60);
//        gp.add(pieza, 0, 0);
//        
//        gp.setOnMouseClicked(event -> {
//            int col = (int) event.getX() / (int) dim;
//            int fila = (int) event.getY() / (int) dim;
//
//            if (piezaSeleccionada != null) {
//                GridPane.setColumnIndex(piezaSeleccionada, col);
//                GridPane.setRowIndex(piezaSeleccionada, fila);
//                piezaSeleccionada = null;
//            } else {
//                int oldCol = GridPane.getColumnIndex(pieza);
//                int oldRow = GridPane.getRowIndex(pieza);
//                
//                if (col == oldCol && fila == oldRow) {
//                    piezaSeleccionada = pieza;
//                }
//            }
//        });
//        
//        scene = new Scene(root, 480, 480);
//        stage.setTitle("Ajedrez");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    
//
//    public static void main(String[] args) {
//        launch();
//    }
//
}

