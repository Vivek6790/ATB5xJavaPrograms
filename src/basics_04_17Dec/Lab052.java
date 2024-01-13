package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        //A : 90-100
        //B : 80-89
        //C : 70-79
        //D : 60-69
        //F : 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
       int marks = sc.nextInt();

     if (marks >=90 && marks<=100){
         System.out.println("Your grade is A");
     }
     if (marks >=80  && marks <=89){
         System.out.println("Your grade is B");
     }if (marks>= 70 && marks <=79){
            System.out.println("Your grade is C");
        }if(marks>= 60 && marks <=69) {
            System.out.println("Your grade is D");
        }if   (marks>= 0 && marks <=59) {
            System.out.println("You are fail");
        }
       //this is not recommended
        //it will keep check extra work load on jvm



    }
}
