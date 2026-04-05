import java.util.Scanner;

public class AnnualtoMonthinterest{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("To calculate interest for the next month");            
            System.out.println("Enter Balance");
            int b = inputNum.nextInt();

            System.out.println("annual percentage interest rate");
            int apir = inputNum.nextInt();

            double air = apir/100;
            double m1 = air/1200;
            double m2 = b * m1;
            System.out.println("interest for the next month is :" + m1);

}
}
