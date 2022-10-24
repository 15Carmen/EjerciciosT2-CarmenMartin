package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /*
    Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
    que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.
    Para calcular números aleatorios debes usar la función Math.random(), que devuelve un número aleatorio comprendido
    entre 0 y 1.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un resultado correcto y que se imprima el mensaje de enhorabuena
        · Introducir un resultado incorrecto y que se imprima el mensaje de consuelo junto con cuál sería el resultado
         correcto
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int num1, num2; //Variables donde vamos a guardar los números generados aleatoriamente
        int suma;       //Variable donde vamos a guardar el resultado de la suma introducida por el usuario

        //Le asignamos un número aleatorio de 0 99 a las variables num previamente declaradas usando Math.random
        num1 = (int) (Math.random() * 99);
        num2 = (int) (Math.random() * 99);

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le informamos al usuario del juego y le pedimos que introduzca el resultado de la suma de los dos números
        //generados. Si acierta, (el número introducido es igual al resultado de la suma) se imprime un mensaje de
        //enhorabuena y si falla se imprime un mensaje consolándolo por no saber matemáticas básicas
        System.out.println("¡Juguemos a un juego! ¿Cuál es el resultado de esta suma?");
        System.out.println(num1 + "+" + num2 + "=");
        suma = sc.nextInt();

        if (suma == num1 + num2) {
            System.out.println("¡Enhorabuena! El resultado introducido es correcto");
        } else
            System.out.println("Me temo que el resultado es incorrecto. La respuesta correcta era " + (num1 + num2));

        //Cerramos el scanner
        sc.close();
    }
}
