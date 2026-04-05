import java.util.Scanner;
public class TaskFour{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Input second number");
        int secondNumber = inputCollector.nextInt();
        int diff = firstNumber - secondNumber;
        System.out.println("Difference between the two numbers is " + diff);
        


}
}
