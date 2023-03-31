/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio12_rs232 {
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
        
        int correct, incorrect;
        correct= 0;
        incorrect = 0;
        String cadena;
        
        System.out.println("Dispositivo RS232:");
        
        while (true) {
            System.out.print("Ingrese secuencia: ");
            cadena = leer.nextLine();
            
            if (cadena.equals("&&&&&")) {
                
                break;
            }
            
            else if ((cadena.length() == 5) && (cadena.substring(0, 1).equals("X")) && (cadena.substring(4).equals("O"))) {
                correct++;
            } else {
                incorrect++;
            }
        }
        
        System.out.println("Resultado ");
        System.out.println("Lecturas correctas: " + correct + " | Lecturas incorrectas: " + incorrect);
    }
}