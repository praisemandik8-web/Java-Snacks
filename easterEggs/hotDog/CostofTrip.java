import java.util.Scanner;

public class CostofTrip{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("to calculate cost of trip");            
            System.out.println("Enter distance to drive in miles");
            int d = inputNum.nextInt();

            System.out.println("price of fuel per gallon");
            int p = inputNum.nextInt();

            System.out.println("Enter fuel efficiency in miles per gallon");
            int f = inputNum.nextInt();

            int g = d/f; //gallons needed = distance/fuel efficeincy
            int t = g * p; //cost = gallons needed * price per gallon

            System.out.println ("cost of trip is " + t);

}
}
