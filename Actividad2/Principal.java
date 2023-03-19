package Actividad2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir coordenadas para el Rectángulo A
        System.out.println("Ingrese las coordenadas para el Rectángulo A:");
        System.out.print("Esquina 1 (x,y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Esquina 2 (x,y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        // Crear objeto Rectángulo A
        Coordenada esquina1A = new Coordenada(x1, y1);
        Coordenada esquina2A = new Coordenada(x2, y2);
        Rectangulo A = new Rectangulo(esquina1A, esquina2A);
        
        // Pedir coordenadas para el Rectángulo B
        System.out.println("Ingrese las coordenadas para el Rectángulo B:");
        System.out.print("Esquina 1 (x,y): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.print("Esquina 2 (x,y): ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        
        // Crear objeto Rectángulo B
        Coordenada esquina1B = new Coordenada(x3, y3);
        Coordenada esquina2B = new Coordenada(x4, y4);
        Rectangulo B = new Rectangulo(esquina1B, esquina2B);
        
        sc.close();
    }
}
