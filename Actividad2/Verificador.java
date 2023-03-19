/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Acer
 */
public class Verificador {

    // Método que verifica si dos rectángulos se sobreponen
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        boolean overlapX = a.getEsquina1().getX() <= b.getEsquina2().getX() && b.getEsquina1().getX() <= a.getEsquina2().getX();
        boolean overlapY = a.getEsquina1().getY() <= b.getEsquina2().getY() && b.getEsquina1().getY() <= a.getEsquina2().getY();
        return overlapX && overlapY;
    }

    // Método que verifica si dos rectángulos están juntos
    public static boolean estanJuntos(Rectangulo a, Rectangulo b) {
        boolean adjacentX = a.getEsquina1().getX() == b.getEsquina2().getX() || b.getEsquina1().getX() == a.getEsquina2().getX();
        boolean adjacentY = a.getEsquina1().getY() == b.getEsquina2().getY() || b.getEsquina1().getY() == a.getEsquina2().getY();
        return adjacentX && adjacentY;
    }

    // Método que verifica si dos rectángulos son disjuntos
    public static boolean sonDisjuntos(Rectangulo a, Rectangulo b) {
        boolean disjunctX = a.getEsquina1().getX() > b.getEsquina2().getX() || b.getEsquina1().getX() > a.getEsquina2().getX();
        boolean disjunctY = a.getEsquina1().getY() > b.getEsquina2().getY() || b.getEsquina1().getY() > a.getEsquina2().getY();
        return disjunctX || disjunctY;
    }
}
