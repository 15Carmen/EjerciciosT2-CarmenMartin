package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de
    incrementarle un segundo.
     */
    public static void main(String[] args) {

        int horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca las horas: ");
        horas = sc.nextInt();
        System.out.println("introduzca los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Introduzca los segundos: ");
        segundos = sc.nextInt();

        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            segundos++;
            if (segundos==60){
                segundos = 0;

                minutos++;
                if (minutos==60){
                    minutos=0;

                    horas++;
                    if (horas==24){
                        horas=0;
                    }
                }
            }

            System.out.println("Un segundo después la hora es "+ String.format("%d:%d:%d", horas, minutos, segundos));
        }else {
            System.out.println("Valores introducidos no válidos");
        }
    }
}
