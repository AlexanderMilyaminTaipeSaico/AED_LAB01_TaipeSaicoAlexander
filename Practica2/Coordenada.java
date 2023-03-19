/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica2;

import Practica1.*;
import Actividad2.*;
import Actividad1.*;

/**
 *
 * @author Acer
 */

public class Coordenada {
    private double x;
    private double y;

    // Constructor, initialize x, y attributes to zero
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor
    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    // Métodos setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Métodos getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método de instancia que calcula la distancia euclideana
    public double distancia(Coordenada c) {
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Método de clase que calcula la distancia euclideana
    public static double distancia(Coordenada c1, Coordenada c2) {
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Método que devuelve los valores de una coordenada en determinado formato
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

