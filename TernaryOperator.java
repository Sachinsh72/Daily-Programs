import java.util.Scanner;
public class TernaryOperator {
        public static void main(String[] args)
        {
            System.out.println("Enter the third number");
            Scanner sc = new Scanner(System.in);
            int n3 = sc.nextInt();
            System.out.println(n3%2==0 ?"even" :"odd");
        }
    }

