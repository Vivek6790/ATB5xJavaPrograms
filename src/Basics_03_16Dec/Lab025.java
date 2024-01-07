package src.Basics_03_16Dec;

public class Lab025 {
    public static void main(String[] args) {
        int a = 1;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);

        int a1 = 67;
        boolean b1 = !(a1 > 20 || a1 < 678);
        System.out.println(b1);

        int a2 = 67;
        boolean b2 = !(a2 > 20 && a2 < 678);
        System.out.println(b2);

    }
}
