/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ajedrez;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

/**
 *
 * @author Fiorella Quijano
 */
public class Peon extends Pieza{

    public Peon( ImageView i) {
        super(i);
    }
    
    
     
//    public static boolean movPeon(int oldCol, int oldRow, int newCol, int newRow, Pieza p,ArrayList<Pieza> piezasNegras, ArrayList<Pieza> piezasBlancas){
//    int rowDif=newRow-oldRow;
//    int colDif=Math.abs(newCol-oldCol);
//    
//    boolean peonBlanco=piezasNegras.contains(p);
//    boolean peonNegro=piezasBlancas.contains(p);
//    
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
    
  public static boolean movPeon(int oldCol, int oldRow, int newCol, int newRow, Peon p, ArrayList<Pieza> piezasNegras, ArrayList<Pieza> piezasBlancas) {
        int rowDif = newRow - oldRow;
        int colDif = Math.abs(newCol - oldCol);

        // Comprueba si el peón es blanco o negro
        boolean peonBlanco = piezasBlancas.contains(p);
        boolean peonNegro = piezasNegras.contains(p);

        if (peonNegro) {
            if (rowDif == 1 && colDif == 0) {
                return true;
            } else if (rowDif == 2 && colDif == 0 && oldRow == 1) {
                return true;
            }
        } else if (peonBlanco) {
            if (rowDif == -1 && colDif == 0) {
                return true;
            } else if (rowDif == -2 && colDif == 0 && oldRow == 6) {
                return true;
            }
        }
        return false;
    }
}

