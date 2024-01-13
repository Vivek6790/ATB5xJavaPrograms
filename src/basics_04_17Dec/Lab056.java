package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {




        // which day is today

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a dayNumber I will tell which day it is");
        int dayNumber = sc.nextInt();

        String day = null;

        switch (dayNumber){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default :
                System.out.println("Are you mad");
        }


    }
}
