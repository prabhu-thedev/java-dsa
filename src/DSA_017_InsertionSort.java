import java.util.Arrays;

public class DSA_017_InsertionSort {
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    // Insertion sorting  technique
    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
                swap(arr, j , j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello Insertion");
        int[] a = {8,3,5,10,7,1};
        insertionSort(a);
        for (int val :a){
            System.out.print(val + " ");
        }
    }
}
