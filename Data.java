public class Data {
    public static void main(String[] args) {
        System.out.println("Hello Java!"); //comment
        String name="Sachin"; //String is variable
        String neighbour="Jay";
        int umar=22;
        String friend = "jay";
        System.out.println(name);
        //primitive data types below
        //byte - 1
        //short - 2
        //int - 4 1,2,3
        //long - 8
        //float - 4 3.14
        //double - 8
        //char - 2 a,b,c
        //boolean - 1 (true or false)

        byte age = 22;
        int phone=1234567891;
        long phone2=12345678L;
        float pi=3.14F;
        char letter='@';
        boolean isAdult=true;

        //non-primitive data types below
        String name2="Sachin";
        String name3="Sharma";
        System.out.println(name2.length());

        //string
        //concatenate
        String name5 = name2 + " " +  name3;
        System.out.println(name5);

        //charAt
        System.out.println(name3.charAt(0));

        //length
        System.out.println(name3.length());
    }
}
