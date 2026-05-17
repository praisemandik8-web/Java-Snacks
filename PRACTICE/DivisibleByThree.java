import java.util.Scanner;
public class DivisibleByThree{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter number, chief!");
    int number = inputCollector.nextInt();
        if(number % 3 == 0){
        System.out.println(number + " is divisible by 3. ");
        }
        else{
        System.out.println(number + " is not divisible by 3.");
        }




    }













}
