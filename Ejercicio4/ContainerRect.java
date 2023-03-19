/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

import Practica3.*;

/**
 *
 * @author Acer
 */
public class ContainerRect {
    private Rectangulo[] rectagulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private int numRec;

    // constructor que inicializa los arreglos de rectángulos, distancias y áreas
    public ContainerRect(int n) {
        this.n = n;
        rectagulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
        numRec = 0;
    }

    // método para agregar un rectángulo al final del arreglo
    public void addRectangulo(Rectangulo rect) {
        if (numRec < n) {
            rectagulos[numRec] = rect;
            distancias[numRec] = rect.distanciaEntrePuntos();
            areas[numRec] = rect.calcularArea();
            numRec++;
        } else {
            System.out.println("No es posible agregar más rectángulos, se alcanzó la capacidad máxima");
        }
    }

    // método toString para imprimir los rectángulos almacenados junto con sus distancias y áreas
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo\tCoordenadas\t\t\tDistancia\tArea\n");
        for (int i = 0; i < numRec; i++) {
            sb.append(i + 1).append("\t\t").append(rectagulos[i].toString()).append("\t");
            sb.append(String.format("%.3f", distancias[i])).append("\t\t");
            sb.append(String.format("%.2f", areas[i])).append("\n");
        }
        return sb.toString();
    }
}
