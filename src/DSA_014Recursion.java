import java.util.ArrayList;
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
    // sum of give n by sign
    static int sum2(int n){
        if (n == 0){
            return n;
        }
/*
        if (n % 2 == 0){
            int ans = sum2(n-1);
            return ans - n;
        }else {
            int ans = sum2(n-1);
            return ans + n;
        }
*/
        if (n % 2 == 0)
            return sum2(n-1) - n;
        else
            return sum2(n-1) + n;
    }
    // GCD brute force
    static int GCD(int x, int y){
        int i = 1;
        int result = 0;
        int min = Math.min(x,y);
        for ( i = 1; i <= min; i++) {
            if (x % i == 0 && y % i == 0){
                result = i;
            }
        }
       return result;
    }
    // Better approach
    static int GCD2(int x, int y){
        while (x%y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    // Recursive approach
    static int GCD3(int x, int y){
        if (y == 0)
            return x;
        return GCD3(y,x%y);
    }
    // Printing an array using recursive
    static void printArray(int[] arr, int idx){
        if (idx < arr.length -1)return;
        System.out.print(arr[idx] + " ");
        printArray(arr,idx+1);
    }
    static int findArraymax(int[] arr,int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = findArraymax(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
    static int findSum(int[] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        int sum = findSum(arr,idx+1);
        return sum += arr[idx];
    }
    // Finding the given value
    static void findValue(int[] arr, int idx, int target){
        if (idx > arr.length-1){
            System.out.println("Not found");
            return;
        }
        if (arr[idx] == target){
            System.out.println("Found " + idx);
            return;
        }
        findValue(arr,idx+1,target);
    }
    static int findValue2(int[] arr, int idx, int target){
        if (idx == arr.length -1)
            return -1;
        if (arr[idx] == target)
            return idx;
        return findValue2(arr, idx + 1, target);
    }
    // printing the indices of array from given n
    static void printIndices(int[] arr, int idx, int n){
        if (idx >= arr.length)
            return;
        if (arr[idx] == n){
            System.out.print(idx + " ");
        }
        printIndices(arr,idx+1,4);
    }
    // returning indices in arrayList
    static ArrayList<Integer> allIndices(int[] arr, int n, int target,int idx){
        // base case
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >=  n){
            return ans; // return empty array list
        }
        // Self work
        if (arr[idx] == target){
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns =  allIndices(arr,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    // checking is array sorted or not
    static boolean isSorted(int[] arr,int idx,int n){
        boolean isSorted = false;
        if (idx >= n-1){
            return true;
        }
        if (arr[idx] > arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1,n);
    }
    // return subsequent
    static ArrayList<String> getSSQ(String s){
         ArrayList<String> ans = new ArrayList<>();
         //
            if (s.isEmpty()){
                ans.add(" ");
                return ans;
            }
        char curr = s.charAt(0);
        // Recursive work
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        // self work
        for (String ss:smallAns) {
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    // printing subsequent
    static void printSSQ(String s, String currAns){
        // base case
        if (s.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        // recursive work
            printSSQ(remString,currAns + curr); // add curr
            printSSQ(remString,currAns); // do not add curr
    }
    // print sum of sub sets of array
    static void subSetSum(int[] a,int n,int idx, int sum){
        if (idx >= n){
            System.out.println(sum);
            return;
        }
        // curr isd + curr ans - include
            subSetSum(a,n,idx+1,sum+a[idx]);
        // curr ans - exclude
        subSetSum(a,n,idx+1,sum);
    }
    static int frogJump(int[] h, int n,int idx){
         if (idx == n-1){
             return 0;
         }
         int op1 = Math.abs(h[idx] - h[idx+1]) + frogJump(h,n,idx+1);
         if (idx == n-2) return op1;
         int op2 = Math.abs(h[idx] - h[idx+2]) + frogJump(h,n,idx+2);
         return Math.min(op1,op2);
    }
    static void combinations(String s,String res,String[] kp){ // 253
        if (s.isEmpty()){
            System.out.println(res);
            return;
        }
        int currNum = s.charAt(0) - '0';
        String currChoices = kp[currNum];
        for (int i = 0; i<currChoices.length(); i++){
            combinations(s.substring(1),res+currChoices.charAt(i),kp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n value");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr2 = {
                1,2,4,4,5,4
        };
        int n = arr2.length;

//        int y = sc.nextInt();
//        int k = sc.nextInt();
/*
        printIncreasing(n);
        printDecreasing(n);

        System.out.println(factorial(n));
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(sumOfDigits(n));
        multiples(n,k);
        System.out.println(sum(n));
        System.out.println(sum2(n));
        System.out.println(GCD(n,y));
        System.out.println(GCD2(n,y));
        System.out.println(GCD3(n,y));
        printArray(arr2,0);
        System.out.println(arr2.length-1);
        System.out.println(findArraymax(arr2,0));
        System.out.println(findSum(arr2,0));
        System.out.println(findValue2(arr2,0,8));
        printIndices(arr2,0,4);
       ArrayList<Integer> ans = allIndices(arr2,n,4,0);
       for (Integer i: ans){
           System.out.print(i + " ");
       }
        if (isSorted(arr2,0,n)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        ArrayList<String> ans =  getSSQ("abc");

        for (String ss: ans){
            System.out.println(ss);
        }
        printSSQ("abc" , " ");
        int[] a = {2,4,5};
        subSetSum(a,a.length,0,0);
        int[] h = {10,30,40,20};
        int size = h.length;
        System.out.println(frogJump(h,size,0));
 */
        String s = "253";
        String[] kp = {
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
//                0 1   2       3    4   5      6       7     8   9
        };
        combinations(s," ",kp);

    }
}
