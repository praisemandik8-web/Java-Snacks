import java.util.Scanner;
public class EndsWFive{
    
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("Enter number");
    int number = inputCollector.nextInt();

        if(number % 10 ==5){
            System.out.println(number + " ends with 5");
        } 
        else{
            System.out.println(number + " does not end with 5");             
        }
    
    }

}
