import java.util.Scanner;
public class TaskEighteen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int minus5 = number - 5;
        System.out.println("when 5 is substracted from it, number is " + minus5);
}
}
