/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
package ejercicios;*/

package ejercicios;
import java.util.Scanner;

public class Ejercicios {

       
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingrese los números a sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1+num2;
        System.out.println("La suma de ambos números es: "+ suma);
        
        
        
    }
    
}
