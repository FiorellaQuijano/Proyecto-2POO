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
    
    
    
    public static boolean moPeon(int fromX, int fromY, int toX, int toY, String color){
        
        boolean isWhite=true;
        
        if(color.equalsIgnoreCase("white"))
            isWhite=true;
    
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        if (isWhite) {
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
            } else if (fromY == 6 && deltaX == 0 && deltaY == 2) {
                return true; // Avance de dos casillas desde la posición inicial
            } else if (Math.abs(deltaX) == 1 && deltaY == 1) {
                return true; // Captura diagonal
            }
        }

        return false; 
    
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
    
    public static boolean moAlfil(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El alfil se mueve en diagonal
        if (deltaX == deltaY) {
            return true;
        }

        return false; 
    }
    
    public static boolean movCaballo(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El caballo se mueve en un patrón en forma de "L"
        
        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
    
    
    public static boolean moRey(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // El rey se mueve en cualquier dirección, pero solo una casilla a la vez
        return deltaX <= 1 && deltaY <= 1;
    }
    
    
    public static boolean moReina(int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // La reina puede moverse en cualquier dirección: horizontal, vertical o diagonal
        return (deltaX == 0 || deltaY == 0 || deltaX == deltaY);
    }
}
