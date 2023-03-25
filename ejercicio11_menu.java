/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio11_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc, result;
        String resp;
        boolean band = false;
        
        System.out.println("Introduzca dos números para las operaciones");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("  ** MENÚ **  ");
            System.out.println(" 1. SUMAR");
            System.out.println(" 2. RESTAR");
            System.out.println(" 3. MULTIPLICAR");
            System.out.println(" 4. DIVIDIR");
            System.out.println(" 5. SALIR");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("SUMA");
                    result = num1+num2;
                    System.out.println("El resultado es " + result);
                break;
                    
                case 2:
                    System.out.println("RESTA");
                    result = num1-num2;
                    System.out.println("El resultado es " + result);
                break;
                    
                case 3:
                    System.out.println("MULTIPLCACIÓN");
                    result = num1*num2;
                    System.out.println("El resultado es" + result);
                break;
                
                case 4:
                    System.out.println("DIVISIÓN");
                    result = num1/num2;
                    System.out.println("El resultado es " + result );
                    
                break;    
                            
                case 5:
                    System.out.println("SALIR");
                    System.out.println("Está seguro que desea salir  S / N ?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Adios");
                    } else {
                        opc = 1 ;
                    } 
            }  
        } while (opc!=5) ;
        
    }
    
}
