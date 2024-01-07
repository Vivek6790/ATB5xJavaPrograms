package src.Basics_03_16Dec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {


        // Take input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        //int a = 34;
        if (a%2 ==1){
            System.out.println("ODD Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
}
