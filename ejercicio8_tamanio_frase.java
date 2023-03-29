/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio8_tamanio_frase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int largo, tamanio;
       
        System.out.println("Ingrese por favor una frase o palabra"); 
        frase = leer.nextLine();
        // con la función length se calcula el tamaño de la palabra o frase
        tamanio = frase.length();
        
       if(tamanio == 8){ /*frase.length()==8*/
           System.out.println("¡CORRECTO!");
       } else {
           System.out.println("¡INCORRECTO!");
       }   
    }
}
