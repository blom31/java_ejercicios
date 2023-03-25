/*EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class manos_A_la_Obra_ejer_9 {
    public static void main(String[] args) {
        int nro, suma, cont;
        suma =0;
        cont= 0;
        Scanner   leer = new Scanner(System.in);
        
        do {
             
        System.out.println("Ingrese por favor 10 números alearorios");
        nro = leer.nextInt(); 
        suma = suma + nro;
        cont=cont +1;
        if (nro == 0){
            System.out.println("Se capturó el número 0");
            break;
        }
        } while (cont<=9);
        //System.out.println("Se capturó el nro 0 ");
        System.out.println("La suma de los números ingresados fue de: " + suma + " y la cantidad de nros " + cont);
        
 
       
        
        
                
              
    }
    
}
