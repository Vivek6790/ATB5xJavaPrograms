package src.Basics_03_16Dec;

public class Lab038 {
    public static void main(String[] args) {

        //Conditional Ternary operator // ?

        //int a = condition ? if this is true print do this : idf false do this

        // Max in three number

        int a = 40;
        int b = 20;
        int c = 32;

        // tern op. --> ?
        // (a > c) ? a : c
        //((b > c) ? b:c)

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b:c);
        System.out.println(max);


    }
}
