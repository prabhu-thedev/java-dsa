public class Sorting {

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
//        int temp = 0;
//        System.out.println("Before Sorting :-  ");
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
        // Bouble Sort
//        for (int i = 0; i<arr.length; i++){
//            for (int j = 0; j<arr.length - i - 1; j++){
//                if (arr[j] > arr[j + 1]){
//                    // Swap
//                    temp = arr[j];
//                    arr[j] = arr[j+ 1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//

        // Selection Sort
//        for (int i = 0; i<arr.length -1; i++){
//            int smallest = i;
//            for (int j = smallest+1; j<arr.length; j++){
//                if (arr[smallest] > arr[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
        // Insertion Sort
//        for (int i =0; i<arr.length; i++){
//            int current = arr[i];
//            int j = i-1;
//            while (j >= 0 && current < arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            // Placement
//            arr[j+1] = current;
//        }
//        for (int i = 0; i<arr.length; i++){
//            int cur = arr[i];
//            int j = i - 1;
//            while (j >=0 && cur < arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = cur;
//        }
//        System.out.println();
//        System.out.println("Before Sorting :-  ");
//        for (int num : arr){
//            System.out.print(num + " ");
//        }

//        int[] num = {10, 5, 22, 1, 99};
//
//        for (int arr2 : num){
//            System.out.println(arr2);
//        }
        int[] arr2 = {10, 15, 20, 25, 30};
        int target = 30;
        int last = arr2.length - 1;
        int first = 0;

//        while (first <= last){
//            int mid = first + (last - first) / 2;
//            if (arr2[mid] == target){
//                System.out.println(" index of " + target + " is " + mid);
//                return;
//            } else if (arr2[mid] < target) {
//                first = mid + 1;
//            }else{
//                last = mid - 1;
//            }
//        }
//        while (first <= last){
//            int mid = first + (last - first) / 2;
//            if (arr2[mid] == target){
//                System.out.println("Target found at " + mid);
//                return;
//            } else if (arr2[mid] < target) {
//                first = mid + 1;
//            }else {
//                last = mid - 1;
//            }
//
//        }
//        System.out.println("Element not found");



    }
}
