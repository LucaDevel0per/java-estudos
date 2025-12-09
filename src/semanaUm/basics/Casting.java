package semanaUm.basics;

public class Casting {
    static void main() {

        // CASTING* é uma conversão forçada ou auto de um tipo para outro.

        // Widening (Implícito, Sem Cast Explícito): Java faz sozinho, tipo int pra double.
        int numInt = 42;
        double numeroDecimal = numInt;
        System.out.println(numeroDecimal); // Output: 42.0

        // Narrowing (Explícito, Com Cast): Você força com (tipo), mas pode perder precisão ou dados.
        double pi = 3.14159;
        int piInt = (int) pi; // Narrowing: Corta os decimais, vira 3
        System.out.println(piInt);

    }
}
