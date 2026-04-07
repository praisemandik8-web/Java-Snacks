import java.util.Scanner;
public class FinalPrice{
    public static void main (String[]args){
        Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter price");
            int price = inputLove.nextInt();

            System.out.println("Enter discount percentage");
            int disPer = inputLove.nextInt();
            
            double disPer2 = disPer / 100.0;
            
            double disAmt = disPer2 * price;
            double finPrice = price - disAmt;

            System.out.println("discount amount is $" + disAmt);
            System.out.println("final price is  $" + finPrice);

}
}
