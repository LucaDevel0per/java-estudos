package semanaDois.Basics;
import java.util.Scanner;


public class Desafio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println(item);

        scanner.close();
    }
}
