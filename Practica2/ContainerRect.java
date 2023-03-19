/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica2;

/**
 *
 * @author Acer
 */
public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int numRec;
    private int n;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
        numRec = 0;
    }

    public void addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = r.distanciaEntreCoordenadas();
            areas[numRec] = r.calcularArea();
            numRec++;
            System.out.println("Rectángulo agregado al contenedor.");
        } else {
            System.out.println("El contenedor ya está lleno, no es posible agregar más rectángulos.");
        }
    }
}







