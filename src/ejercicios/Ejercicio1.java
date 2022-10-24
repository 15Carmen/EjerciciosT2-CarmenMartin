package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación
    tendrá que indicar si el número introducido es capicúa.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un número menor que 0 y que salga el mensaje de error configurado para este caso
                0 -> "Número no válido"
        · Introducir un número mayor que 9999 y que salga el mensaje de error configurado para este caso
                123456 -> "Número no válido"
        · Introducir un número de 1 cifra y que independientemente de cuál sea salga como resultado capicúa
                5 -> "Es capicúa"
        · Introducir un numero de dos cifras que sean iguales y que salga como resultado capicúa
                22 -> "Es capicúa"
        · Introducir un numero de dos cifras que sean distintas y que salga como resultado no capicúa
                37 -> "No es capicúa"
        · Introducir un numero de tres cifras que sean iguales la primera y la última y que salga como resultado capicúa
                131 -> "Es capicúa"
        · Introducir un numero de tres cifras que sean distintas la primera y la última y que salga como resultado no capicúa
                789 -> "No es capicúa"
        · Introducir un numero de cuatro cifras que sean iguales la primera y la última, y las dos cifras de en medio
          y que salga como resultado capicúa
                4554 -> "Es capicúa"
        · Introducir un numero de cuatro cifras que sean distintas la primera y la última y que salga como resultado no capicúa
                1234 -> "No es capicúa"

     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;                                   //Variable donde vamos a guardar el numero introducido por el usuario
        int unidades, decenas, centenas, millares; //Variables donde vamos a guardar las diferentes cifras que componen al número introducido por consola

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

        if (num >= 0 && num <= 9999) {                             //Si el número introducido se encuentra entre 0 y 9999

            if (num <= 9) {                                        //Si el número es menor o igual a 9 se imprime que es capicúa
                System.out.println("Es capicua");

            } else if (num <= 99) {                                //Si el número es menos o igual que 99
                if (unidades == decenas) {                         //y las decenas del número son iguales a sus unidades
                    System.out.println("Es capicua");              //se imprime que es capicúa
                } else                                             //Si las unidades no son iguales a las decenas se imprime que no es capicúa
                    System.out.println("No es capicua");

            } else if (num <= 999) {                               //Si el número introducido es menor o igual a 999
                if (unidades == centenas) {                        //y las unidades del número son iguales a sus centenas
                    System.out.println("Es capicua");              //se imprime que es capicúa
                } else                                             //Si las unidades no son iguales a las centenas se imprime que no es capicúa
                    System.out.println("No es capicua");

            } else {                                               //Si el número introducido es menor o igual a 9999
                if (unidades == millares && decenas == centenas) { //y las unidades del número son iguales a sus millares y las decenas iguales a las centenas
                    System.out.println("Es capicua");              //se imprime que es capicúa
                } else                                             //si no es el caso, se imprime que no es capicúa
                    System.out.println("No es capicua");
            }
        } else                                                     //Sin no se encuentra el numero en el rango establecido imprimimos un mensaje de error
            System.out.println("Numero no valido");

        //Cerramos el scanner
        sc.close();
    }
}
