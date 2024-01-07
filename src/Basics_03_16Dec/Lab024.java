package src.Basics_03_16Dec;

public class Lab024 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a >10 || a < 5 ;
        System.out.println(b);

        boolean b1 = !(a >10 || a < 5) ;
        System.out.println(b1);

        int a1 = 67;
        boolean b2 = !(a1 >20 || a1 < 678) ;
        System.out.println(b2);

        boolean b3 = !(a1 >20 && a1 < 78) ;
        System.out.println(b2);
    }
}
