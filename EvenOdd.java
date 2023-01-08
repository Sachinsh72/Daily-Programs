import java.util.Scanner;
public class EvenOdd {
    static int p=12; //static variable
    int q=10; // non-static variable
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        System.out.println(p);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //int n is variable-local variable
        if (n%2==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        if (n2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

        //widening
        int x=10;
        double y=x;
        System.out.println(y);

        //narrowing
        int a=132;
        byte b=(byte)a;
        System.out.println(b);
    }
}
