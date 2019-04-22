import java.util.Scanner;

public class MetricConversion {

    public static void main (String [] args){

        int inch;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter a number >>>>");
        inch = input.nextInt();

        inches(inch);
    }

    public static void inches (int inch){

        double centi = 2.54;
        double centin;

        centin = inch * centi;


        System.out.println("The number of centimeters in your inches is "+ centin);
    }
}
