// Program to demonstrate Wrapper Classes and String vs StringBuffer
//Problem Statement:
//Write a Java program demonstrating the use of Wrapper Classes and explaining the difference between String and StringBuffer.
public class Program3 {

    public static void main(String[] args) {


        int num = 10;

        Integer obj = num;

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper Object value: " + obj);

        int value = obj;

        System.out.println("Unboxed value: " + value);

        System.out.println();


        String str = "Ved";

        str = str + "Mistry";

        System.out.println("String after concatenation: " + str);

        System.out.println();


        StringBuffer sb = new StringBuffer("Ved");

        sb.append("Mistry");

        System.out.println("StringBuffer after append: " + sb);

        System.out.println();

        System.out.println("Length of StringBuffer: " + sb.length());
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }
}