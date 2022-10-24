package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que si el número de días
    de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%. El precio por
    kilómetro es de 2,5€. La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado.
     */

    /*
    Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir una estancia mayor que 7 y una distancia mayor que 800 y que se imprima el precio con descuento
        · Introducir una estancia mayor que 7 y una distancia menor que 800 y que se imprima el precio sin descuento
        · Introducir una estancia menor que 7 y una distancia mayor que 800 y que se imprima el precio sin descuento
        · Introducir una estancia menor que 7 y una distancia menor que 800 y que se imprima el precio sin descuento

     */
    public static void main(String[] args) {

        //Declaramos las constantes
        final double PRECIO_KM = 2.5;
        final double DESCUENTO = 0.3;

        //Declaramos las variables
        int distancia, estancia; //Variables donde vamos a guardar las respuestas introducidas por el usuario
        double precioBillete;    //Variable donde vamos a guardar el resultado del cálculo del precio del billete de tren

        //Declaramos el scanner par poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario cuantos km aproximadamente va a recorrer y guardamos la respuesta en la variable
        //previamente declarada
        System.out.println("Introduzca cuántos km va a recorrer aproximadamente: ");
        distancia = sc.nextInt();

        //Le pedimos ahora al usuario que introduzca cuantos dias durará su estancia y guardamos la respuesta en la
        //variable previamente declarada
        System.out.println("Introduzca la duración de su estancia: ");
        estancia = sc.nextInt();


        if (estancia > 7 && distancia > 800) {                                               //Si la estancia es superior a 7 la distancia mayor que 800
            precioBillete = (distancia * PRECIO_KM) - ((distancia * PRECIO_KM) * DESCUENTO); //Calculamos el precio total con descuento
        } else {                                                                             //Si no es el caso
            precioBillete = distancia * PRECIO_KM;                                           //Calculamos el precio sin descuento
        }
        System.out.println("Debe pagar " + precioBillete + "€");                             // y lo imprimimos por pantalla

        //Cerramos el scanner
        sc.close();

    }
}
