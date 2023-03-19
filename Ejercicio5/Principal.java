/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Acer
 */
public class Principal {
    public static void main(String[] args) {
    // Crear un contenedor de rectángulos
    ContainerRect contenedor = new ContainerRect(5);

    // Crear rectángulos y añadirlos al contenedor
    Rectangulo rect1 = new Rectangulo(new Coordenada(1.5, 0.3), new Coordenada(7.6, 2.2));
    Rectangulo rect2 = new Rectangulo(new Coordenada(4.0, 4.2), new Coordenada(9.4, -2.5));
    contenedor.addRectangulo(rect1);
    contenedor.addRectangulo(rect2);

    // Mostrar el contenido del contenedor
    System.out.println(contenedor.toString());
}

}
