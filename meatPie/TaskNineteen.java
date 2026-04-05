import java.util.Scanner;
public class TaskNineteen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int remdr = number % 2;
        System.out.println("when divided by 2, the remainder of number is: " + remdr);
}
}
