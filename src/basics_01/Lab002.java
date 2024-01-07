package src.basics_01;

public class Lab002 {
    public static void main(String[] args) {

        //Keywords - Simple English Words
        // Package ,public ,class - Reserved word
        //blue color
        // keyword are in lower case
        // we can't use keywords as variables or class name or method

        byte age = 10; // range -128 to 127
       // age = 128; // out of range
        age = 127;
        System.out.println(age);
        System.out.println(age+1); // not storing, just printing so it will print 128
        //age = age +1; // 128+1 Not possible cannot store into byte

        // age is local variable
        // local means available within this function only
        // Accesable only this function not class
        // within main method


        short age2 = 128; //-32768 to 32678

        //short class = 128; // reserved keyword can not use
        //short public = 128; // reserved keyword can not use
        short Public = 128; //
        short Static = 128; //
        short $ = 128;
        System.out.println($);
       // short _ = 128;
       // System.out.println(_);
        short _age =128;
        System.out.println(_age);







    }

}