import java.util.Scanner;
public class TaskEleven{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int half = number/2;
        System.out.printf("half of %d is %d", number, half);
        
        
}
}
