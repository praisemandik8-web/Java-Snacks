import java.util.Scanner;
public class TaskSeven{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int square = number * number;
        System.out.println("Square of number is " + square);
        
}
}
