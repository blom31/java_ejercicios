/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicios;

import java.util.Scanner;

public class ejerciocio5 {

    
    public static void main(String[] args) {
        /* se declara una variable de tipo scanner para poder leer lo que se ingresa por teclado*/
        Scanner leer = new Scanner(System.in);
        /* se declara una variable de tipo entero para almacenar el número ingresado*/
        int num, num_doble, num_triple;
        double num_raiz;
        /*se pide por pantalla los datos*/
        System.out.println("Ingrese el número por favor");
        /*se lee el número y se almancena en la variable*/
        num = leer.nextInt();
        /* operación para mostrar el doble y el triple del número*/
       num_doble = num * 2;
       num_triple = num * 3;
       num_raiz = (float) Math.sqrt(num);
        
        /*muestra por pantalla los resultados*/
        System.out.println("El doble del número ingresado es: " + num_doble);
        System.out.println("El triple del número ingresado es " + num_triple);
        System.out.println("La raíz cuadrada del número ingresado es " + num_raiz);
    }
    
}
