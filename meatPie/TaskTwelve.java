import java.util.Scanner;
public class TaskTwelve{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Input second number");
        int secondNumber = inputCollector.nextInt();

        System.out.printf("first number is %d, second number is %d ", firstNumber, secondNumber);

}
}
