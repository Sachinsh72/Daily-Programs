import java.util.Scanner;
public class SimpleProgram {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        int n3=n+n2;
        System.out.println(n3);

        System.out.println(n%2==0?"even":"odd");
    }
}
