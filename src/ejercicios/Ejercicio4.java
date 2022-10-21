package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un programa que solicite al usuario un número entero entre 1 y 99. El programa debe mostrarlo con letras,
    por ejemplo, para 56 se verá: “cincuenta y seis”.
     */
    public static void main(String[] args) {

        int num;
        String dieci="dieci";
        String ultimaCifraLetra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        num=sc.nextInt();

        int ultimaCifra=num%10;

        if (num<0&&num>100){
            System.out.println("Numero no válido");
        }else {

            switch (ultimaCifra){
                case 1-> System.out.println("uno");
                case 2 -> System.out.println("dos");
                case 3 -> System.out.println("tres");
                case 4 -> System.out.println("cuatro");
                case 5 -> System.out.println("cinco");
                case 6 -> System.out.println("seis");
                case 7 -> {
                    String.valueOf(ultimaCifra);
                    ultimaCifraLetra="siete";
                    ultimaCifraLetra.equals(ultimaCifra);

                }
                case 8 -> System.out.println("ocho");
                case 9 -> System.out.println("nueve");
            };

            if (num>=16&&num<=19){
                System.out.println(dieci+ultimaCifra);
            }
        }
    }
}
