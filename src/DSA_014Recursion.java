import java.util.Scanner;

public class DSA_014Recursion {

    // Print 1 to n
    static void printIncreasing(int n){
        if (n==1){
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n-1); // 1, 2, 3, 4
        System.out.print(n + " "); // 5
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();

        printIncreasing(n);
    }
}
