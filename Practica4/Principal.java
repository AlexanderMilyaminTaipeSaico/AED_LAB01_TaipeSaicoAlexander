/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

/**
 *
 * @author Acer
 */
public class Principal {
    public static void main(String[] args) {
        // Creamos un contenedor de rectángulos con capacidad para 5 rectángulos
        ContainerRect contenedor = new ContainerRect(5);
        
        // Creamos algunos rectángulos y los añadimos al contenedor
        Rectangulo r1 = new Rectangulo(new Coordenada(1.5, 0.3), new Coordenada(7.6, 2.2));
        contenedor.addRectangulo(r1);
        
        Rectangulo r2 = new Rectangulo(new Coordenada(4.0, 4.2), new Coordenada(9.4, -2.5));
        contenedor.addRectangulo(r2);
        
        Rectangulo r3 = new Rectangulo(new Coordenada(0.0, 0.0), new Coordenada(1.0, 1.0));
        contenedor.addRectangulo(r3);
            
        
        // Mostramos los rectángulos almacenados en el contenedor
        System.out.println(contenedor.toString());
        
    }
}
