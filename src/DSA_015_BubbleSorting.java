public class DSA_015_BubbleSorting {

    static void bubbleSort(int[] arr){
        int n = arr.length;
/*
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
*/
         // has any swapping happened
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if (!flag) return; // any swaps happened
        }
    }
    public static void main(String[] args) {
        System.out.println("Hey sorting");
        int[] arr = {5,7,4,3,1};
        bubbleSort(arr);
        for (int nums:arr){
            System.out.print(nums + " ");
        }
    }
}
