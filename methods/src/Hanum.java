import java.util.Scanner;

public class Hanum {

    public int x1, x2;
    static void hanum(int x1, int x2) {
        System.out.println(x1 - x2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();

        hanum(x, y);
    }
}



