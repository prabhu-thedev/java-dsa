class Car{
     int age;
     String s;
}


public class DSA_002_Oops {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int ans = 0;
//        int power = 1;
//        int dec = sc.nextInt();
//        while (dec > 0){
//            int pririty = dec % 2;
//            ans += (power * pririty);
//            power *= 10;
//            dec /= 2;
//
//        }
//        System.out.println(ans);
        System.out.println("Program starts from here ");
        Car c = new Car();
        c.age = 18;
        c.s = "Shreya";
        System.out.println(c.age);
        System.out.println(c.s);
        System.out.println();
        Car c2 = new Car();
        c2.age = 20;
        c2.s = "Nani";
        System.out.println(c2.age);
        System.out.println(c2.s);


    }
        }