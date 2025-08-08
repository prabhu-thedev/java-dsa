public class DSA_021_CountSorts {

    static void display(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void basicCountSort(int[] arr){

       int max = findMax(arr); // find the largest element of the array
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

    }
    static void countSort(int[] arr){
        int n = arr.length;
        int[] outPut = new int[n];
        int max = findMax(arr); // find the largest element of the array
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        // find the index of each in the original and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = count[arr[i]]-1;
            outPut[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of output in array
        for (int i = 0; i < n; i++) {
            arr[i] = outPut[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,3,1,3,5};
/*
        basicCountSort(arr);
        display(arr);
        countSort(arr);
        display(arr);
*/

    }
}
