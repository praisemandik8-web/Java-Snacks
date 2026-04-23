// write a method that returns the maximum of two numbers
//import scanner class for inputs
//collect user inputs
//declare variables first and second number
//use if statement to compare variables and determine maximun
//print maximum
import java.util.Scanner;
public class MaxofTwo{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number");
    int firstNum = inputCollector.nextInt();

    System.out.println("Enter second number");
    int secondNum = inputCollector.nextInt();

    if (firstNum > secondNum){
    System.out.printf("%d is the maximun number", firstNum);
}

    else {
    System.out.printf("%d is the maximun number", secondNum);
}


}
}
