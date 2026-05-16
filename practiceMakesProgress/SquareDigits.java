//a program that collects input from the user and gives sqaures of all the digits if the number
import java.util.Scanner;
    public class SquareDigits{
        public static void main(String[]args){
        Scanner inputLove = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = inputLove.nextInt();

        
        
        while ( number > 0 ) {
            int digit = number % 10;
           int square= digit * digit;
            System.out.println("Square of digits is " + square);
            number= number/10;
           
            
            
    
         
        }
        
        

}
}

