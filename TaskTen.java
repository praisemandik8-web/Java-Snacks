import java.util.Scanner;
public class TaskTen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int doub = number + number;
        System.out.printf("double of %d is %d", number, doub);
        
        
}
}
