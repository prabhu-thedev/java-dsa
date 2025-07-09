import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
//        String s = "fry ee    me  to the moon";
//        System.out.println(s.length()); // Original string length
//        System.out.println(str); // Trimmed string
//        System.out.println(str.length());

//        int count = 0;

//        for (int i = str.length() - 1; i >= 0; i--) {
//            if (str.charAt(i) != ' ') {
//                count++;
//            } else {
//                break;
//            }
//        }
//
//        System.out.println("Count of non-space characters at the end: " + count);
//        String ss = s.trim().replaceAll("\\s+", " ");
//        System.out.println(ss);
//        String[] words = ss.split(" ");
//        System.out.println(words.length);
//
//        String lastWord = words[words.length - 1];
//        System.out.println(lastWord);

        // Replace the all spaces with @
//        String sent = "Hello  world   heyy hdabdijeb djhbfi ";
//        System.out.println(sent);
//        String str = sent.trim().replaceAll("\\s+", "@");
//        System.out.println(str);
//        String str = sent.trim().replaceAll("[aeiouAEIOU]", "");
//        String str = sent.trim().replaceAll("\\s+", " ");
//        System.out.println(str);
//        String rev = "";
//        for (int i = str.length() -1; i>=0;i-- ){
//            rev += str.charAt(i);
//        } 
//        System.out.println(rev);

//        String str = s.trim().replaceAll("\\s+", " ");
//        System.out.println(str);
//    int count = 0;
//        for (char ss : str.toCharArray()){
//            if ("aeiouAEIOU".indexOf(ss) != -1){
//                count++;
//            }
//        }
//        System.out.println(count);
//        String pal = "AbCdEfGhIj";

//        String rev = new StringBuilder(pal).reverse().toString();
//        System.out.println(pal.equals(rev) ? "Yes" : "No");
//        String rev = "";
//        for (int i = pal.length() -1; i>=0; i--){
//            rev += pal.charAt(i);
//        }
//        System.out.println(rev.equals(pal) ? "Palindrome" : " Not an palindrome");
//        StringBuilder res = new StringBuilder();
//        for (char c : pal.toCharArray()){
//            res.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
//        }
//        System.out.println(res);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string ");
//        String ss = sc.next();
//        String rev = new  StringBuilder(ss).reverse().toString();
//        System.out.println(ss.equals(rev) ? "Palindrome" : "Not a Palindrome");
//        String ss = "Hello guys, how u doing";
//
//       String s1 = ss.trim().replaceAll("\\s+", "");
//        String[] s2 = ss.split(" ");
//        for (String arr : s2){
//            System.out.println(arr);
//        }
//        String word = s2[s2.length - 1];
//        System.out.println(word);
        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter string 1 :- ");
//        String s1 = sc.next();
//        System.out.println(" Enter string 2 :- ");
//        String s2 = sc.next();
//
//        if (s1.length() != s2.length()){
//            System.out.println("not anagrams bolthey ");
//        }else {
//            char[] ch1 = s1.toCharArray();
//            char[] ch2 = s2.toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//
//            System.out.println(Arrays.equals(ch1, ch2) ? " Anagrams" : "Not Anagrams");
//        }
        // listen and silent checking angram or not
//        String s1 = "listen";
//        String s2 = "silent";
//
//        if (s1.length() != s2.length()){
//            System.out.println("Not an anagram ");
//        }else {
//            // converting into corrector array
//            char[] ch1 = s1.toCharArray();
//            char[] ch2 = s2.toCharArray();
//            // Sorting the array
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//            // Printing the anagram
//            System.out.println(Arrays.equals(ch1, ch2) ? "it is anagram" : "It not an angram");
//
//        }

        String ss = "aaabbbcc";
        StringBuilder compressed = new StringBuilder();
        int count = 0;
//        int first = ss.charAt(ss.length() - 1);
//        System.out.println(ss.charAt(ss.length() - 1));

        for (int i = 1; i<ss.length(); i++){
           if (ss.charAt(i) == ss.charAt(i - 1)){
               count++;
           }else {
               compressed.append(ss.charAt(i - 1)).append(count);
               count = 1;
           }
        }

        compressed.append(ss.charAt(ss.length() - 1)).append(count);
        System.out.println(" Compressed string " + compressed.toString());

    }
}
