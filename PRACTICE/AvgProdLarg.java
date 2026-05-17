import java.util.Scanner;
public class AvgProdLarg{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number");
    int numOne = inputCollector.nextInt();
    System.out.println("Enter second number");
    int numTwo = inputCollector.nextInt();
    System.out.println("Enter third number");
    int numThree = inputCollector.nextInt();

    int average = (numOne + numTwo + numThree)/3;
    int product = (numOne * numTwo * numThree);
    
    int largest = numOne;
        if(numTwo > numOne && numTwo > numThree){
            largest = numTwo;
            }
        else if(numThree > numOne && numThree > numTwo){
            largest = numThree;
            }
        else{
            System.out.println("Error");
            }
                        
        
     System.out.println("Average is: " + average);
     System.out.println("product is: " + product);
     System.out.println("largest is: " + largest);               


    }




}
