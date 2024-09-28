public class arr {
    public static void main(String[] args) {
        int[][] mat = {{11, 23, 7, 9}, {8, 78, 54, 2}};

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }
}


//import java.util.Scanner;
//
//public class arr
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int [][]a = new int[n][m];
//        for(int k = 0; k < n * m; ++k) {
//            int i = k / m;
//            int j = k % m;
//            a[i][j] = i * j;
//            System.out.printf("%4d%s", a[i][j], j==m - 1 ? "\n" : "");
//        }
//    }
//}
