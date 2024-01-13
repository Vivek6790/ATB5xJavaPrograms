package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1,side2,side3 , I will tell which type of triangle it is");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();


        if((side1 == side2)  && (side2 == side3) && (side1 == side3)){
            System.out.println("It is Equilateral");
        }else if((side1 == side2)  || (side2 == side3) || (side1 == side3)){
            System.out.println("It is isosceles");
        }else{
            System.out.println("its is scalene");
        }










    }
}
