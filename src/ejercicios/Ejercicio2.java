package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
                                            letra = número DNI módulo 23
    Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:
                0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
                T R W A G M Y F P D X  B   N  J  Z  S  Q  V H  L  C  K  E
    Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde. Observa que un número
    de 8 dígitos está dentro del rango del tipo int.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un número menor de 8 cifras y que salga el mensaje de error configurado para este caso
                123456 -> "Debes introducir un número de 8 cifras"
        · Introducir un número mayor de 8 cifras y que salga el mensaje de error configurado para este caso
                123456789 -> "Debes introducir un número de 8 cifras"
        · Introducir un número de 8 cifras y que el resultado de la letra que le corresponde
                49117682 -> 49117682D
    */

    public static void main(String[] args) {

        //declaramos las variables
        int numDni;   //Variable donde vamos a guardar el número introducido por el usuario
        int letraDni; //Variable donde vamos a guardar el cálculo de la letra del dni proporcionado por el enunciado del ejercicio

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entre 0 y 9999 y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero de 8 cifras");
        numDni = sc.nextInt();

        //Calculamos cuál sería la letra del dni como se nos especifica en el enunciado del ejercicio
        letraDni = numDni % 23;

        // Con un if nos aseguramos que el usuario solo pueda introducir un número de 8 cifras. Si introduce alguno
        // ya sea mayor o menor de 8 cifras salta un mensaje de advertencia al usuario de que el número introducido no es válido
        if (numDni > 9999999 && numDni <= 99999999) {

            //Una vez que nos aseguramos que el número introducido tiene el número correcto de cifras, creamos un switch
            //para que se imprima la letra que le corresponde al resultado de la cuenta realizada anteriormente.
            switch (letraDni) {
                case 0 -> System.out.println(numDni + "T");
                case 1 -> System.out.println(numDni + "R");
                case 2 -> System.out.println(numDni + "W");
                case 3 -> System.out.println(numDni + "A");
                case 4 -> System.out.println(numDni + "G");
                case 5 -> System.out.println(numDni + "M");
                case 6 -> System.out.println(numDni + "Y");
                case 7 -> System.out.println(numDni + "F");
                case 8 -> System.out.println(numDni + "P");
                case 9 -> System.out.println(numDni + "D");
                case 10 -> System.out.println(numDni + "X");
                case 11 -> System.out.println(numDni + "B");
                case 12 -> System.out.println(numDni + "N");
                case 13 -> System.out.println(numDni + "J");
                case 14 -> System.out.println(numDni + "Z");
                case 15 -> System.out.println(numDni + "S");
                case 16 -> System.out.println(numDni + "Q");
                case 17 -> System.out.println(numDni + "V");
                case 18 -> System.out.println(numDni + "H");
                case 19 -> System.out.println(numDni + "L");
                case 20 -> System.out.println(numDni + "C");
                case 21 -> System.out.println(numDni + "K");
                case 22 -> System.out.println(numDni + "E");
            }

        } else
            System.out.println("Debes introducir un numero de 8 cifras");

        //Cerramos el scanner
        sc.close();
    }
}
