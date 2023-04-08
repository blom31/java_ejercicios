/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.

 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String frase;
         
        do {
            System.out.print("Ingrese la frase a evaluar:");
        frase = leer.next();
        
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
            
            
        }else {
            System.out.println("INCORRECTO");
        }
        } while (!frase.substring(0, 1).equalsIgnoreCase("a"));
        
    }
    
}
