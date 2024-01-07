package src.Basics_03_16Dec;

public class Lab027 {
    public static void main(String[] args) {
        // Casting  - Mold
        // widening is the process of converting lower type to higher type
        // widening both are allowed Implicit & Explicit
        byte b = 10;
        int a = b; // Implicit casting - JVM
        // int a = (int)b // Explicit casting

        //// Narrowing is the process of converting higher type to lower type

        int a1 = 300;
       // byte b1 = a1; // Invalid - Implicit casting// implicit narrowing is not allowed by jvm
        byte b1 = (byte)a1; // Explicit cast // only byte want to store
        System.out.println(b1); // Random value 118.45
    }
}
