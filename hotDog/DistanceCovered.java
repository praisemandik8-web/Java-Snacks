import java.util.Scanner;

public class DistanceCovered{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter initial velocity in m/s");
            int u = inputNum.nextInt();

             System.out.println("Enter time span, t in seconds");
            int t = inputNum.nextInt();

            System.out.println("Enter acceleration, a in m/s square");
            int a = inputNum.nextInt();

            int t2 = t*t;
            int at2= a*t2;
            double distanceCovered = u*t + 0.5 * at2;

            System.out.println("distance covered is: " + distanceCovered + "m/s");
}
}
