/*Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class manos_A_la_Obra_ejer_7 {
    public static void main(String[] args) {
        
    
    Scanner leer = new Scanner(System.in);
    int opc;
    
        System.out.println("*****  OPCIONES DE MOTOR DE BOMBA   *****");    
        System.out.println("1. Bomba de Agua");    
        System.out.println("2. Bomba de Gasolina");    
        System.out.println("3. Bomba de Hormigón");    
        System.out.println("4. Bomba de Pasta Alimenticia");    
    
    System.out.println("Ingrese el tipo de Motor de Bomba");
    opc = leer.nextInt();
    
        switch (opc) {
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                 System.out.println("La bomba es de Gasolina");
                 break;
            case 3:
                System.out.println("La bomba es de Hormigón");
                break;
            case 4:
                System.out.println("La bomba es de Pasta Alimenticia");
                break;
            default:
                System.out.println("El valor ingresado no corresponde a ningún tipo de Motor");
        }         
        
        
    }
    
    
}
