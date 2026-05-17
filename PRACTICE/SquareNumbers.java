import java.util.Scanner;
public class SquareNumbers{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number");
    int numOne = inputCollector.nextInt();
    System.out.println("ENter second number");
    int numTwo = inputCollector.nextInt();

    int squareOne = numOne *numTwo;
    int squareTwo = numTwo * numTwo;

    int sumSquare = squareOne + squareTwo;
    int diffSquare = squareOne - squareTwo;  

    System.out.println("Square of the first and second number is " + squareOne + " and " + squareTwo);
    System.out.println("Sum of both squares is " + sumSquare);
    System.out.println("Difference of both squares is " + diffSquare);

    }
    



}
