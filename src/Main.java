import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + add(a, b));

        System.out.print("Enter four numbers: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println(c + " + " + d + " + " + e + " + " + f + " = " + add(c, d, e, f));

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Good morning," + " " + name + "!\n");

        System.out.print("Enter your name: ");
        String name2 = scanner.next();
        System.out.println("Good afternoon," + " " + name2 + "!\n");

        System.out.print("Enter a phrase: ");
        String x = scanner.next();
        System.out.println(multiply(x));

        System.out.print("Enter another number: ");
        double y = scanner.nextDouble();
        System.out.println(y + " / 2 = " + half(y));

        System.out.print("Enter a positive decimal number:");
        double z = scanner.nextDouble();
        System.out.println(z + " rounded becomes " + round(z));

        System.out.print("Enter a negative decimal number:");
        double k = scanner.nextDouble();
        System.out.print(k + " rounded becomes " + roundNegative(k));
    }

    // 1. add
    public static int add(int a, int b) {
        return (int) (a + b * 1.0);
    }

    // 2. add
    public static int add(int c, int d, int e, int f) {
        return (int) (c + d + e + f * 1.0);
    }

    // 3. morningGreeting
    public static String morningGreeting(String n) {
        return "";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String n) {
        return "";
    }

    // 5. triple
    public static String multiply(String x) {
        return x + x + x;
    }

    // 6. half
    public static double half(double n) {
        return (int) (n / 2);
    }

    // 7. roundPositiveValueToNearestInteger
    public static double round(double z) {
        return Math.round(z);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegative(double p) {
        return Math.round(p * -1) * -1;
    }
}