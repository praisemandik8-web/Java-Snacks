import java.util.Scanner;
public class TaskFive{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Input second number");
        int secondNumber = inputCollector.nextInt();
        int prodt = firstNumber * secondNumber;
        System.out.println("Product of the two numbers is " + prodt);
        


}
}
