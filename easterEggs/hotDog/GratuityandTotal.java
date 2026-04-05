import java.util.Scanner;

public class GratuityandTotal{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter subtotal");
            int subtotal = inputNum.nextInt();

             System.out.println("Enter gratuity rate");
            int gratuityRate = inputNum.nextInt();

            double gratuity = gratuityRate/100;
            double total = gratuity + subtotal;

            System.out.printf("gratuity is %d and total is %d",  gratuity, total);

            
}
}
