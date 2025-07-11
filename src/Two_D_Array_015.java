import java.util.Scanner;

public class Two_D_Array_015 {
    Scanner sc = new Scanner(System.in);

    static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1,int c1,int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Wrong input operation cannot possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) { // rows
            for (int j = 0; j < c1; j++) { // column
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrix ");
        printArray(sum);
    }

    static void multiplication(int[][] a, int r1,int c1,int[][] b, int r2, int c2){
        if (c1 != r2){
            System.out.println("Wrong input - Multiplication not possible");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) { // row
            for (int j = 0; j < c2; j++) { // column
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Answer matrix");
        printArray(mul);
    }

    public static void main(String[] args) {
        System.out.println("Program started ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        // Input
        System.out.println("Enter " + r1*c1 + " Elements on matrix 1");
        for (int i = 0; i < r1; i++) { // rows
            for (int j = 0; j < c1; j++) { // columns
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter number of rows and column of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        // Input
        System.out.println("Enter " + r2*c2 + " Elements on matrix 2");
        for (int i = 0; i < r2; i++) { // rows
            for (int j = 0; j < c2; j++) { // columns
                b[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix one");
        printArray(a);
        System.out.println("Matrix two");
        printArray(b);
//        printArray(a);
        add(a,r1,c1,b,r2,c2);
//        multiplication(a,r1,c1,b,r2,c2);

    }
}
