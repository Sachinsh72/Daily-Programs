public class NarrowingWidening {
    public static void main(String[] agrs)
    {
        //widening
        int x=10;
        double y=x;
        System.out.println(y);

        //narrowing
        int a=132;
        byte b=(byte)a;
        System.out.println(b);

        //operators
        int p=12;
        int q=10;
        int r=p+q; // p,q operands but "+" is operator and "=" is a assignment operator
        System.out.println(r);

        int j=13; // int j+=10 (compound assignment operator)
        System.out.println(j);
    }
}
