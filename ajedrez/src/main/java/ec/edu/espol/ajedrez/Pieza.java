/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ajedrez;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Fiorella Quijano
 */
public abstract class Pieza {
   ImageView i;

    public Pieza( ImageView i) {
        this.i = i;
    }
    
    
    public ImageView getI() {
        return i;
    }

    public void setI(ImageView i) {
        this.i = i;
    }
    
    public String toString(){
        return "pieza";
    }
    

}
