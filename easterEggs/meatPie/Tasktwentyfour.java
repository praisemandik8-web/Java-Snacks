import java.util.Scanner;
public class Tasktwentyfour{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);

            System.out.println("Enter first number");
            int firstNumber = inputCollector.nextInt(); 
            System.out.println("Enter second number");
            int secondNumber = inputCollector.nextInt(); 

            int firstNumber1 = secondNumber;
            int secondNumber1 = firstNumber; 

            System.out.println("First number is now: " + firstNumber1);
            System.out.println("Second number is now: " + secondNumber1);
           
           
}      
}
