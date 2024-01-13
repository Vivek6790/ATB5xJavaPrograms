package src.basics_04_17Dec;

import java.util.Locale;
import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser name");
        String browser = sc.nextLine();

        switch(browser.toLowerCase()) {
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code");
            case "edge":
                System.out.println("Execute the edge code");
            default:
                System.out.println("I have not idea which browser it is");


        }


    }
}
