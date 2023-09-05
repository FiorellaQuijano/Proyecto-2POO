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
public class Rey extends Pieza{

    public Rey(ImageView i) {
        super(i);
    }
    
    public static boolean moRey(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El rey se mueve en cualquier dirección, pero solo una casilla a la vez
        return deltaX <= 1 && deltaY <= 1;
    }
    
}
