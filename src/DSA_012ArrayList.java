import java.util.ArrayList;

public class DSA_012ArrayList {
    static void reverse(ArrayList<Integer> arr){
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }

    static void sort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        System.out.println(arr);
    }


    public static void main(String[] args) {

            // Wrapper class
        /*
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(5.5f);
        System.out.println(f);
*/

        ArrayList<Integer> l1 = new ArrayList<>();
/*
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();
*/
        // Add new Elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        /*
        System.out.println(l1.get(0));
        Print arrayList using loop
*/
//        Get an element at index i
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.print(l1.get(i) + " ");
//        }
        // Printing array list direct
//        System.out.println(l1);

        // adding element t some index i
//        l1.add(1,100);
//        System.out.println(l1);

        // Modifying element at index i
//        l1.set(1,10);
//        System.out.println(l1);

        // removing an element at index i
//        l1.remove(1);
//        System.out.println(l1);

        //removing an element e
//        System.out.println(l1.remove(Integer.valueOf(17)));;
//        System.out.println(l1);

        //checking if element is existing or not
//        boolean ans = l1.contains(6);
//        System.out.println(ans);

//         if you do not specify wrapper class, you can put anything inside l
//        ArrayList l = new ArrayList();
//        l.add("P");
//        l.add(5);
//        l.add(true);
//        System.out.println(l);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(0);
        l2.add(10);
        l2.add(3);
        l2.add(5);
        l2.add(22);
        l2.add(10);
//        System.out.println("Original Array" + l2);
//        reverse(l2);
//        Collections.reverse(l2);
//        System.out.println("Reversed Array" + l2);
        System.out.println("Sorted");
        sort(l2);

    }
}
