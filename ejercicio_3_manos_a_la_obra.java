/*
 * pide números por teclado, realiza las operaciones básicas aritmeticas.
luego tabaja las variables booleanas y la relacionales 
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio_3_manos_a_la_obra {
    public static void main(String[] args) {
        //declarar variable scanner para leer por teclado
    Scanner leer = new Scanner(System.in);
    int num1, num2, num3, suma, resta, mult;
    float div;
      //pedir los valores por teclados y asignarlos a las variables     
    System.out.println("Ingrese los números a trabajar por favor");
    num1= leer.nextInt();
    num2= leer.nextInt();
    num3= leer.nextInt();
        //hacer las operaciones aritméticas mas comunes
     suma = num1 + num2 + num3;
     resta = num1 - num2 - num3;
     mult = num1 * num2 * num3;
     div = num2 / num3;   
        System.out.println("OPERACIONES ARITMÉTICAS");
        System.out.println("suma:" + suma);
        System.out.println("resta:" + resta);
        System.out.println("multiplicación:" + mult);
        System.out.println("división:" + div);
        
          //hacer las operaciones relacionales mas comunes
            System.out.println("OPERACIÓN BOOLEANA");
          System.out.println("La suma es mayor a la resta?");
          boolean bandera = suma > resta;
          System.out.println(bandera);  
          
          //hacer una operación condicional
            System.out.println("OPERACIÓN CONDICIONAL");
          System.out.println("Ingresa dos numeros para comparar:");
          int nro1 = leer.nextInt();
          int nro2 = leer.nextInt();
             
          if (nro1 < nro2) {
              System.out.println("El primer número ingresado es menor");
          
          }else {
              System.out.println(" El segundo número ingresado es mayor");
          }
    }
}
