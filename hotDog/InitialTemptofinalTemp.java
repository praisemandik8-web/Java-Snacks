import java.util.Scanner;

public class InitialTemptofinalTemp{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter water amount in kg");
            int w = inputNum.nextInt();

             System.out.println("Enter initial temperature");
            int t1 = inputNum.nextInt();

            System.out.println("Enter final temperature");
            int t2 = inputNum.nextInt();

            int t3 = t2-t1;
            double q = w * t3 * 4186;

            System.out.println("Energy needed is: " + q + "joules");
}
}
