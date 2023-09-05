/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ajedrez;

import javafx.scene.image.ImageView;

/**
 *
 * @author Fiorella Quijano
 */
public class Torre extends Pieza{

    public Torre(ImageView i) {
        super(i);        
    }
    
    public static boolean moTorre(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // La torre se mueve horizontal o verticalmente
        if (deltaX == 0 && deltaY > 0 || deltaX > 0 && deltaY == 0) {
            return true;
        }

        return false; 
    }
    
    
}
