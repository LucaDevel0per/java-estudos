package semanaDois.Basics;

public class Arrayss {
    static void main() {

        // iniciando arrays

            // adicionando o tamanho 0-4
        int[] numbers = new int[5];

            // add os items
        String[] fruits = { "Apple", "Banana", "Orange", "Grape", "Avocado" };

        int[] notas = new int[3];

        notas[0] = 10;
        notas[1] = 5;
        notas[2] = 8;

        System.out.println("Primeira nota: " + notas[0]);

        System.out.println(notas.length);
    }
}
