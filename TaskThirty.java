import java.util.Scanner;
public class TaskTwentynine {
 public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
        
            System.out.println("Enter first number");
            int firstNumber = inputCollector.nextInt();
            System.out.println("Enter second number");
            int secondNumber = inputCollector.nextInt();

            int sum = firstNumber + secondNumber;
            int product = firstNumber * secondNumber;

            System.out.printf("sum and product of the numbers are:  %d and %d", sum, product);
}
}
