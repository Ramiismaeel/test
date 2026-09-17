import java.util.Scanner;

public class State {
    static void main() {
        int age = 20;

        if (age >= 18) {
            System.out.println("Volljährig");
        }


        int num = 30;
        if (num >= 30) {
            System.out.println("Heiß");

        } else if (num < 30 && num >= 20) {
            System.out.println("Warm");
        } else if (num < 20 && num >= 10) {
            System.out.println("kühl");
        } else {
            System.out.println("Kalt");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Ungültiger Name");
        } else {
            System.out.println("Hallo, " + name);
        }

        scanner.close();
    }


}
