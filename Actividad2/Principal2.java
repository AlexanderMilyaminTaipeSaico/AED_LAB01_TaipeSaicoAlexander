/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Principal2 {
  public static void main(String[] args) {
    // Crear objetos Rectangulo A y B
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese las coordenadas del rectangulo A:");
    Coordenada esquina1A = new Coordenada(sc.nextDouble(), sc.nextDouble());
    Coordenada esquina2A = new Coordenada(sc.nextDouble(), sc.nextDouble());
    Rectangulo A = new Rectangulo(esquina1A, esquina2A);

    System.out.println("Ingrese las coordenadas del rectangulo B:");
    Coordenada esquina1B = new Coordenada(sc.nextDouble(), sc.nextDouble());
    Coordenada esquina2B = new Coordenada(sc.nextDouble(), sc.nextDouble());
    Rectangulo B = new Rectangulo(esquina1B, esquina2B);
      // Verificar la relación entre los rectángulos A y B

    if (Verificador.seSobreponen(A, B)) {
      System.out.println("Los rectangulos A y B se sobreponen.");
    } else if (Verificador.estanJuntos(A, B)) {
      System.out.println("Los rectangulos A y B estan juntos.");
    } else {
      System.out.println("Los rectangulos A y B son disjuntos.");
    }
  }
}
