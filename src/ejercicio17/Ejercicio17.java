/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

// Test push Juan Miguel Cadavid

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio17 {

    public static void main(String[] args) {
       double radio,areacirculo,longitudcircunferencia;
       Scanner leerporteclado = new Scanner(System.in);
       
       System.out.println("Ingrese el valor del radio");
       radio = leerporteclado.nextDouble();
       
       areacirculo = Math.PI * Math.pow(radio,2);
       longitudcircunferencia = 2 * Math.PI * radio;
       
       System.out.println("El area de circulo es: " + areacirculo);
       System.out.println("La longitud de la circunferencia es: " + longitudcircunferencia );
       
       
    }
    
}
