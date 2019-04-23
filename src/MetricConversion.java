import java.util.Scanner;

public class MetricConversion {

    public static void main (String [] args){

        int inch;
        int gallon;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter a number of inches >>>>");
        inch = input.nextInt();

        System.out.print("Please enter a number of gallons >>>>");
        gallon = input.nextInt();

        inches(inch);

        liters(gallon);
    }

    public static void inches (int inch){

        double centi = 2.54;
        double centin;

        centin = inch * centi;


        System.out.println("The number of centimeters in your inches is "+ centin);
    }
    public static void liters(int gallon){

        double liter = 3.7854;
        double galler;

        galler = gallon * liter;

        System.out.println("The number of liters in your gallon(s) is "+ galler);
    }
}
