import java.util.Scanner;

public class DSA_004_NumberSystem {
    public static void main(String[] args) {
        // Types of number system :-
        // 1. Decimal Numbers, 2. Decimal Numbers, 3, Hexa Decimal Number
        Scanner sc = new Scanner(System.in);

//        int binary_num = sc.nextInt(); // Binary number

        int ans = 0; // converted decimal number
        int pw = 1; // s^0 = 1 poer of 2
//        while (binary_num > 0){
//            int unit_digit = binary_num % 10;
//            ans += (unit_digit * pw);
//            binary_num /= 10;
//            pw *= 2;
//        }
//        System.out.println(ans);

        // Decimal number to binary number
        int decimal_number = sc.nextInt();
        int ans2 = 0;

        int power = 1;// powers of 10

        while (decimal_number > 0){
            int parity = decimal_number % 2;
            ans2 += (parity * power);
            power *= 10;
            decimal_number /= 2;
        }
        System.out.println(ans2);
    }
}
