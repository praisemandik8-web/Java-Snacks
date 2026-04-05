import java.util.Scanner;

public class SqrmeterstoPing{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("enter number in Square meters");
            int meters = inputNum.nextInt();
            
            double ping = meters * 0.3025;
            System.out.println("value after coverting from Sqaure meters to ping is " + ping);

}
}
