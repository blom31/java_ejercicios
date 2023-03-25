/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio7_eureka {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave;
        System.out.println("Ingrese una palabra:");
        String palabra = leer.next();
        clave = "eureka";
        
        //la función equal se coloca como argumento la palabra a comparar
    if (palabra.equals(clave)){
        System.out.println("Acertaste con la palabra Clave");
    }else {
        System.out.println("Palabra errónea");
    }}
        
}
