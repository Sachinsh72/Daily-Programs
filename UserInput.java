import java.util.Scanner;
public class UserInput {
    public static void main(String[] agrs){
        // import - keyword of import
        // java - main folder
        //util - package
        //Scanner - class

        // create object of scanner class- Scanner sc= new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("The entered number is " +a);

        // datatype     method_name
        // int          nextInt()
        // float        nextFloat()
        //byte          nextByte()
        //short         nextShort()
        //long          nextLong()
        //double        nextDouble()
        //boolean       nextBoolean()
        //String        next() - only one word
        //String        nextLine() - multiple word
        //char          next().charAt(0)

        System.out.println("Enter the letter");
        String s=sc.next();
        System.out.println("Entered Letter is " +s);

        /* System.out.println("Enter the word");
        String w=sc.nextLine();
        System.out.println(w);*/


    }
}
