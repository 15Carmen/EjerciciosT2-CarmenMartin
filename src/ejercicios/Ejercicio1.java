package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación
    tendrá que indicar si el número introducido es capicúa.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un numero menor que 0 y que salga el mensaje de error configurado para este caso
        · Introducir un numero mayor que 9999 y que salga el mensaje de error configurado para este caso
        · Introducir un número de 1 cifra y que independientemente de cual se salga como resultado capicúa
        · Introducir un numero de dos cifras que sean iguales y que salga como resultado capicúa
        · Introducir un numero de dos cifras que sean distintas y que salga como resultado no capicúa
        · Introducir un numero de tres cifras que sean iguales la primera y la última y que salga como resultado capicúa
        · Introducir un numero de tres cifras que sean distintas la primera y la última y que salga como resultado no capicúa
        · Introducir un numero de cuatro cifras que sean iguales la primera y la última, y las dos cifras de en medio
            y que salga como resultado capicúa
        · Introducir un numero de cuatro cifras que sean distintas la primera y la última y que salga como resultado no capicúa

     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num; //Variable donde vamos a guardar el numero introducido por el usuario
        int unidades, decenas, centenas, millares; //Variables donde vamos a guardar las diferentes cifras que
                                                    // componen al número introducido por consola

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entre 0 y 9999 y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero entre 0 y 9999");
        num = sc.nextInt();

        //separamos el número introducido en cifras
        millares = num / 1000;
        centenas = (num / 100) % 10;
        decenas = (num / 10) % 10;
        unidades = num % 10;

        if (num >= 0 && num <= 9999) {

            if (num <= 9) {
                System.out.println("Es capicua");

            } else if (num <= 99) {
                if (unidades == decenas) {
                    System.out.println("Es capicua");
                } else
                    System.out.println("No es capicua");

            } else if(num<=999) {
                if (unidades==centenas){
                    System.out.println("Es capicua");
                }else
                    System.out.println("No es capicua");

            } else{
                if (unidades==millares&&decenas==centenas){
                    System.out.println("Es capicua");
                }else
                    System.out.println("No es capicua");
            }
        }else
            System.out.println("Numero no valido");

        //Cerramos el scanner
        sc.close();
    }
}
