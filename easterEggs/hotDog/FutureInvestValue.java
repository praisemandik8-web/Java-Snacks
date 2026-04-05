import java.util.Scanner;

public class FutureInvestValue{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("To future investment value");            
            System.out.println("Enter investment amount");
            int a = inputNum.nextInt();

            System.out.println("Enter annual interest rate");
            int air = inputNum.nextInt();

            System.out.println("Enter number of years");
            int noy = inputNum.nextInt();
            int noy2 = noy * 12;

            int fiv = a * (air/100) ^ noy2; 
            System.out.println("Future investment value is " + noy2);

}
}
