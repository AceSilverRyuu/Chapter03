public class DebugThree1 {


    public static void main(String[] args)
    {
        double RATE= 0.15;
        double myCheck = 50.00;
        double yourCheck = 19.95;
        System.out.println("Tips are " + RATE);
        calcTip2((int) myCheck);
        calcTip((int) yourCheck);
    }
    public static void calcTip(double yourCheck)
    {
        final double RATE = 0.15;
        double tip;
        tip = yourCheck * RATE;
        System.out.println("Your tip should be at least " + tip);
    }
    public static void calcTip2(double myCheck)
    {
        final double RATE = 0.15;
        double tip;
        tip = myCheck * RATE;
        System.out.println("My tip should be at least " + tip);
    }
}

