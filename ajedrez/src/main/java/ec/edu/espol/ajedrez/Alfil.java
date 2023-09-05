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
public class Alfil extends Pieza{

    public Alfil(ImageView i) {
        super(i);
    }
    
    public static boolean moAlfil(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El alfil se mueve en diagonal
        if (deltaX == deltaY) {
            return true;
        }

        return false; 
    }

    
}
