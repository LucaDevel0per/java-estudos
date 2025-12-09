package semanaUm.basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Hello, " + fullName + "!");
        System.out.println("You're, " + age + " years old!");
        System.out.println("You're, " + weight + "kgs weight!");

        scanner.close();
    }
}
