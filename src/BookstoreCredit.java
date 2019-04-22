import java.util.Scanner;

public class BookstoreCredit {

    public static void main (String [] args){

        double gpa;


        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your GPA >>>>");
        gpa = input.nextDouble();

        bookstoreCredit(gpa);
    }


    public static void bookstoreCredit (double gpa){

       double credit = gpa*10;

       System.out.println("Your Bookstore credit is " + credit);
    }
}
