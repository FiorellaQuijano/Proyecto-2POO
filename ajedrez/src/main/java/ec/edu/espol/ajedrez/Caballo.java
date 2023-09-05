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
public class Caballo extends Pieza{

    public Caballo(ImageView i) {
        super(i);
    }
    
    public static boolean movCaballo(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El caballo se mueve en un patrón en forma de "L"
        
        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
   
    
}
