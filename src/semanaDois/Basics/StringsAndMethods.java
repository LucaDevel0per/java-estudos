package semanaDois.Basics;

public class StringsAndMethods {
    static void main() {


        // Principais métodos

        String s1 = "Java";
        String s2 = new String("Java");

        // errado
        if (s1 == s2) {
            System.out.println("XTRANHO...");
        }

        // certo
        if (s1.equals(s2)) {
            System.out.println("Nem tão XTRANHO!");
        }

        // Ignora maiscula/minuscula
        if (s1.equalsIgnoreCase("java")) {
        }

        // length() - isEmpty() / isBlank()

        String email = "   ";

        int size = email.length(); // 3 (espaços contam)
        boolean vazio = email.isEmpty(); // false(espaço conta como caractere)
        boolean branco = email.isBlank(); // true (ignora espaços em branco)

        // substring

        String data = "2025-12-25";
        // Pega do índice 0 (inclusivo) até o 4 (exclusivo)
        String ano = data.substring(0, 4); // "2025"
        String mes = data.substring(5, 7); // "12"
        String dia = data.substring(8, 10);

        System.out.println(dia);

        // contains(), startsWith(), endsWith()

        String archive = "relatorio_vendas_outubro.pdf";

        if (archive.endsWith(".pdf")) {
            System.out.println("É um PDF.");
        }
        if (archive.contains("vendas")) {
            System.out.println("É um relatorio de vendas.");
        }


        //5. replace() e trim() (Limpeza e Substituição)

        //Sanitização de dados. O trim() remove espaços nas pontas (o strip() é a versão moderna e melhorada do Java 11+).


        String entradaUsuario = "  Olá Mundo  ";
        String limpa = entradaUsuario.trim(); // "Olá Mundo"

        String texto = "O Java é difícil";
        String corrigido = texto.replace("difícil", "incrível"); // "O Java é incrível"


        String nomeUser = "   Pedro de Francisco Antonio  ";

        if (nomeUser == null || nomeUser.isBlank()) {
            System.out.println("Erro: Nome inválido");
            return;
        }

        String nomeProcessado = nomeUser.trim();

        if(nomeProcessado.length() > 20) {
            nomeProcessado = nomeProcessado.substring(0,20);
        }

        nomeProcessado = nomeProcessado.toUpperCase();

        System.out.println("Resultado: " + nomeProcessado);


    }
}
