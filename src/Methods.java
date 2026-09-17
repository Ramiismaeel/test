public class Methods {
    static void main() {

        printHello();


        double area = calculateArea(5.5, 3.0);

        System.out.println("Area: " + area);


        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }


    public static void printHello() {
        System.out.println("Hallo Welt");
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
