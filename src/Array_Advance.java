import java.util.Scanner;

public class Array_Advance {
    Scanner scanner = new Scanner(System.in);
    static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr){
        int n = arr.length;
        int small = Integer.MIN_VALUE;
       for (int num : arr){
           System.out.println(num + " ");
       }
        for (int i = 0; i<n;i++){
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    static void sortZerosOne(int[] arr){
        int n = arr.length;

        int zeros = 0;
        // Count number of zeros
        for (int num : arr){
            if (num == 0){
                zeros++;
            }
        }

        // 0 to zero - 1|| n-1 : 1
        for (int i = 0; i<n; i++){
            if (i < zeros){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
        print(arr);
    }

    static void sortZerosOne2(int[] arr){
        int n = arr.length;

        int left = 0; int right = n - 1;

        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }

        }
    }

    static void sortingEvenOdd(int[] arr){
        int n = arr.length;

        int left = 0; int right = n-1;

        while (left < right){
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0 ){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] % 2 != 0){
                right--;
            }
        }
        print(arr);
    }

    static void sortS(int[] arr){
        int n = arr.length;
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr2[i] = arr[i] * arr[i];
        }
        for (int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                if(arr2[i] < arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        for(int num : arr2){
            System.out.print(num + " ");
        }

    }

    static void deleteDuplicate(int[] arr){

        int[] newArray = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i + 1]){
                newArray[j++] = arr[i];
            }
        }
        newArray[j++] = arr[arr.length - 1];

        for (int i = 0; i<j; i++){
            System.out.print(newArray[i]);
        }
    }

    // Prefix Sum--

    static void prefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i - 1];
        }
        print(arr);
    }

    static void suffixSum(int[] arr){
        int n = arr.length;
        for (int i = n - 1; i > 0; i--){
            arr[i - 1] += arr[i];
        }
        print(arr);
    }

    static void prefixSum2(int[] arr){
        int sum = 0;
        prefixSum(arr);
        int l = 3, r = 5;
        sum = (arr[r]- arr[l-1]);
        System.out.println("Sum - " + sum);
    }

    static void prefixSumFinal(int[] arr){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 1; i<n; i++){
            arr[i] += arr[i - 1];
        }
        System.out.println("Enter the number of queries u wanna run ");
        int q = sc.nextInt();
        while (q > 0){
            System.out.println("Enter the range ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = arr[r] - arr[l - 1];
            System.out.println(" Sum :- " + sum);
            q--;
        }
    }

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int j : arr) {
            totalSum += j;
        }
        return totalSum;
    }

    static boolean subArray(int[] arr){
        int totalSum = findArraySum(arr);

        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;
            if (suffixSum == prefixSum){
                return true;
            }
        }
        return false;
    }

    static boolean suffix(int[] arr){
       int total = findArraySum(arr);
       int  prefixSum = 0;
       for (int i = 0; i<arr.length; i++){
           prefixSum += arr[i];


           int suffixSum = total - prefixSum;
           if (prefixSum == suffixSum){
               return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,0,1,0,1,1,0,0};
        int[] arr2 = {1,3,4,5,6,8};
        int[] arr3 = {-10,-3,-2,1,4,5};
        int[] arr4 = {2,4,1,3,6};

        System.out.println("Enter array length Value");
        int n = sc.nextInt();
        int[] array = new int[n];
//        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
//            arrays[i] = sc.nextInt();
        }

//        int[] array = {0,2,4,1,3,6,5};

//        sort(arr);
//        sortZerosOne(arr);
//        System.out.println("Sorted array");
//        print(arr);
//        sortZerosOne2(arr);
//        System.out.println("Sorted");
//        print(arr);
//        sortingEvenOdd(arr2);
//        sortS(arr3);
//        prefixSum(arr4);
//        prefixSumFinal(array);

//        prefixSum(array);
//        suffixSum(arrays);
//        System.out.println("Equal partition possible : " + subArray(array) );
//        System.out.println(suffix(array));
        deleteDuplicate(array);
    }
}
