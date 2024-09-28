import java.util.Scanner;
public class calculator {
    public double x, y;
    public char symbol;

    static void gumar(double x, double y){
        System.out.println(x+y);
    }
    static void hanum(double x1, double y) {
        System.out.println(x1 - y);
    }
    static void angam(double x1, double y) {
        System.out.println(x1 * y);
    }
    static void bajanum(double x1, double y) {
        if (y == 0){
            System.out.println("Error");
        } else{
            System.out.println(x1 / y);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = in.nextDouble();
        System.out.print("Enter second number: ");
        double y = in.nextDouble();
        System.out.print("Enter the symbol: ");
        char symbol = in.next().charAt(0);

        if (symbol == '+') {
            gumar(x, y);
        } else if(symbol == '-'){
            hanum(x, y);
        } else if(symbol == '*'){
            angam(x, y);
        } else if(symbol == '/'){
            bajanum(x, y);
        } else{
            System.out.println("Error");
        }

    }

}
