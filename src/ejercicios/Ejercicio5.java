package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
     */

    /*
     Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un número menor que 0 y que su valor absoluto sea el número introducido positivo
        · Introducir un número mayor que 0 y que su valor absoluto sea el mismo número introducido
     */
    public static void main(String[] args) {

        //Declaramos variables
        int num; //Variable donde vamos a guardar el número introducido por el usuario
        int valorAbsoluto; //Variable donde vamos a guardar el resultado del operador ternario

        //Declaramos el scanner para poder leer por consola
        Scanner sc=new Scanner(System.in);

        //Pedimos al usuario que introduzca un número y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero cualquiera: ");
        num=sc.nextInt();

        //Calculamos el valor absoluto con un operador ternario. Para ello declaramos que si el número introducido es
        //menor que cero, el mismo se multiplique por -1 para así convertirlo nuevamente en positivo.
        valorAbsoluto=num<0 ? num*(-1) : num;

        //Mostramos por pantalla el resultado
        System.out.println("El valor absoluto es "+valorAbsoluto);

        //cerramos el scanner
        sc.close();
    }
}
