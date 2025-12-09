package semanaUm.basics;

import java.util.Scanner;

public class DesafioS1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        String adjtivo1;
        String adjtivo2;
        String substantivo1;
        String verb1;
        String adjtivo3;

        System.out.print("Escreva um adjetivo(Descritivo): ");
        adjtivo1 = scanner.nextLine();
        System.out.print("Escreva um substantivo(aniaml ou pessoa): ");
        substantivo1 = scanner.nextLine();
        System.out.print("Escreva um adjetivo(Descritivo): ");
        adjtivo2 = scanner.nextLine();
        System.out.print("Escreva um verbo que termine em -ndo (Ação): ");
        verb1 = scanner.nextLine();
        System.out.print("Escreva um adjetivo(Descritivo): ");
        adjtivo3 = scanner.nextLine();

        System.out.println(" ");
        System.out.println("Hoje Eu fui a um  zoologico " + adjtivo1 );
        System.out.println("Numa exibição, eu vi um " + substantivo1);
        System.out.println("O " + substantivo1 + " era " + adjtivo2 + " e estava " + verb1 + "!");
        System.out.println("Eu estava " + adjtivo3 + "!");

        scanner.close();

    }
}
