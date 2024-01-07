package src.Basics_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {

        // Int. Ques - Relational Operator
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);

        System.out.println("---------------");
        System.out.println('A'== 65); // ASCII
        //System.out.println('A'= 65);// Assigning is not supported in sop statement
        // only comparsion allowed

        byte b = 65;
        System.out.println('A'== b); // when you do anything in sop statements it become integer
        // automatically
        System.out.println('A'== 65.0); // This is property of java
        System.out.println('A'== 65.00000);
        System.out.println('A'== 65.0f);

        System.out.println('A'== 65.2);// double

        // Between boolean there is no comparison operator
        //System.out.println(true == 0);
        //System.out.println(true>= true);





    }
}
