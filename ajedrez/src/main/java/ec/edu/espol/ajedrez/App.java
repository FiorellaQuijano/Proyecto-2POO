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
    ArrayList<Pieza> piezasNegras;
    ArrayList<Pieza> piezasBlancas;
    
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gp = new GridPane();
        piezasNegras = new ArrayList<>();
        piezasBlancas = new ArrayList<>();
        
        
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
        
         
//        ImageView bPeonPieza0 = new ImageView(bPeon);
//        ImageView bPeonPieza1 = new ImageView(bPeon);        
//        ImageView bPeonPieza2 = new ImageView(bPeon);
//        ImageView bPeonPieza3 = new ImageView(bPeon);
//        ImageView bPeonPieza4 = new ImageView(bPeon);
//        ImageView bPeonPieza5 = new ImageView(bPeon);
//        ImageView bPeonPieza6 = new ImageView(bPeon);
//        ImageView bPeonPieza7 = new ImageView(bPeon);
//        ImageView bTorrePieza0 = new ImageView(bTorre);
//        ImageView bTorrePieza1 = new ImageView(bTorre);
//        ImageView bCaballoPieza0 = new ImageView(bCaballo);
//        ImageView bCaballoPieza1 = new ImageView(bCaballo);
//        ImageView bAlfilPieza0 = new ImageView(bAlfil);
//        ImageView bAlfilPieza1 = new ImageView(bAlfil);
//        ImageView bReyPieza = new ImageView(bRey);
//        ImageView bReinaPieza = new ImageView(bReina);

        Peon bPeonPieza0 = new Peon(new ImageView(bPeon));
        bPeonPieza0.i.setUserData("PeonNegro");
        
        Peon bPeonPieza1 = new Peon(new ImageView(bPeon)); 
        bPeonPieza1.i.setUserData("PeonNegro");
        
        Peon bPeonPieza2 = new Peon(new ImageView(bPeon));
        bPeonPieza2.i.setUserData("PeonNegro");
        
        Peon bPeonPieza3 = new Peon(new ImageView(bPeon));
        bPeonPieza3.i.setUserData("PeonNegro");
        
        Peon bPeonPieza4 = new Peon(new ImageView(bPeon));
        bPeonPieza4.i.setUserData("PeonNegro");
        
        Peon bPeonPieza5 = new Peon(new ImageView(bPeon));
        bPeonPieza5.i.setUserData("PeonNegro");
        
        Peon bPeonPieza6 = new Peon(new ImageView(bPeon));
        bPeonPieza6.i.setUserData("PeonNegro");
        
        Peon bPeonPieza7 = new Peon(new ImageView(bPeon));
        bPeonPieza7.i.setUserData("PeonNegro");
        
        Torre bTorrePieza0 = new Torre(new ImageView(bTorre));
        bTorrePieza0.i.setUserData("TorreNegra");
        
        Torre bTorrePieza1 = new Torre(new ImageView(bTorre));
        bTorrePieza1.i.setUserData("TorreNegra");
        
        Caballo bCaballoPieza0 = new Caballo(new ImageView(bCaballo));
        bCaballoPieza0.i.setUserData("CaballoNegro");
        
        Caballo bCaballoPieza1 = new Caballo(new ImageView(bCaballo));
        bCaballoPieza1.i.setUserData("CaballoNegro");
        
        Alfil bAlfilPieza0 = new Alfil(new ImageView(bAlfil));
        bAlfilPieza0.i.setUserData("AlfilNegro");
        
        Alfil bAlfilPieza1 = new Alfil(new ImageView(bAlfil));
        bAlfilPieza1.i.setUserData("AlfilNegro");
        
        Rey bReyPieza = new Rey(new ImageView(bRey));
        bReyPieza.i.setUserData("ReyNegro");
        
        Reina bReinaPieza = new Reina(new ImageView(bReina));
        bReinaPieza.i.setUserData("ReinaNegra");
        
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
        
//        ImageView wPeonPieza0 = new ImageView(wPeon);
//        ImageView wPeonPieza1 = new ImageView(wPeon);        
//        ImageView wPeonPieza2 = new ImageView(wPeon);
//        ImageView wPeonPieza3 = new ImageView(wPeon);
//        ImageView wPeonPieza4 = new ImageView(wPeon);
//        ImageView wPeonPieza5 = new ImageView(wPeon);
//        ImageView wPeonPieza6 = new ImageView(wPeon);
//        ImageView wPeonPieza7 = new ImageView(wPeon);
//        ImageView wTorrePieza0 = new ImageView(wTorre);
//        ImageView wTorrePieza1 = new ImageView(wTorre);
//        ImageView wCaballoPieza0 = new ImageView(wCaballo);
//        ImageView wCaballoPieza1 = new ImageView(wCaballo);
//        ImageView wAlfilPieza0 = new ImageView(wAlfil);
//        ImageView wAlfilPieza1 = new ImageView(wAlfil);
//        ImageView wReyPieza = new ImageView(wRey);
//        ImageView wReinaPieza = new ImageView(wReina);
        
        Peon wPeonPieza0 = new Peon(new ImageView(wPeon));
        wPeonPieza0.i.setUserData("PeonBlanco");
        Peon wPeonPieza1 = new Peon(new ImageView(wPeon));
        wPeonPieza1.i.setUserData("PeonBlanco");
        Peon wPeonPieza2 = new Peon(new ImageView(wPeon));
        wPeonPieza2.i.setUserData("PeonBlanco");
        Peon wPeonPieza3 = new Peon(new ImageView(wPeon));
        wPeonPieza3.i.setUserData("PeonBlanco");
        Peon wPeonPieza4 = new Peon(new ImageView(wPeon));
        wPeonPieza4.i.setUserData("PeonBlanco");
        Peon wPeonPieza5 = new Peon(new ImageView(wPeon));
        wPeonPieza5.i.setUserData("PeonBlanco");
        Peon wPeonPieza6 = new Peon(new ImageView(wPeon));
        wPeonPieza6.i.setUserData("PeonBlanco");
        Peon wPeonPieza7 = new Peon(new ImageView(wPeon));
        wPeonPieza7.i.setUserData("PeonBlanco");
        
        Torre wTorrePieza0 = new Torre(new ImageView(wTorre));
        wTorrePieza0.i.setUserData("TorreBlanca");
        
        Torre wTorrePieza1 = new Torre(new ImageView(wTorre));
        wTorrePieza1.i.setUserData("TorreBlanca");
        
        Caballo wCaballoPieza0 = new Caballo(new ImageView(wCaballo));
        wCaballoPieza0.i.setUserData("CaballoBlanco");
        
        Caballo wCaballoPieza1 = new Caballo(new ImageView(wCaballo));
        wCaballoPieza1.i.setUserData("CaballoBlanco");
        
        Alfil wAlfilPieza0 = new Alfil(new ImageView(wAlfil));
        wAlfilPieza0.i.setUserData("AlfilBlanco");
        
        Alfil wAlfilPieza1 = new Alfil(new ImageView(wAlfil));
        wAlfilPieza1.i.setUserData("AlfilBlanco");
        
        Rey wReyPieza = new Rey(new ImageView(wRey));
        wReyPieza.i.setUserData("ReyBlanco");
        
        Reina wReinaPieza = new Reina(new ImageView(wReina));
        wReinaPieza.i.setUserData("ReinaBlanco");
         
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

        
//        int k;  
//        for (int i = 0; i < 8; i++){// El primer índice recorre las columnas.
//            k=0;
//            
//            for (int j = 0; j < 8; j++){// El segundo índice recorre las filas.
//                    // Procesamos cada elemento del tablero                                       
//                                        
//                        if(i==0){                        
//                            piezasNegras.get(k).setFitWidth(60);
//                            piezasNegras.get(k).setFitHeight(60);
//                            gp.add(piezasNegras.get(k), k, i);
//                            
//                            k++;
//                        }
//                        
//                        if(i==1){
//                                                        
//                            piezasNegras.get(k+8).setFitWidth(60); 
//                            piezasNegras.get(k+8).setFitHeight(60);
//                            gp.add(piezasNegras.get(k+8), k, i);
//                            
//                           
//                            k++;                 
//                        }
//                        if(i==6){ 
//                            piezasBlancas.get(k).setFitWidth(60);
//                            piezasBlancas.get(k).setFitHeight(60);
//                            gp.add(piezasBlancas.get(k),k,i);
//                            k++;
//                        }
//                        if(i==7){
//                            piezasBlancas.get(k+8).setFitWidth(60);
//                            piezasBlancas.get(k+8).setFitHeight(60);
//                            gp.add(piezasBlancas.get(k+8),k,i);
//                            k++;
//                        }
//            }
//	}
        int k;  
        for (int i = 0; i < 8; i++){
            k=0;
            
            for (int j = 0; j < 8; j++){                                   
                                        
                        if(i==0){                        
                            piezasNegras.get(k).getI().setFitWidth(60);
                            piezasNegras.get(k).getI().setFitHeight(60);
                            gp.add(piezasNegras.get(k).getI(), k, i);
                            
                            k++;
                        }
                        
                        if(i==1){
                                                        
                            piezasNegras.get(k+8).getI().setFitWidth(60); 
                            piezasNegras.get(k+8).getI().setFitHeight(60);
                            gp.add(piezasNegras.get(k+8).getI(), k, i);
                            
                           
                            k++;                 
                        }
                        if(i==6){ 
                            piezasBlancas.get(k).getI().setFitWidth(60);
                            piezasBlancas.get(k).getI().setFitHeight(60);
                            gp.add(piezasBlancas.get(k).getI(),k,i);
                            k++;
                        }
                        if(i==7){
                            piezasBlancas.get(k+8).getI().setFitWidth(60);
                            piezasBlancas.get(k+8).getI().setFitHeight(60);
                            gp.add(piezasBlancas.get(k+8).getI(),k,i);
                            k++;
                        }
            }
	}
          
//        gp.setOnMouseClicked(event -> {
//            int col = (int) event.getX() / (int) dim;
//            int fila = (int) event.getY() / (int) dim;
//            
//            if (piezaSeleccionada != null) {
//                GridPane.setColumnIndex(piezaSeleccionada, col);
//                GridPane.setRowIndex(piezaSeleccionada, fila);
//                piezaSeleccionada = null;
//            } else {
//                for (ImageView i : piezasNegras) {
//                int oldCol = GridPane.getColumnIndex(i);
//                int oldRow = GridPane.getRowIndex(i);
//                
//                if (col == oldCol && fila == oldRow) {
//                    piezaSeleccionada = i;
//                    break;
//                }
//            }
//                if (piezaSeleccionada == null) {
//                    for (ImageView i : piezasBlancas) {
//                        int oldCol = GridPane.getColumnIndex(i);
//                        int oldRow = GridPane.getRowIndex(i);
//
//                        if (col == oldCol && fila == oldRow) {
//                            piezaSeleccionada = i;
//                            break;
//                        }
//                    }
//                }
//            }
//        });
        
            gp.setOnMouseClicked(event -> {
            int col = (int) event.getX() / (int) dim;
            int fila = (int) event.getY() / (int) dim;
            
            if (piezaSeleccionada != null) {
                
                int oldCol = GridPane.getColumnIndex(piezaSeleccionada);
                System.out.println(oldCol);
                int oldRow = GridPane.getRowIndex(piezaSeleccionada);
                System.out.println(oldRow);
                
                // Verificar el movimiento válido
                if (movimientoValido(oldCol, oldRow, col, fila,piezaSeleccionada)) {
                    System.out.println(col);
                    GridPane.setColumnIndex(piezaSeleccionada, col);
                    GridPane.setRowIndex(piezaSeleccionada, fila);
                    piezaSeleccionada = null;
                }
            } else {
                // Seleccionar una pieza si no hay ninguna pieza seleccionada
                for (Pieza p : piezasNegras) {
                    if (p.getI() == piezaSeleccionada) {
                        piezaSeleccionada = p.getI();
                        System.out.println("hola");
                        break;
                    }
                }

                if (piezaSeleccionada == null) {
                    for (Pieza p : piezasBlancas) {
                        if (p.getI() == piezaSeleccionada) {
                            piezaSeleccionada = p.getI();
                            break;
                        }
                    }
                }
            }
        });
	    
        
        scene = new Scene(gp, 480, 480);
        stage.setTitle("Ajedrez");
        stage.setScene(scene);
        stage.show();
    }
//public boolean movPeon(int oldCol, int oldRow, int newCol, int newRow, ImageView piezaSeleccionada){
//    int rowDif=newRow-oldRow;
//    int colDif=Math.abs(newCol-oldCol);
//    boolean peonBlanco=piezasNegras.contains(piezaSeleccionada);
//    boolean peonNegro=piezasBlancas.contains(piezaSeleccionada);
//    if(peonNegro){
//        if(rowDif==1 && colDif==0){
//            return true;
//        }else if(rowDif==2 && colDif==0 && oldRow==1){
//            return true;
//        }
//    }else if(peonBlanco){
//        if(rowDif==-1 && colDif==0){
//            return true;
//        }else if(rowDif==-2 && colDif==0 && oldRow==6){
//            return true;        
//        }
//    } 
//    return false;
//}
    private boolean movimientoValido(int oldCol, int oldRow, int newCol, int newRow,ImageView seleccionada) {
        
            for (Pieza p : piezasNegras) {
                if (p.getI() == seleccionada) {
                    if (p instanceof Peon) {
                        System.out.println(p);
                        return Peon.movPeon(oldCol, oldRow, newCol, newRow, (Peon) p, piezasNegras, piezasBlancas);
                    }
                    // Agrega más lógica de movimiento para otras piezas aquí si es necesario
                }
            }

            for (Pieza p : piezasBlancas) {
                if (p.getI() == seleccionada) {
                    if (p instanceof Peon) {
                        System.out.println(p);
                        return Peon.movPeon(oldCol, oldRow, newCol, newRow, (Peon) p, piezasNegras, piezasBlancas);
                    }
                    // Agrega más lógica de movimiento para otras piezas aquí si es necesario
                }
            }
        
        return false;
    }

    public static void main(String[] args) {
        launch();
    }

}
