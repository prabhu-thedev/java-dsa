public class DSA_018_SortingPractice {

    static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j]==0 && a[j+1]!=0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
    static void lexSort2(String[] s1){
        for (int i = 0; i < s1.length; i++) {
            int minIdx = i;
            for (int j = i+1; j < s1.length; j++) {
                if (s1[j].compareTo(s1[minIdx]) < 0){
                    minIdx = j;
                }
            }
            String temp = s1[i];
            s1[i] = s1[minIdx];
            s1[minIdx] = temp;

        }
    }

    static void lexSort(String[] s1){
        int n = s1.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (s1[j].compareTo(s1[min_index]) < 0){ // what is the use of this < 0 in this statement
                    min_index = j;
                }
            }
            // Swap
            String temp = s1[i];
            s1[i] = s1[min_index];
            s1[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,42};
//        sort(arr);
//        for (int val:arr){
//            System.out.print(val+ " ");
//        }
        String[] arr2 = {
                "papaya","lime","watermelon","apple","mango","kiwi"
        };
        lexSort2(arr2);
        for (String val:arr2){
            System.out.print(val + " ");
        }
    }
}