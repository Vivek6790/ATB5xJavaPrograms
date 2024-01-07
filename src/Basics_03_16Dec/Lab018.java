package src.Basics_03_16Dec;

public class Lab018 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = "Vivek";
        System.out.println(a+name); // 10Vivek
        System.out.println(name+a); // Vivek10

        // Interview calculation always left to right

        System.out.println(a+b+name); // 55Vivek
        //concatenation - String + other
        System.out.println(name+a+b); // concatenation Vivek1045

    }
}
