package src.basics_02;

public class Lab007 {

    /**
     *
     * Author - Vivek Kumar
     *  Program- showcase diff bw println vs print
     *
     *
     * */
    public static void main(String[] args) {
        System.out.print("Hello world");
        System.out.println("Vivek");

        int age = 34;
        System.out.println("Your age is "+ age);
        System.out.printf("Your age is %d",age);//format

        // %d - any integer-  byte, short,int or long
        // %s - String
        // %c - char
        //%f - float

    }
}
