public class DSA_016_SelectionSort {
    // Bubble sort
    static void bubbleSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
    /*
     Selection Sort
    - Select a minimum and add into answer array
    */
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n-1; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args){

        System.out.println("Hello Selection sort");

        int[] a = {5,7,1,4,9};
//        bubbleSort(a);
        selectionSort(a);
        for (int nums:a){
            System.out.print(nums + " ");
        }
    }
}
