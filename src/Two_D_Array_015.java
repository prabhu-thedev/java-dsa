import java.util.Scanner;

public class Two_D_Array_015 {
    Scanner sc = new Scanner(System.in);

    static void printArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
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

    static void transposeMatrix(int[][] a,int r, int c){
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) { // cols
            for (int j = 0; j < r; j++) { // rows
                ans[i][j] = a[j][i];
            }
        }
        System.out.println("Transposed Matrix :- ");
        printArray(ans);
    }

    // Transpose in and store in  same array
    static void transposeInPlace(int[][] matrix, int r, int c){
    // Worked on only square matrix
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // Swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        printArray(matrix);
    }

    // Reversing an array
    static void reverseArray(int [] array){
        int i = 0;
        int j = array.length - 1;
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    // Rotate array
    static void rotateMatrix(int[][] matrix, int n){
        // Transpose
        transposeInPlace(matrix,n,n);
        // reverse each row of transpose matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }

    }

    // Pascal Triangle
    static void pascalTraingle(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i + 1
            ans[i] = new int[i+1];
            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        printArray(ans);
    }

    // Spiral Order
    static void spiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements =  0;

        while (totalElements < r * c){
            // top row -> LeftCol to rightCol
            for (int i = leftCol; i <= rightCol && totalElements < r * c; i++) {
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            // right -> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // bottom -> rightCol to LeftCol
            for (int i = rightCol; i >= leftCol && totalElements < r * c; i--) {
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol -> buttomRow to TopRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    // Generating Spiral Order
    static void spiralOrderGen(int n){
        int[][] ans = new int[n][n];
       int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int curr = 1;
        while (curr <  n*n){
            // Top Row
            for (int i = leftCol; i <= rightCol && curr < n * n; i++) {
                ans[topRow][i] = curr++;
            }
            topRow++;
            // right col
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                ans[i][rightCol] = curr++;
            }
            rightCol--;
            // bottomRow
            for (int i = rightCol; i >= leftCol && curr < n * n; i--) {
                ans[bottomRow][i] = curr++;
            }
            bottomRow--;
            // left Col
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                ans[i][leftCol] = curr++;
            }

            leftCol++;

        }
        printArray(ans);

    }

    // Sum of Rectangle
    static void rectSum(int[][] matrix,int l1,int r1,int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

    // Finding prefix sum of rows
    static void FindpreFixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

       for (int i = 0; i < r; i++) {
           for (int j = 1; j < c; j++) {
               matrix[i][j] += matrix[i][j-1];
           }
       }
    }

    // Finding prefix sum of cols
    static void FindpreFixSumMatrix2(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    static void rectSum2(int[][] matrix,int l1,int r1,int l2, int r2){
        int sum = 0;
        FindpreFixSumMatrix(matrix);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row 1
            if (r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }else {
                sum += matrix[i][r2];
            }

        }
        System.out.println(sum);
    }

    static void rectSum3(int[][] matrix, int l1,int r1,int l2, int r2){
        FindpreFixSumMatrix2(matrix);
        printArray(matrix);
        System.out.println(matrix[l2][r2]);
    }

    public static void main(String[] args) {
        System.out.println("Program started ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and column of matrix 1");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] a = new int[row1][col1];
        // Input
        System.out.println("Enter " + row1*col1 + " Elements on matrix 1");
        for (int i = 0; i < row1; i++) { // rows
            for (int j = 0; j < col1; j++) { // columns
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the coordinates");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
/*

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
        printArray(a);
        add(a,r1,c1,b,r2,c2);
        multiplication(a,r1,c1,b,r2,c2);
        transposeMatrix(a,r1,c1);
        System.out.println("transpose matrix");
        transposeInPlace(a,r1,c1);
        System.out.println("Rotated");
        rotateMatrix(a,r1);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        pascalTraingle(n);
        System.out.println("Spiral Order");
        spiralOrder(a,r1,c1);


        System.out.println("Enter the n value");
        int n = sc.nextInt();
        System.out.println("Generated 2d Matrix : ");
        spiralOrderGen(n);
 */
        System.out.println("Sum of rect matrix 1");
        rectSum(a,l1,r1,l2,r2);
        System.out.println("Sum of rect matrix 2");
        rectSum2(a,l1,r1,l2,r2);
        System.out.println("Sum of rect matrix 3");
        rectSum3(a,l1,r1,l2,r2);
    }
}
