/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class manos_A_la_Obra_ejer_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
                  
       System.out.println("Ingrese por favor la nota a evaluar");
        nota= leer.nextInt();
        
        while ((nota<=0)||(nota>10)){
            System.out.println("La nota está fuera del rango, intente de nuevo");
            nota = leer.nextInt();
        }
        System.out.println("Rango correcto");
             
    }
    
}
