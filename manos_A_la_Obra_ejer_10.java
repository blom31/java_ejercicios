/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicios;

/**
 *
 * @author blom3
 */
public class manos_A_la_Obra_ejer_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, j, num;
             
        j=1;
                
          do   {
              num = (int) (Math.random()*20);
              j++;
              System.out.print(num + " ");
              for (i = 0; i < num; i++) {
                  System.out.print("*");
                  System.out.print("");
              }
            System.out.println("");
                } while (j<6);
      
    }
    
}
