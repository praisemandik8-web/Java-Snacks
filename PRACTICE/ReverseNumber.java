import java.util.Scanner;
public class ReverseNumber{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter a number you want to reverse Chief.");
    int number = inputCollector.nextInt();

    int reverse = 0;
        while(number > 0){
        int digit = number % 10;
        reverse = reverse *10 + digit;
        number = number/10;
        }    
    System.out.println("The reverse is "+ reverse);
    }



}
