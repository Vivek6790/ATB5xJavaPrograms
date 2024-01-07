package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        // if else
        // two condition Yes, No

        if(true) {
            System.out.println("true");
        }
            else{
            System.out.println("false");
            }

           // if(true){
               // System.out.println("Only if");

                // what if - Number - 20, <20, >10 --> 11 to 19

                //if, else if , else

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number");
                int number = sc.nextInt();

                if(number > 20){
                    System.out.println("Number is > 20");
                }
                else if(number > 10){
                    System.out.println("Number is > 10");
                }
                else{
                    System.out.println("Number is < 20");
                }
            }

        }





