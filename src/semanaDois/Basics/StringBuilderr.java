package semanaDois.Basics;

public class StringBuilderr {
    static void main() {

        StringBuilder sb = new StringBuilder();

        sb.append("Olá, ");
        sb.append("meu nome é ");
        sb.append("Luca Lopes.");

        String fraseFinal = sb.toString();

        System.out.println(fraseFinal);

        StringBuilder sb2 = new StringBuilder();

        String resultado = sb.append(" Eu sou um")
                             .append(" ")
                             .append("backend dev.")
                             .toString();

        System.out.println(resultado);

    }
}
