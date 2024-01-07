package src.Basics_03_16Dec;

public class Lab020 {
    public static void main(String[] args) {
        // Relational Operator
        //>,<,=>,=<

        int age_amit = 30;
        int age_vivek = 34;
        boolean result = age_vivek > age_amit;
        System.out.println(result);

        int a = 10;
        int b = 10;
        boolean c = (a > b);

        // References in case of int it check for values
        // in case of string  it check for reference

        int a1 = 10;
        int b1 = 12;
        boolean c1 = (a1 > b1);
        System.out.println(c1);

        int a2 = 10;
        int b2 = 10;
        boolean c2 = (a2 >= b2);
        System.out.println(c2);
    }
}
