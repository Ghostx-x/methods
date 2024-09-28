import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double a1 = x1 * x1;
        double b1 = y1 * y1;
        double c1 = Math.sqrt(a1 + b1);

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double a2 = x2 * x2;
        double b2 = y2 * y2;
        double c2 = Math.sqrt(a2 + b2);

        System.out.println( c2 > c1 ? "FIRST" : "SECOND");

    }
}
