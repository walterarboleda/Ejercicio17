<<<<<<< HEAD
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
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

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
       
       System.out.println("Mensaje creado por Jcastanour");
    }
    
}
>>>>>>> 644c6b1fbecd76047145ae7c338cb33e30e972d4
