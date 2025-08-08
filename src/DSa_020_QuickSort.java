public class DSa_020_QuickSort {
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int[] arr,int st, int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot){
                count++;
            }
        }
        int pivotIndex = st + count;
//        int temp = arr[st];
//        arr[st] = arr[pivotIndex];
//        arr[pivotIndex] = temp;
        swap(arr,st,pivotIndex);

        int i = st;
        int j = end;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] <= pivot){
                i++;
            }
            while (arr[j] >= pivot){
                j--;
            }
            if (i < pivotIndex && j > pivotIndex){
                swap(arr,j,i);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int[] a,int st,int end){
        if (st >= end) return;
        int pi = partition(a,st,end);
        quickSort(a,st,pi-1);
        quickSort(a,pi+1,end);
    }
    public static void main(String[] args) {
        int[] arr = {7,13,8,5,10,2,4};
        System.out.println("Before sort");
        for (int val:arr){
            System.out.print(val + " ");
        }
        int n = arr.length-1;
        quickSort(arr,0,n);
        System.out.println("\nAfter sort");
        for (int val:arr){
            System.out.print(val + " ");
        }
    }
}
