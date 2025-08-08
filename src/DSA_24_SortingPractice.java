import java.util.Arrays;

public class DSA_24_SortingPractice {

    static void display(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] a,int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    // to perform a single swap to make array sort
    static void sort(int[] arr){
        int x = -1;
        int y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                if ( x == -1 ){
                    x = i-1;
                }else {
                    y = i;
                    swap(arr,x,y);
                    return;
                }
            }
        }


    }

    // to sort negative and positive values
    static void sort2(int[] arr){
        int l = 0;
        int r = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr[l++] = arr[i];
            }else {
                arr[r--] = arr[i];
            }
        }
    }
    static void sort3(int[] arr){
        int st = 0, end = arr.length-1;
        while (st < end){
            while (arr[st] < 0) st++;
            while (arr[end] > 0) end--;
            if (st < end){
                swap(arr,st,end);
                st++;
                end--;
            }
        }
    }

    // sort 0,1,2 array
    static void sort4(int[] arr){
        int n = arr.length-1;
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == 0) count_0 ++;
            else if (arr[i] == 1) count_1++;
            else count_2++;
        }
        int k = 0;
       while (count_0 > 0){
           arr[k++] = 0;
           count_0--;
       }
       while (count_1 > 0) {arr[k++] = 1; count_1--;}

       while (count_2 > 0) {arr[k++] = 2 ; count_2--;}
    }

    static void sort5(int[] arr){
        int n = arr.length-1;
        int low = 0, mid = 0, high = n;
        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if (arr[mid] == 1){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void fre(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int val : arr){
            if (max < val){
                max = val;
            }
        }
        System.out.println(max);
        int[] fre = new int[max+1];
        for (int j : arr) {
            fre[j]++;
        }
        display(fre);
    }

    public static void main(String[] args) {
        int[] arr = {10,5,6,7,8,9,3};
//        System.out.println("Before sort");
//        display(arr);
//
//        sort(arr);
//        System.out.println("\nAfter sort");
//        display(arr);
        int[] arr2 = {19,-20,7,-4,-13,11,-5,3};
//        System.out.println("Before sort");
//        display(arr2);
//
//        sort2(arr2);
//        sort3(arr2);
//        System.out.println("\nAfter sort");
//        display(arr2);

        int[] arr3 = {1,0,1,0,2,1,2,0,0};
        fre(arr3);
//        System.out.println("Before sort");
//        display(arr3);
//
//        sort5(arr3);
//        System.out.println("\nAfter sort");
//        display(arr3);

    }
}
