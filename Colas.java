package codegym.pe.fileclass.lesson16;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Colas {
    public static void main(String[] args) {
        // Creando una cola con elementos de tipo entero
        Queue <Integer> numeros = new PriorityQueue<>();
        // Creando un objeto random de la librería Random para números aleatorios
        Random random = new Random();

        // añadiendo elementos a la cola.
        numeros.add(random.nextInt(5));
        numeros.add(random.nextInt(5));
        numeros.add(random.nextInt(5));
        numeros.add(random.nextInt(5));

        // mostrando por consola.
        System.out.println(numeros);
        System.out.println("El tamaño de la cola es de: "+numeros.size()+" elementos.");

        // encontrando elementos aleatorios de la cola usando condicionales.
        if (numeros.contains(random.nextInt(5))){
            System.out.println("¡Qué suerte tienes!");
        }else {
            System.out.println("Sigue intentando...");
        }

        // limpiando la cola
        numeros.clear();
        System.out.println(numeros);
    }
}
