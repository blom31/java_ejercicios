/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int large, i, j;
        
        System.out.println("Ingrese el tamaño del cuadrado");
        large = leer.nextInt();
        
        for (i = 0; i < large; i++) {
            for (j = 0; j < large; j++) {
                if  (i==0 || i== large-1 || j==0 ||j== large-1) {
                    System.out.print("* ");
                   
                } else {
                    System.out.print("  "); 
                }
                
               
            }
            
             System.out.println(); 
        }
    }
    
}
