/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author Acer
 */
public class Principal {
    public static void main(String[] args) {
        ContainerRect container = new ContainerRect(3);
        container.addRectangulo(new Rectangulo(new Coordenada(1.5, 0.3), new Coordenada(7.6, 2.2)));
        container.addRectangulo(new Rectangulo(new Coordenada(4.0, 4.2), new Coordenada(9.4, -2.5)));
        System.out.println(container.toString());
    }
}
