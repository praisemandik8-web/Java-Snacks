import java.util.Scanner;
public class Factorial{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int number = inputCollector.nextInt();

    int result = 1;
        for(int num = 1; num<=number; num++){
        result = result * num;
        }
    System.out.println("The factorial of " + number+ " is " + result);    
    
    }

}
