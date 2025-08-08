public class DSA_023_RadixSort {
    static int findMax(int[] a){
        int max = Integer.MIN_VALUE;
        for (int val:a){
            if (val > max)
                max = val;
        }
        return max;
    }

    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] outPut = new int[n];
        int max = findMax(arr); // find the largest element of the array
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]/place%10]++;
        }
        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        // find the index of each in the original and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = count[arr[i]/place%10]-1;
            outPut[idx] = arr[i];
            count[arr[i]/place%10]--;
        }
        // copy all elements of output in array
        for (int i = 0; i < n; i++) {
            arr[i] = outPut[i];
        }
    }

    static void radix(int[] arr){
        int max = findMax(arr);
        // apply counting sort to sorting elements based on elements

        for (int place = 1;max/place > 0; place += 10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {
                43,453,626,894,0,3
        };
        radix(arr);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
