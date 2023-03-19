/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

/**
 *
 * @author Acer
 */
public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec;
  
    public ContainerRect(int n) {
        this.n = n;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }

    // Getters y setters
    public Rectangulo[] getRectangulos() {
        return rectangulos;
    }

    public void setRectangulos(Rectangulo[] rectangulos) {
        this.rectangulos = rectangulos;
    }

    public double[] getDistancias() {
        return distancias;
    }

    public void setDistancias(double[] distancias) {
        this.distancias = distancias;
    }

    public double[] getAreas() {
        return areas;
    }

    public void setAreas(double[] areas) {
        this.areas = areas;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void agregar(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            numRec++;
        } else {
            System.out.println("No se pueden agregar más rectángulos");
        }
    }

    public int getCantidadRectangulos() {
        return numRec;
    }
}
