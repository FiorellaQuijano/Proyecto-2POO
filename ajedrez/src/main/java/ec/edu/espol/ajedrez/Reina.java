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
public class Reina extends Pieza{

    public Reina(ImageView i) {
        super(i);
    }
    
    public static boolean moReina(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // La reina puede moverse en cualquier dirección: horizontal, vertical o diagonal
        return (deltaX == 0 || deltaY == 0 || deltaX == deltaY);
    }
    
}
