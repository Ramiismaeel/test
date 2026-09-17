import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte a = 127;
        long c = 244_34232434_234L;
        int b = 2147483647;
        b = 4;
        System.out.println(b + 2);
        long ms = 1000 * 60 * 60 * 24 * 30L;
        System.out.println(ms);
        int x = 7;
        int y = 7;
        int result = x % y;
        System.out.println(result);

        float r = 1.555354535353535353534543535355F;
        System.out.println(r);

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("-------");
        String age = scanner.nextLine();

        System.out.println("your name is: " + name + " - age: " + age);
        scanner.close();

    }
}
