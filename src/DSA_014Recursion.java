import java.util.Scanner;

/*
       NOTES :-
 - Recursion is function which is itself
 - Base class terminates the infinite loop
 - we solve the bigger problem by solving smaller problems

 -> Functions -> Problem -> Subproblem -> Solution

 The Recursion Spell :-
   1. Identify the smaller problem (Sub problem) -> Let recursion solve it
   2. Self work - Do your work
   3. Identify the base case -> Smallest input for which the answer is very obvious - To prevent Stack Overflow
   * Why do we need recursion :
                               To solving complex problem in easy way by defile it in sub problems
*/

public class DSA_014Recursion {

    // Print 1 to n
    static void printIncreasing(int n){
        if (n == 1){ // Breaks the function calling and start prints n value - Halting Condition or Base case
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1); // 1, 2, 3, 4
        System.out.print(n + " "); // 5
    }

    // Print n to 1
    static void printDecreasing(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }

    // 5 factorial
    static int factorial(int n){
        // base case
        if (n == 0)
            return 1;
        // Recursive Work
        int smallAns = factorial(n-1);
        // self work
        return n * smallAns;
    }
    // Fibonacci nth number
    static int fibonacci(int n){
        // Base cae
        if (n == 0 || n == 1) return n;
        // sub problem

        return fibonacci(n-1) + fibonacci(n-2);
/*
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);
         self work
        return prev + prevPrev;
*/
    }
    // sum of given integer
    static int sumOfDigits(int n){
        if (n >= 0 && n <= 9)
            return n;
        // recursive work --> small answer
        int smallAns = sumOfDigits(n/10);
        // Self work
        return smallAns + n%10;

    }
    // print the num multiples up to k
    static void multiples(int n, int k){
/*
        if (k > 0){
            int i = 0;
            while (i < 5){
                System.out.print(n * i + " ");
                i++;
            }
        }
*/
        if (k == 1){
            System.out.print(n + " ");
            return;
        }
        multiples(n,k-1);
        System.out.print(n * k + " ");
    }
    // sum of given n
    static int sum(int n){
        if (n == 0)
           return n;
        int ans = sum(n-1);
        return ans + n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
//        int k = sc.nextInt();
/*
        printIncreasing(n);
        printDecreasing(n);

        System.out.println(factorial(n));
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println(sumOfDigits(n));
*/
//        multiples(n,k);
        System.out.println(sum(n));
    }
}
