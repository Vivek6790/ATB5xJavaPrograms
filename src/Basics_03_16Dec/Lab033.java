package src.Basics_03_16Dec;

import java.sql.SQLOutput;

public class Lab033 {
    public static void main(String[] args) {
        String name = "The Java Learning"; // this string will create in SCP
        String name1 = "The Java Learning"; // This will not create, both of then pointed same string
        // as both string are same

        String name2 = new String ("The Java Learning");// this string will create in Object area or Heapcreated
        //here total two created ,memory management done

//        System.out.println(name == name1);  reference comparison
//        System.out.println(name.equals(name1)); // value comparison

        System.out.println(name == name2); //false as one is object area second is scp area
        System.out.println(name.equals(name2));  //value comparison

        String name3 = new String ("The Java learning");
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3)); //Ignore the case


    }
}
