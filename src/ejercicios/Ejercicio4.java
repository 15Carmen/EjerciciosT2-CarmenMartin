package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un programa que solicite al usuario un número entero entre 1 y 99. El programa debe mostrarlo con letras,
    por ejemplo, para 56 se verá: “cincuenta y seis”.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un 0
                0 -> "cero"
        · Introducir un 10
                10 -> "diez"
        · Introducir un 15
                15 -> "quince"
        · Introducir un 20
                20 -> "veinte"
        · Introducir un 37
                37 -> "treinta y siete"
        · Introducir un 81
                81 -> "ochenta y uno"
        · Introducir un 50
                50 -> "cincuenta"
        · Introducir un 100 y que imprima el mensaje de error configurado
                100 -> "Número introducido no válido"
        · Introducir un -4 y que imprima el mensaje de error configurado
                -4 -> "Número introducido no válido"
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num;                                      //Variable donde guardaremos el numero introducido por el usuario
        int primeraCifra, segundaCifra;               //Variables donde guardaremos el resultado de dividir el número introducido en dos (ej: num=39 primeraCifra=3 segundaCifra=9)
        String primeraCifraStr, segundaCifraStr = ""; //Variables donde vamos a guardar los números escritos con letra

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();

        //Separamos el número introducido en dos cifras distintas
        primeraCifra = num / 10;   //La primera cifra la conseguimos dividiendo el número entre 10 y como es un int, solo guarda la primera cifra del número
        segundaCifra = num % 10;   //La segunda cifra la conseguimos haciendo el módulo de 10. El resto de la división entre 10 será la segunda cifra del número

        if (num >= 0 && num < 100) {                                      //Si el número introducido se encuentra entre 0 (incluyéndolo) y 100
            if ((num >= 10 && num <= 15) || num == 20 || num == 0) {      //Si el número introducido es igual a 0, 20 o se encuentra entre 10 y 15 (incluyéndolos)
                switch (num) {                                            //Con un switch le asignamos a los números que siguen esta condición su nombre con letra
                    case 0 -> System.out.println("cero");
                    case 10 -> System.out.println("diez");                //Ponemos estos números como condición en el if porque son los únicos que no pueden ser
                    case 11 -> System.out.println("once");                //creados como números compuestos (ej: 34 = treinta y cuatro), si no que tienen un nombre
                    case 12 -> System.out.println("doce");                //característico (ej: 11 = once)
                    case 13 -> System.out.println("trece");
                    case 14 -> System.out.println("catorce");
                    case 15 -> System.out.println("quince");
                    case 20 -> System.out.println("veinte");
                }
            } else {                                                      //Si no sigue esas condiciones
                switch (primeraCifra) {                                   //Hacemos dos switches, uno que pase la primera cifra y otro que pase la segunda
                    case 1 -> primeraCifraStr = "dieci";                  //En el caso del switch de la primera cifra, cada número equivale al comienzo de un número
                    case 2 -> primeraCifraStr = "veinti";                 //compuesto (cuarenta, cincuenta...)
                    case 3 -> primeraCifraStr = "treinta";                //Guardamos el número escrito con letra en la variable String declarada anteriormente
                    case 4 -> primeraCifraStr = "cuarenta";
                    case 5 -> primeraCifraStr = "cincuenta";              //En el caso de que haya un 0 como primera cifra no se escribiría nada (default)
                    case 6 -> primeraCifraStr = "sesenta";
                    case 7 -> primeraCifraStr = "setenta";
                    case 8 -> primeraCifraStr = "ochenta";
                    case 9 -> primeraCifraStr = "noventa";
                    default -> primeraCifraStr = "";
                }

                switch (segundaCifra) {                                   //En el caso del switch de la segunda cifra, cada número equivale con el final de un número
                    case 0 -> segundaCifraStr = "";                       //compuesto o bien con los 9 primeros números simples (1,2,3,4...9)
                    case 1 -> segundaCifraStr = "uno";                    //Guardamos el número escrito con letra en la variable String declarada anteriormente
                    case 2 -> segundaCifraStr = "dos";
                    case 3 -> segundaCifraStr = "tres";                   //En el caso del cero no escribimos nada, porque cuando un número compuesto termina en 0 este no se dice
                    case 4 -> segundaCifraStr = "cuatro";                 //(ej: 60 = sesenta), solo se nombra la primera parte del número compuesto
                    case 5 -> segundaCifraStr = "cinco";
                    case 6 -> segundaCifraStr = "seis";
                    case 7 -> segundaCifraStr = "siete";
                    case 8 -> segundaCifraStr = "ocho";
                    case 9 -> segundaCifraStr = "nueve";
                }

                if (primeraCifra == 0 || primeraCifra == 1 || primeraCifra == 2 || segundaCifra == 0) {  //Si la primera cifra es igual a 0, 1 o 2 o la segunda es igual a 0
                    System.out.println(primeraCifraStr + segundaCifraStr);                               //Imprimimos por pantalla los dos string juntos (ej: 16 = "dieci" + "seis")
                } else {                                                                                 //Si no es el caso
                    System.out.println(primeraCifraStr + " y " + segundaCifraStr);                       //Imprimimos por pantalla los dos string separados con un "y" entre los dos
                }                                                                                        //(ej: 84 = "ochenta" + " y " + "cuatro")
            }
        } else {
            System.out.println("Número introducido no válido");          //Si el numero introducido por el usuario no se encuentra entre 0 (incluyéndolo) y 100, imprimimos un mensaje de error
        }

        //Cerramos el scanner
        sc.close();

    }
}
