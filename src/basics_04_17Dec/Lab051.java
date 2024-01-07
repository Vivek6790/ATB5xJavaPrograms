package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        // Grade Calculator;
        //write a program that calculate and display the letter grade for a given
        //numerical score (e.g. A,B,C,D OR F) based on the following grading scale.

        //A : 90-100
        //B : 80-89
        //C : 70-79
        //D : 60-69
        //F : 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks>90 && marks<100){
            System.out.println("Your Grade is  A");

        }else if (marks>80 && marks<89){
            System.out.println("Your Grade is  B");
        }else if (marks>70 && marks<79){
            System.out.println("Your Grade is  C");

        } else if (marks>60 && marks<69) {
            System.out.println("Your Grade is  D");
        } else
            System.out.println("Fail");

        }
    }
}
