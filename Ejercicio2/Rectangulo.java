/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica2;

/**
 *
 * @author Acer
 */
import Practica1.*;
import Actividad2.*;
import Actividad1.*;
import java.util.*;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public void setEsquina1 (Coordenada coo) {
        esquina1 = coo;
    }

    public void setEsquina2 (Coordenada coo) {
        esquina2 = coo;
    }

    public Coordenada getEsquina1 () {
        return esquina1;
    }

    public Coordenada getEsquina2 () {
        return esquina2;
    }

    public String toString() {
        return "Rectángulo con esquinas en: " + esquina1.toString() + " y " + esquina2.toString();
    }

    public double calcularArea() {
        double base = Math.abs(esquina1.getX() - esquina2.getX());
        double altura = Math.abs(esquina1.getY() - esquina2.getY());
        return base * altura;
    }

    public double distanciaEntreCoordenadas() {
        double deltaX = esquina1.getX() - esquina2.getX();
        double deltaY = esquina1.getY() - esquina2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distanciaEntrePuntos() {
        Coordenada centroide = new Coordenada((esquina1.getX() + esquina2.getX()) / 2, (esquina1.getY() + esquina2.getY()) / 2);
        double deltaX = esquina1.getX() - centroide.getX();
        double deltaY = esquina1.getY() - centroide.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
