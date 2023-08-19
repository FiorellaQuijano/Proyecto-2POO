package ec.edu.espol.ajedrez;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
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
        GridPane gp = new GridPane();
        ArrayList<ImageView> piezasNegras = new ArrayList<>();
        ArrayList<ImageView> piezasBlancas = new ArrayList<>();
        
        
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
        
        Image bPeon = new Image("Ficha peonNegra.png");        
        Image bTorre = new Image("TorreNegra.png");        
        Image bCaballo = new Image("CaballoNegro.png");      
        Image bAlfil = new Image("AlfilNegro.png");
        Image bRey = new Image("ReyNegro.png");
        Image bReina = new Image("ReinaNegra.png");
                
        Image wPeon = new Image("Ficha Peon.png");       
        Image wTorre = new Image("Torre.png");       
        Image wCaballo = new Image("Caballo.png");          
        Image wAlfil = new Image("Alfil.png");
        Image wRey = new Image("Rey.png");
        Image wReina = new Image("Reina.png");
        
         
        ImageView bPeonPieza0 = new ImageView(bPeon);
        ImageView bPeonPieza1 = new ImageView(bPeon);        
        ImageView bPeonPieza2 = new ImageView(bPeon);
        ImageView bPeonPieza3 = new ImageView(bPeon);
        ImageView bPeonPieza4 = new ImageView(bPeon);
        ImageView bPeonPieza5 = new ImageView(bPeon);
        ImageView bPeonPieza6 = new ImageView(bPeon);
        ImageView bPeonPieza7 = new ImageView(bPeon);
        ImageView bTorrePieza0 = new ImageView(bTorre);
        ImageView bTorrePieza1 = new ImageView(bTorre);
        ImageView bCaballoPieza0 = new ImageView(bCaballo);
        ImageView bCaballoPieza1 = new ImageView(bCaballo);
        ImageView bAlfilPieza0 = new ImageView(bAlfil);
        ImageView bAlfilPieza1 = new ImageView(bAlfil);
        ImageView bReyPieza = new ImageView(bRey);
        ImageView bReinaPieza = new ImageView(bReina);
        
        piezasNegras.add(0,bTorrePieza0);
        piezasNegras.add(1,bCaballoPieza0);
        piezasNegras.add(2,bAlfilPieza1);
        piezasNegras.add(3,bReyPieza);
        piezasNegras.add(4,bReinaPieza);
        piezasNegras.add(5,bAlfilPieza0);
        piezasNegras.add(6,bCaballoPieza1);
        piezasNegras.add(7,bTorrePieza1);               
        piezasNegras.add(8,bPeonPieza0);
        piezasNegras.add(9,bPeonPieza1);
        piezasNegras.add(10,bPeonPieza2);
        piezasNegras.add(11,bPeonPieza3);
        piezasNegras.add(12,bPeonPieza4);
        piezasNegras.add(13,bPeonPieza5);
        piezasNegras.add(14,bPeonPieza6);
        piezasNegras.add(15,bPeonPieza7);
        
        int k;  
        for (int i = 0; i < 8; i++){// El primer índice recorre las columnas.
            k=0;
            
            for (int j = 0; j < 8; j++){// El segundo índice recorre las filas.
                    // Procesamos cada elemento del tablero                                       
                                        
                        if(i==0){                        
                            piezasNegras.get(k).setFitWidth(60);
                            piezasNegras.get(k).setFitHeight(60);
                            gp.add(piezasNegras.get(k), k, i);
                            k++;
                        }
                        
                        if(i==1){
                                                        
                            piezasNegras.get(k+8).setFitWidth(60); 
                            piezasNegras.get(k+8).setFitHeight(60);
                            gp.add(piezasNegras.get(k+8), k, i);
                            k++;                 
                        }                    
            }
	}
//        Image image = new Image("Caballo.png"); 
//        ImageView pieza = new ImageView(image);
//        
//        pieza.setFitWidth(60);
//        pieza.setFitHeight(60);
//        gp.add(pieza, 1, 0);
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