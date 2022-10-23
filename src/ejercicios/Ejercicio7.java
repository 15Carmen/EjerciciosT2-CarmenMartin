package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de
    incrementarle un segundo.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir hora mayor que 24 y que salga el mensaje de error configurado
        · Introducir hora menor que 0 y que salga el mensaje de error configurado
        · Introducir minutos menor que 0 y que salga el mensaje de error configurado
        · Introducir minutos mayor que 59 y que salga el mensaje de error configurado
        · Introducir segundos menor que 0 y que salga el mensaje de error configurado
        · Introducir segundos mayor que 59 y que salga el mensaje de error configurado
        · Introducir segundos igual a 59 y que devuelva segundos igual a 0 y los minutos sean uno más
        · Introducir segundos y minutos igual a 59 y que devuelva como resultado segundos y minutos igual a 0
        y que la hora sea una más
        · Introducir segundos y minutos igual a 59 y hora igual a 23 y que devuelva la hora 0:0:0
    */

    public static void main(String[] args) {

        //Declaramos las variables
        int horas, minutos, segundos; //Variables donde vamos a guardar los datos introducidos por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca la hora del día y guardamos las respuestas en las variables declaradas
        //previamente
        System.out.println("Introduzca la hora del día (solo la hora): ");
        horas = sc.nextInt();
        System.out.println("Introduzca ahora los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Introduzca los segundos (hay que ser precisos): ");
        segundos = sc.nextInt();


        if (horas >= 0 && horas <= 23               //Si las horas están en el rango 0-23,
            && minutos >= 0 && minutos <= 59        //y los minutos y segundo en el rango 0-59
            && segundos >= 0 && segundos <= 59) {
            segundos++;                             //sumamos 1 a los segundos introducidos
            if (segundos==60){                      //Si el resultado de la suma es 60
                segundos = 0;                       //igualamos los segundos a 0

                minutos++;                          //y sumamos 1 a los minutos introducidos
                if (minutos==60){                   //Si el resultado de la suma es 60
                    minutos=0;                      //igualamos los minutos a 0

                    horas++;                        //y sumamos 1 a las horas introducidas
                    if (horas==24){                 //Si el resultado de la suma es 24
                        horas=0;                    //igualamos las horas a 0
                    }
                }
            }
                                                    //Imprimimos por consola la hora introducida un segundo después
            System.out.println("Un segundo después la hora es "+ String.format("%d:%d:%d", horas, minutos, segundos));

        }else {                                     //Si las horas, minutos o segundos no entran en el rango establecido
                                                    //Imprimimos un mensaje de error
            System.out.println("Valores introducidos no válidos");
        }

        //Cerramos el scanner
        sc.close();
    }
}
