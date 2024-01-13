package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character I will tell you it is vowel or consonant");

        char user_input = sc.next().toCharArray()[0];

        switch (user_input){
            case 'a':
                System.out.println("It is vowel");
                break;
            case 'e':
                System.out.println("It is vowel");
                break;
            case 'i':
                System.out.println("It is vowel");
                break;
            case 'o':
                System.out.println("It is vowel");
                break;
            case 'u':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");



                   }




    }
}
