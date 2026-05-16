//a program that collects input from the user and sums all the digits if the number
import java.util.Scanner;
    public class NumberSum{
        public static void main(String[]args){
        Scanner inputLove = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = inputLove.nextInt();

        int sum = 0;
        
        while ( number > 0 ) {
        sum= sum+ (number % 10);
        
         number= number/10;
        
        
        }
        
        
System.out.println("Sum of digits is " + sum); 
}
}

