public class Operator {
    public static void main(String[] args) {
        System.out.println(!(10>8));
        System.out.println(40<100);

        System.out.println(10==9);

        //operand1 ? operand2 : operand3
        System.out.println(10>5?"Monday":"Tuesday");

        int n=134;
        String r=n%2==0?"even":"odd";
        System.out.println(r);

        //% result is reminder
        // / result is quoteint

        //program for the last digit is three or not
        System.out.println(n%10==3?"The last digit is Three":"The last digit is not three");

        // program for the second last digit is 4
        // n%100=x;
        // x/10==4;
        // we can write it as (n%100)/10==4
        System.out.println((n%100)/10==4?"2nd last is 4":"2nd last is not 4");

        //check whether the letter is lowercase or not
        // a to z=97 to 122 so, n>97 &&n<122
        System.out.println(n>97 &&n<122?"Lowercase ":"not lowercase");




    }
}
