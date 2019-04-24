import java.util.Scanner;

public class FToC {

    public static void main (String [] args){

        int fah1;
        int fah2;
        int fah3;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter the morning temp in fahrenheit >>>>");
        fah1 = input.nextInt();

        System.out.print("Please enter the afternoon temp in fahrenheit >>>>");
         fah2= input.nextInt();

        System.out.print("Please enter the evening temp in fahrenheit >>>>");
        fah3= input.nextInt();

        cel1(fah1);

        cel2(fah2);

        cel3(fah3);








    }

    public static void cel1 (int fah1){

        double cel1;

        cel1 = (fah1 - 32) * 5/9;

        System.out.println("It was " + cel1 + " celsius and " + fah1 + " fahrenheit in the morning.");
        if (fah1 < 32){

            System.out.println("It is below freezing.");
        }

        if (fah1 >= 100){

            System.out.println("It is hot outside.");
        }

    }
    public static void cel2 (int fah2){

        double cel2;

        cel2 = (fah2 - 32) * 5/9;

        System.out.println("It was " + cel2 + " celsius and " + fah2 + " fahrenheit in the afternoon.");
        if (fah2 < 32){

            System.out.println("It is below freezing.");
        }

        if (fah2 >= 100){

            System.out.println("It is hot outside.");
        }

    }
    public static void cel3 (int fah3){

        double cel3;

        cel3 = (fah3 - 32) * 5/9;

        System.out.println("It was " + cel3 + " celsius and " + fah3 + " fahrenheit in the evening.");
        if (fah3 < 32){

            System.out.println("It is below freezing.");
        }

        if (fah3 >= 100){

            System.out.println("It is hot outside.");
        }

    }
}
