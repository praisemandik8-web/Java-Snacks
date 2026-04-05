import java.util.Scanner;

public class MeterstiFeet{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("enter number in meters");
            int meters = inputNum.nextInt();

            double feet = meters * 3.2786;
            System.out.println("number in feet is " + feet);

}
}

