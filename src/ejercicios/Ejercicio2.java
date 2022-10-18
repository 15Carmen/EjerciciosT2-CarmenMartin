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
    public static void main(String[] args) {

        int numDni;
        int letraDni;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número entre 0 y 9999 y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero de 8 cifras");
        numDni = sc.nextInt();

        if (numDni>9999999 && numDni<=99999999){
            letraDni = numDni%23;
            switch (letraDni){
                case 0->{
                    System.out.println(numDni+letraDni);
                }
                case 1->{
                    System.out.println(numDni+letraDni);
                }
                case 2->{
                    System.out.println(numDni+letraDni);
                }
                case 3->{
                    System.out.println(numDni+letraDni);
                }
                case 4->{
                    System.out.println(numDni+letraDni);
                }
                case 5->{
                    System.out.println(numDni+letraDni);
                }
                case 6->{
                    System.out.println(numDni+letraDni);
                }
                case 7->{
                    System.out.println(numDni+letraDni);
                }
                case 8->{
                    System.out.println(numDni+letraDni);
                }
                case 9->{
                    System.out.println(numDni+letraDni);
                }
                case 10->{
                    System.out.println(numDni+letraDni);
                }
                case 11->{
                    System.out.println(numDni+letraDni);
                }
                case 12->{
                    System.out.println(numDni+letraDni);
                }
                case 13->{
                    System.out.println(numDni+letraDni);
                }
                case 14->{
                    System.out.println(numDni+letraDni);
                }
                case 15->{
                    System.out.println(numDni+letraDni);
                }
                case 16->{
                    System.out.println(numDni+letraDni);
                }
                case 17->{
                    System.out.println(numDni+letraDni);
                }
                case 18->{
                    System.out.println(numDni+letraDni);
                }
                case 19->{
                    System.out.println(numDni+letraDni);
                }
                case 20->{
                    System.out.println(numDni+letraDni);
                }
                case 21->{
                    System.out.println(numDni+letraDni);
                }
                case 22->{
                    System.out.println(numDni+"E");
                }
            }

        }else
            System.out.println("Debes introducir un numero de 8 cifras");
    }
}
