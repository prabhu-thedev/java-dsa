import java.util.*;
public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Steve");
        System.out.println(sb);

//        System.out.println(sb.charAt(0));
//        sb.setCharAt(0,'D');
//        System.out.println(sb);
//        sb.insert(0,'S');
//        System.out.println(sb);
//        sb.insert(2,"e");
//        System.out.println(sb);
//        sb.delete(2,3);
//        System.out.println(sb);
//        sb.delete(4,5);
//        System.out.println(sb);
        sb.append("e");
        sb.append("e");
        System.out.println(sb);
        StringBuilder ss = new StringBuilder();
//        ss.insert(0,"H");
        ss.append('H');
        ss.append('e');
        ss.append('l');
        ss.append('l');
        ss.append('0');
//        System.out.println(ss.length());
//        for (int i = ss.length() - 1; i>=0; i--){
//            System.out.print(ss.charAt(i));
//        }
        for (int i = 0;i<ss.length()/2; i++){
            int front = i;
            int bank = ss.length() - 1 - i;

            char frontChar = ss.charAt(i);
            char bachChar = ss.charAt(bank);

            ss.setCharAt(front, bachChar);
            ss.setCharAt(bank,frontChar);

        }
        System.out.print(ss);

    }

}
