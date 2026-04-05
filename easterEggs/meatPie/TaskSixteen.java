import java.util.Scanner;
public class TaskSixteen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int multi5 = number * 5;
        System.out.println("when multiplied by 5, number is: " + multi5);
}
}
