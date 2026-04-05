import java.util.Scanner;
public class TaskFourteen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Input second number");
        int secondNumber = inputCollector.nextInt();
    
        System.out.println("Input second number");
        int thirdNumber = inputCollector.nextInt();

        int avg = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.println("Average of the three numbers is " + avg);
     

}
}
