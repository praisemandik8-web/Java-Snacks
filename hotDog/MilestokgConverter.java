import java.util.Scanner;

public class MilestokgConverter{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter number of miles");
            int miles = inputNum.nextInt();
            double kilogram = miles * 1.6;
        
            System.out.printf("%s converted to kg is %s", miles, kilogram);
}
}
