import java.util.Scanner;

public class MinRunwayLength{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter airplane acceleration in m/s square");
            int a = inputNum.nextInt();

             System.out.println("Enter airplane take-off speed in m/s");
            int v = inputNum.nextInt();

            int v2 = v * v;
            int a2 = a * 2;
            double minLength = v2/a2;

            System.out.println("Minimum runway length needed is: " + minLength);
}
}
