import java.util.Scanner;

public class Array_Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(" Hello world ");
//        int rows = sc.nextInt();
//        int colos = sc.nextInt();
//
//        int[][] nums = new int[rows][colos];

        // Input
        // Rows
//        for (int i = 0; i<rows; i++){
//            // columns
//            for (int j = 0; j<colos; j++){
//                nums[i][j] = sc.nextInt();
//            }
//        }
//        // Output
//        for (int i = 0; i<rows; i++){
//            for (int j =0; j<colos; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
        int c = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[c][r];
        // Input
        for (int i = 0; i<c; i++){
            for (int j = 0; j<r; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i<c; i++){
            for (int j = 0; j<r; j++){
//                System.out.print(matrix[i][j]);
                if (matrix[i][j] == 3){
                    System.out.println(" 3 found at " + i + " "+ j + " Location");
                    return;
                }
            }
                System.out.println("Value not found");

        }
    }
}
