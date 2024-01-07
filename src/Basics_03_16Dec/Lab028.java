package src.Basics_03_16Dec;

public class Lab028 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 0.1845f;
        float total = course + GST* course; // use bigger bucket else loose the data
        System.out.println(total);

        //int total = course + (int)GST* course;
       // System.out.println(total);


    }
}
