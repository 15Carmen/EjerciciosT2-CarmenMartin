package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    En una granja se compra diariamente una cantidad de comida para los animales. Los animales son todos de la misma
    especie y sabemos que cada animal come los mismos kilos de comida de media diariamente.

    Diseña un programa que solicite al usuario los valores anteriores (cantidad de comida comprada, número de animales
    y kilos de comida que comen todos los animales en total), y determine si disponemos de alimento suficiente para
    cada animal. En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.

    Nota: Evita que la aplicación realice divisiones por cero.
     */

    /*
     Las pruebas realizadas para comprobar que el programa funciona son:
        · Introducir un número de animales menor que 0 y que salga el mensaje de error configurado para este caso
        · Introducir un número de kgComprados menor que de kgConsumidos y que salga el mensaje de error configurado
        para este caso
        · Introducir un número de kgComprados mayor o  igual que los kgConsumidos y que salga el mensaje configurado diciendo
        que hay comida suficiente para alimentar a los animales.
     */
    public static void main(String[] args) {

        //Declaramos las variables donde vamos a guardar las respuestas introducidas por el usuario
        int numAnimales;
        double kgComprados, kgConsumidos;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca los datos que se le piden y guardamos sus respuestas en las variables
        // anteriormente declaradas
        System.out.println("Introduzca cuántos animales tiene: ");
        numAnimales = sc.nextInt();
        System.out.println("Introduzca la cantidad de comida comprada hoy: ");
        kgComprados = sc.nextDouble();
        System.out.println("Introduzca la cantidad de comida que consumen los animales diariamente: ");
        kgConsumidos = sc.nextDouble();

        if (numAnimales>0){
            if (kgComprados>=kgConsumidos){

                kgComprados/=numAnimales;
                System.out.println("Sí dispone de comida suficiente para alimentar a sus animales. Hoy han consumido "+
                        String.format("%.2f", kgComprados)+"kg");

            }else{
                kgConsumidos/=numAnimales;

                System.out.println("Los kilos de comida consumidos no pueden superar a los comprados (¡tus animales se morirán de hambre!).");
                System.out.println("Tus animales deben consumir al menos "+String.format("%.2f", kgConsumidos)+"kg diariamente");
            }
        }else
            System.out.println("¿Para qúe compras comida de animales si no tienes animales?");

        //cerramos el scanner
        sc.close();
    }
}
