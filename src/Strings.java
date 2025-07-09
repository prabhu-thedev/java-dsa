import java.util.*;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String declaration
        String sentence = " I'm Captain America ";
//        String user = sc.nextLine();
//        System.out.println(" User name is " + user);
        // Concatenation
//        String firstName = "Steve";
//        String lastName = "Rogers";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName.length());

        //charAt
//        for (int i = 0; i<fullName.length(); i++){
//            System.out.print(fullName.charAt(i) + " ");
//        }

        String name1 = "Steve";
        String name2 = "Steve";

//        if (name1.compareTo(name2) == 0){
//            System.out.println("same");
//        }else {
//            System.out.println("not equal");
//        }
//
//        if (name1 == name2){
//            System.out.println("same");
//        }else {
//            System.out.println("not equal");
//        }
//
//        if (name1.equalsIgnoreCase(name2)){
//            System.out.println("same");
//        }else {
//            System.out.println("not equal");
//        }
        String sent = "my name is steve";
        String name = sent.substring(11);
//        System.out.println(name);
        // String are immutable

        String s = " Hello guys, how are you doing";
        String ss = " ";
        for (int i = s.length() - 1; i>=0; i--){
            ss += s.charAt(i);

        }
//        System.out.println(ss.toString());

        String s2 = "hello world, are you guys";
        int count = 0;
        for (char c : s2.toCharArray()) {
            if (" ".indexOf(c) != -1) {
                count++;
            }
        }
        count = count + 1;
        System.out.println("Space: " + count);

    }



}
