//Crear un programa que dado un numero determine si es par o impar.
package ejercicios;

import java.util.Scanner;

public class ejercicio6_condicionales {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, mod;
        System.out.println("Ingrese un número para evaluar si es par o no");
        //se define la variable y de una vez se le asigna el valor ingresado por teclado
        num = leer.nextInt();
        // se evalúa si el número es par o no con el operador " % "

        mod = num % 2;

        if (mod == 0) {
            System.out.println("El número ingresado es par  ");
        }else{
        System.out.println(" El número ingresado es impar");
        }
    }

}
