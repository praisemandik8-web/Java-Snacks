import java.util.Scanner;
public class TaskEight{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int cube = number * number * number;
        System.out.println("Square of number is " + cube);
        
}
}
