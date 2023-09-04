/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ajedrez;

/**
 *
 * @author aquin
 */
public class Piezas {
    
    
    
    public static boolean peon(int fromX, int fromY, int toX, int toY, String color){
        
        boolean isWhite;
        
        if(color.equalsIgnoreCase(""))
            i
    
        int deltaY = toY - fromY;
        int deltaX = toX - fromX;

        if (isWhite()) {
            // Movimiento válido para un peón blanco
            if (deltaX == 0 && deltaY == 1) {
                return true; // Avance de una casilla hacia adelante
            } else if (fromY == 1 && deltaX == 0 && deltaY == 2) {
                return true; // Avance de dos casillas desde la posición inicial
            } else if (Math.abs(deltaX) == 1 && deltaY == 1) {
                return true; // Captura diagonal
            }
        } else {
            // Movimiento válido para un peón negro
            if (deltaX == 0 && deltaY == -1) {
                return true; // Avance de una casilla hacia adelante
            } else if (fromY == 6 && deltaX == 0 && deltaY == -2) {
                return true; // Avance de dos casillas desde la posición inicial
            } else if (Math.abs(deltaX) == 1 && deltaY == -1) {
                return true; // Captura diagonal
            }
        }

        return false; // Movimiento no válido
    }
    }
    
}
