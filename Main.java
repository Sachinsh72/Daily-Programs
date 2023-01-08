import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("User input");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=sc.nextInt();
        System.out.println("Enter the Number 2");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The add of two number is " +c);
    }
}