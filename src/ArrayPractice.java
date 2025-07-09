import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] arr = {97,98,95};
//        for (int num : arr){
//            System.out.println(num);
//        }
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value os array size :- ");
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        for (int i =0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        for (int numbs : numbers){
//            System.out.print(numbs + " ");
//        }
//        System.out.println("Enter the size ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        for (int i = 0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//       int value = 6;
//        for (int i = 0; i<size; i++){
//            if (arr[i] == value){
//                System.out.println("Value found " + value + " in the index of " + i);
//                return;
//            }
//        }
//        System.out.println("value not found");
//        int[] num = {
//                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//        };
//        for (int i = 0; i<num.length; i++){
//            num[i] = sc.nextInt();
//        }
//        for (int nums : num){
//            System.out.printf(String.valueOf(nums) + " ");
//        }
//        System.out.print("Enter the target element : ");
//        int target = sc.nextInt();
//        for (int i = 1; i < num.length; i++) {
//            if (num[i] == target) {
//                System.out.println("Element " + target + " found at " + i);
//                num[i] = 70;
//                System.out.println(num[i]);
//                return;
//            }
//        }
//        System.out.print("Element not found");

//        int left = 0;
//        int right = num.length -1;
//        boolean found = false;
//        System.out.print("Enter the target element : ");
//        int target2 = sc.nextInt();
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            System.out.println(mid);
//            if (num[mid] == target2){
//                System.out.println("Target found at " + mid);
//                found = true;
//                break;
//            } else if (target2 > num[mid]) {
//               left = mid + 1;
//            }else {
//               right = mid - 1;
//            }
//        }
//        if (!found){
//            System.out.println("element " + target2 + " was not found");
//        }

//        int[] arr = {5,7,7,8,8,10};
//        int first = 0;
//        int last  = arr.length - 1;
//        System.out.println(last);
//        System.out.println("Enter target element :-");
//        int target = sc.nextInt();
//        boolean found = false;
//
//        for (int i = 0; i< arr.length; i++){
//            if (target == arr[i]){
//                System.out.println(i);
//                first = i;
//                found = true;
//                break;
//            }
//        }
//        if (!found){
//            System.out.println("element is not present in array");
//        }
//        if (found){
//            boolean found2 = false;
//            for (int i = arr.length - 1; i>=0; i--){
//                if (target == arr[i]){
//                    System.out.println(i);
//                    last = i;
//                    found2 = true;
//                    break;
//                }
//            }
//            if (!found2){
//                System.out.println("element is not present in array");
//            }
//        }
//        int[] arr = {
//                1,2,3,4,5,6,6,7,8,9,9,10
//        };
//        int count = 0;
//        int lastValue = arr[0];
//        for (int i = 1; i<arr.length; i++){
//            if (arr[i] == lastValue){
//                count++;
//
//            }else {
//                lastValue = arr[i];
//            }
//        }
//        if (count == 0){
//            System.out.println("values are not repeated");
//        }else {
//            System.out.println(count);
//        }
//        int count2 = 0;
//        int lastValue2 = arr[6];
//        for (int i = 7; i<arr.length; i++){
//            if (arr[i] == lastValue2){
//                count2 += 1;
//                System.out.println(arr[i]);
//            }else {
//                lastValue2 = arr[i];
//            }
//        }
//        if (count2 == 0){
//            System.out.println("values are not repeated");
//        }else {
//            System.out.println(count2);
//        }
//
//        int[] arr = {
//                1,2,3,4,5,6,6,7,8,9,9,10
//        };
//
//        int totalDuplicates = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i-1]) {
//                totalDuplicates++;
//                System.out.println("Duplicate found: " + arr[i]);
//            }
//        }
//        if (totalDuplicates == 0) {
//            System.out.println("No duplicates found");
//        } else {
//            System.out.println("Total duplicates: " + totalDuplicates);
//        }
//        int[] arr = {1,4,5,9,7,7,1,4,4,7,7};
//        int[] arr = new int[10];
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        int temp = 0;
//        System.out.println("Before sorting");
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//
//        for (int i = 0; i<arr.length; i++){
//            for (int j = 0; j<arr.length - 1;j++){
//                if (arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        System.out.println("\nAfter sorting");
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//        int[] arr = {1,5,4,2,1,4,7};
//        Arrays.sort(arr);
//        System.out.println("Before :- ");
//        for (int num : arr){
//            System.out.print(num + " ");
//        }

//        int temp = 0;
//        for (int i = 0; i<arr.length; i++){
//            for (int j =0; j<arr.length - 1;j++){
//                if (arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//
//        }
//
//        System.out.println(" After : ");
//        for (int num : arr){
//            System.out.print(+ num + " ");
//        }
//        System.out.println("\nDuplicates are:");
//        for (int  j= 0; j < arr.length - 1; j++) {
//            if (arr[j] == arr[j + 1]) {
//                if (j == 0 || arr[j] != arr[j - 1]) {
//                    System.out.print(arr[j] + " ");
//                }
//            }
//        }
        int[] num = {10, 5, 22, 1, 99};

//        for (int arr2 : num){
//            System.out.print(arr2 + " ");
//        }
//        System.out.println();
//        Arrays.sort(num);
//
//        System.out.println(" Min value in array :- " + num[0]);
//        System.out.println(" Max value in array :- " + num[num.length - 1]);
            // Printing 2nd largest integer
//        int first = Integer.MAX_VALUE;
//        int second = Integer.MAX_VALUE;
//
//        for (int arr : num){
//            if (arr < first){
//                second = first;
//                first = arr;
//            } else if (arr < second && arr != first) {
//                second = arr;
//            }
//        }
//        if (second == Integer.MAX_VALUE){
//            System.out.println(" not found");
//        }else {
//            System.out.println(" 2nd largest number " + second);
//        }
//        for (int i = 0; i< num.length; i++){
//            int cur = num[i];
//            int j = i - 1;
//            while (j >= 0 && cur <= num[j]){
//                num[j+1] = num[j];
//                j--;
//            }
//            num[j+1] = cur;
//        }
//        for (int arr: num){
//            System.out.print(arr + " ");
//        }
       int[] num2 = {0, 1, 2, 1, 0, 2, 1};
       int temp;
//        for (int i = 0; i< num2.length; i++){
//            for (int j = 0; j<num2.length - 1; j++){
//                if (num2[j] > num2[j + 1]){
//                    temp = num2[j];
//                    num2[j] = num2[j + 1];
//                    num2[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i< num2.length; i++){
//            int cur = num2[i];
//            int j = i - 1;
//            while (j >= 0 && cur > num2[j]){
//                num2[j + 1] = num2[j];
//                j--;
//            }
//            num2[j + 1] = cur;
//        }
//        for (int num3 : num2){
//            System.out.print(num3 + " ");
//        }


    }
}
