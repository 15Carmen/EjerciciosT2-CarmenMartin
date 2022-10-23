package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un programa que solicite al usuario un número entero entre 1 y 99. El programa debe mostrarlo con letras,
    por ejemplo, para 56 se verá: “cincuenta y seis”.
     */

    /*

     */
    public static void main(String[] args) {

        //Decalramos las variables
        int num;
        int primeraCifra, segundaCifra;
        String primeraCifraStr = "", segundaCifraStr = "";

        //Decalramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num
        System.out.println("Introduzca un número: ");
        num=sc.nextInt();

        //Separmos el número introducido en dos cifras distintas
        primeraCifra=num/10;
        segundaCifra=num%10;

        if (num>0 && num<100){
            if ((num>=10 && num<=15)||num==20||num==0){
                switch (num) {
                    case 0 -> System.out.println("cero");
                    case 10 -> System.out.println("diez");
                    case 11 -> System.out.println("once");
                    case 12 -> System.out.println("doce");
                    case 13 -> System.out.println("trece");
                    case 14 -> System.out.println("catorce");
                    case 15 -> System.out.println("quince");
                    case 20 -> System.out.println("veinte");
                }
            } else{
                switch (primeraCifra){
                    case 0 -> primeraCifraStr="";
                    case 1 -> primeraCifraStr="dieci";
                    case 2 -> primeraCifraStr="veinti";
                    case 3 -> primeraCifraStr="treinta";
                    case 4 -> primeraCifraStr="cuarenta";
                    case 5 -> primeraCifraStr="cincuenta";
                    case 6 -> primeraCifraStr="sesenta";
                    case 7 -> primeraCifraStr="setenta";
                    case 8 -> primeraCifraStr="ochenta";
                    case 9 -> primeraCifraStr="noventa";
                }

                switch (segundaCifra){
                    case 0 -> segundaCifraStr="";
                    case 1 -> segundaCifraStr="uno";
                    case 2 -> segundaCifraStr="dos";
                    case 3 -> segundaCifraStr="tres";
                    case 4 -> segundaCifraStr="cuatro";
                    case 5 -> segundaCifraStr="cinco";
                    case 6 -> segundaCifraStr="seis";
                    case 7 -> segundaCifraStr="siete";
                    case 8 -> segundaCifraStr="ocho";
                    case 9 -> segundaCifraStr="nueve";
                }

                if (primeraCifra== 0|| primeraCifra==1 || primeraCifra== 2 || segundaCifra==0){
                    System.out.println(primeraCifraStr + segundaCifraStr);
                }else {
                    System.out.println(primeraCifraStr + " y " + segundaCifraStr);
                }
            }
        }else {
            System.out.println("Número introducido no válido");
        }

    }
}
