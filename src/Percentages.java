import java.util.Scanner;

public class Percentages {

    public static void main (String [] args){
        double a;
        double b;




        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number >>>> ");
        a = input.nextDouble();
        System.out.print("Please enter another number >>>> ");
        b = input.nextDouble();

        computePercent(a, b);

    }

    public static void computePercent(double a, double b){

        double percent = (a/b)*100;

        System.out.println(a + " is " + percent + " percent of " + b);
    }

}
