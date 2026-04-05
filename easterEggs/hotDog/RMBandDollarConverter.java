import java.util.Scanner;

public class RMBandDollarConverter{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter 0 to convert Dollars to RMB");
            System.out.println("Enter 1 to convert RMB to Dollars");             
            int bin = inputNum.nextInt();

            if (bin == 0){
            System.out.println("Enter dollar amount");           
            double amt = inputNum.nextInt();

            amt = amt * 6.8824;
            System.out.println("The RMB equivalace of your Dollars is " + amt + "CNY");

            }

            if (bin == 1){
            System.out.println("Enter RMB amount");           
            double amt2 = inputNum.nextInt();

            amt2 = amt2 * 0.145;
            System.out.println("The Dollar equivalance of your RMB is $" + amt2);

            }
            



}
}
