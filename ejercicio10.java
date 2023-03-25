/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite, nro, suma ;
        suma = 0;
        
        System.out.println("Establezca por favor un límite");
        limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese los números a sumar");
            nro = leer.nextInt();
            suma = suma + nro;
            
        } while (suma < limite);     
         
        System.out.println("El límite para la suma es de " + limite + " y la suma fue de " + suma);
    }  
    
}
