public class DSA_019_MergeSort {

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*

    - Divide the array into 2 equal halves
    - Sort the 2 subarrays separate using recursion

     */
    static void displayArray(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
    static void merge(int[] arr,int l,int mid, int r){
        int n1 = (mid-l)+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for (i = 0; i < n1; i++) left[i] = arr[l+i];
        for (j = 0; j < n2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;

        while (i<n1 && j<n2){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1){
            arr[k++] = left[i++];
        }
        while (j < n2){
            arr[k++] = right[j++];
        }
    }
     static void mergeSort(int[] arr,int l, int r){
        if (l >= r){
            return;
        }
         int mid = (l + r) /2;
         mergeSort(arr,l,mid);
         mergeSort(arr,mid+1,r);
         merge(arr,l, mid, r);

     }

    public static void main(String[] args) {
        System.out.println("Merge");
        int[] arr = {4,1,3,5,2};
        System.out.println("Array before sorting");
        displayArray(arr);

        int n = arr.length-1;
        mergeSort(arr,0,n);

        System.out.println("\nArray after sort");
        displayArray(arr);
    }
}
