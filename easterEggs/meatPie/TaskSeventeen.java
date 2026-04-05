import java.util.Scanner;
public class TaskSeventeen{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Input first number");
        int number = inputCollector.nextInt();

        int plus10 = number + 10;
        System.out.println("when 10 is added to it, number is: " + plus10);
}
}
