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
        
        ImageView wPeonPieza0 = new ImageView(wPeon);
        ImageView wPeonPieza1 = new ImageView(wPeon);        
        ImageView wPeonPieza2 = new ImageView(wPeon);
        ImageView wPeonPieza3 = new ImageView(wPeon);
        ImageView wPeonPieza4 = new ImageView(wPeon);
        ImageView wPeonPieza5 = new ImageView(wPeon);
        ImageView wPeonPieza6 = new ImageView(wPeon);
        ImageView wPeonPieza7 = new ImageView(wPeon);
        ImageView wTorrePieza0 = new ImageView(wTorre);
        ImageView wTorrePieza1 = new ImageView(wTorre);
        ImageView wCaballoPieza0 = new ImageView(wCaballo);
        ImageView wCaballoPieza1 = new ImageView(wCaballo);
        ImageView wAlfilPieza0 = new ImageView(wAlfil);
        ImageView wAlfilPieza1 = new ImageView(wAlfil);
        ImageView wReyPieza = new ImageView(wRey);
        ImageView wReinaPieza = new ImageView(wReina);
        
        piezasBlancas.add(0,wPeonPieza0);
        piezasBlancas.add(1,wPeonPieza1);
        piezasBlancas.add(2,wPeonPieza2);
        piezasBlancas.add(3,wPeonPieza3);
        piezasBlancas.add(4,wPeonPieza4);
        piezasBlancas.add(5,wPeonPieza5);
        piezasBlancas.add(6,wPeonPieza6);
        piezasBlancas.add(7,wPeonPieza7);
        piezasBlancas.add(8,wTorrePieza0);
        piezasBlancas.add(9,wCaballoPieza0);
        piezasBlancas.add(10,wAlfilPieza1);
        piezasBlancas.add(11,wReyPieza);
        piezasBlancas.add(12,wReinaPieza);
        piezasBlancas.add(13,wAlfilPieza0);
        piezasBlancas.add(14,wCaballoPieza1);
        piezasBlancas.add(15,wTorrePieza1);               

        
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
                        if(i==6){ 
                            piezasBlancas.get(k).setFitWidth(60);
                            piezasBlancas.get(k).setFitHeight(60);
                            gp.add(piezasBlancas.get(k),k,i);
                            k++;
                        }
                        if(i==7){
                            piezasBlancas.get(k+8).setFitWidth(60);
                            piezasBlancas.get(k+8).setFitHeight(60);
                            gp.add(piezasBlancas.get(k+8),k,i);
                            k++;
                        }
            }
	}
        
        
        gp.setOnMouseClicked(event -> {
            int col = (int) event.getX() / (int) dim;
            int fila = (int) event.getY() / (int) dim;

            if (piezaSeleccionada != null) {
                GridPane.setColumnIndex(piezaSeleccionada, col);
                GridPane.setRowIndex(piezaSeleccionada, fila);
                piezaSeleccionada = null;
            } else {
                for (ImageView i : piezasNegras) {
                int oldCol = GridPane.getColumnIndex(i);
                int oldRow = GridPane.getRowIndex(i);
                
                if (col == oldCol && fila == oldRow) {
                    piezaSeleccionada = i;
                    break;
                }
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