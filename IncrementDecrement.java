public class IncrementDecrement {
    public static void main(String[] agrs){
            int a =10;
            System.out.println(a); //normal
        System.out.println(a++); //post increment
        System.out.println(a); //after the increment
        System.out.println(++a); //pre increment

        System.out.println(a); // after all above
        System.out.println(a--); //post decrement
        System.out.println(a); //after decrement
        System.out.println(--a); //pre decrement

        System.out.println("All time value of b is stored as 12");
        int b=12;
        b=b++;
        b=b++;
        b=b++;
        b=b++;
        b=b++;
        System.out.println(b);

        System.out.println("Another question");
        int c=12;
        c++; // value of c is 13
        int d=c++; //value of d is 13 but c is 14
        d++; //value of d is 14
        int e=++d; //value of e is 15
        System.out.println(c); //14
        System.out.println(d); //15
        System.out.println(e); //15
        }
}
