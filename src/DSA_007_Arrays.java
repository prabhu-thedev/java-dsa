import java.util.Scanner;

public class DSA_007_Arrays {

    int[] arr = {10,20,30,40,50,60,70,80,90,100};

    void printArray(){
        int count = 1;
        for (int j : arr) {
            System.out.println("Array  " + count + " : " + j);
            count += 1;
        }
    }
static void fun(int[] arr3){
    int x = 2;
    for (int i = 0; i< arr3.length; i++){
        if (arr3[i] == x){
//            System.out.println(" Value found at index of " + i);
            return;
        }
    }
//    System.out.println("Value not found");
}
    static void swap(int a, int b){
        System.out.println("Before Swap");
        System.out.println(" a " + a);
        System.out.println(" b " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println(" a " + a);
        System.out.println(" b " + b);
    }
    static void swap2(int a, int b){
        System.out.println("Before Swap");
        System.out.println(" a " + a);
        System.out.println(" b " + b);

        a = a + b; // 3 + 9 = 12
        b = a - b; // 12 - 9 = 3;
        a = a - b; // 12 - 3 = 9;

        System.out.println("After Swap");
        System.out.println(" a " + a);
        System.out.println(" b " + b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DSA_007_Arrays a = new DSA_007_Arrays();
        a.printArray();
//        System.out.println("Array length is : " + a.length);

        int[] ages = new int[5];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 26;
        ages[3] = 31;
        ages[4] = 41;

        for (int num : ages){
            System.out.print(num + " ");
        }
        int[][] ages2 = new int[4][3];

        int[][] multiArray = {
                {1,2},{4,5},{6,7}
        };
        int l = multiArray.length;

        for (int i = 0; i<l ; i++){
            for (int j = 0; j< l - 1; j++){

                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        int[] arr2 = {1,5,3};
        int sum = 0;
        for (int i = 0; i< arr2.length;i++){
            sum += arr2[i];
        }
        System.out.println(" Some of given array " + sum);

        int[] arr3 = {5,3,6,2,8,4};
        int ans = arr3[0];
        for (int i = 0; i< arr3.length; i++){
            if (arr3[i] > ans){
                ans = arr3[i];
            }
        }
        System.out.println(" Max value of given array " + ans);
        fun(arr3);

        // Printing repeating count in an array and storing the occur index in a new array
        int[] arr4 = {5,6,5,1,5};
        int size = 0;
        int[] arr5 = new int[arr4.length];
        int x = 5;
        int rep = 0;
        for (int i = 0; i<arr4.length; i++){
            if (x == arr4[i] ){
                rep += 1;
                arr5[size] = i;
                size += 1;
            }
        }
        System.out.println("reps " +  x  + rep);

        for (int i = 0; i<size; i++){
            System.out.print( arr5[i] + " ");
        }
//         Finding last occur of a given element in a array
        int[] arr6 = {5,6,5,3,5,4};
        int value = sc.nextInt();
        int ind = -1;
        for (int i = 1; i< arr6.length; i++){
            if (value == arr6[i]){
                ind = arr6[i];
            }
        }
        System.out.println("Last occur of a " + value + " " + ind + " index");

        // count a number of elements in array which are strictly bigger than given element

        int ele = sc.nextInt();
        int count = 0;
        int[] arr7 = {3,4,5,7,6,2,};
        int[] index = new int[arr7.length];

        for (int i = 0; i< arr7.length;i++){
            if (arr7[i] >= ele){
                index[count] = arr7[i];
                count++;
            }
        }
        for (int i = 0; i<count;i++){
            System.out.println(index[i]);
        }

        // Check if given array is sorted array or not

        int[] arr8 = {1,2,6,9,10};
        boolean sort = true;
        for (int i = 1; i < arr8.length; i++) {
            if (arr8[i - 1] > arr8[i]){
                sort = false;
                break;
            }
        }
        System.out.println(sort ? "This is sorted array " : "This is not a sorted array");

        int[] arr9 = {4,6,3,5,8,2};
        int pairCount = 0;
        for (int i = 0; i<arr9.length; i++){
            for (int j = i + 1; j<arr9.length; j++){
                if ((arr9[i] + arr9[j]) == 7){
                    System.out.println(arr9[i] + " " + arr9[j]);
                    pairCount++;
                }
            }
        }
        System.out.println(" Pairs count  " + pairCount);
        int[] arr10 = {1,4,5,6,3};
        for (int i = 0; i<arr10.length; i++){
            for (int j =  i + 1; j<arr10.length; j++){
                for (int k = j + 1; k<arr10.length; k++){
                    if ((arr10[i] + arr10[j] + arr10[k]) == 12){
                        System.out.println(arr10[i] + " " + arr10[j] + " " + arr10[k]);
                    }
                }
            }
        }
        int[] arr11 = {1,2,3,4,2,1,3};

        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j< arr11.length; j++){
                if (arr11[i] == arr11[j]){
                    arr11[i] = -1;
                    arr11[j] = -1;
                }
            }
        }
        for (int num : arr11){
            if (num>0){
                System.out.println(num);
            }
        }
//         2nd largest number of an array

        int[] arr13 = {9,8,13,6,9,19,8};
        int max = Integer.MIN_VALUE;
        int ans2 = 0;
        for (int i = 0; i< arr13.length ; i++){
           if (arr13[i] > max){
               ans2 = max;
               max = arr13[i];
           }
        }
        System.out.println(max);
        System.out.println(ans2);

        int[] arr14 = {6,4,-5,7,8,4,3,};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr14.length; i++) {
            if (min > arr14[i]){
                min = arr14[i];
            }
        }
        System.out.println("Min value " + min);

//        Swaping values
        swap(3,9);
        swap2(3,9);
        int[] arr16 = {1,2,3,4,5};
        int[] arr15 = new int[arr10.length];
        int num = 0;
        for (int i = arr16.length - 1; i > -1; i--){
            arr15[num] = arr16[i];
            num ++;
        }
        System.out.println("After reverse");
    for (int num2 : arr15){
        System.out.print(num2 + " ");
    }

        int[] arr19 = {1,2,3,4,5,6,7};
        int[] arr17 = new int[arr19.length];
        int n = arr19.length;
        int k = 106;
        k = k % n;
        int j = 0;
        for (int i = n-k; i < n; i++ ){
            arr17[j++] = arr19[i];

        }
        for (int i = 0; i<n-k; i++){
            arr17[j++] = arr19[i];
        }
        for (int num3 : arr17){
            System.out.print(num3 + " ");
        }

        int[] arr18 = {1,2,3,4,5,6,7};
        int n1 = arr18.length;
        int k1 = 5;
        k1 = k1 % n;

        for (int i = n1- k1 - 1; i >= 0; i--){
            System.out.print(arr18[i] + " ");
        }

        for (int i = n1- k1; i < n; i++){
            System.out.print(arr18[i] + " ");
        }
        for (int i = n1 - 1; i >= 0; i--){
            System.out.print("\n" + arr18[i] + " ");
        }
    }

}
