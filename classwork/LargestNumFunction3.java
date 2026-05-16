import java.util.Scanner;

public class LargestNumFunction3{
public static void main(String[]args){
   // public static int largestNum(){
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter first number");        
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter second number");        
        int secondNumber = inputCollector.nextInt();

        System.out.println("Enter third number");        
        int thirdNumber = inputCollector.nextInt();

        int largestNumber = firstNumber;

        if (secondNumber > firstNumber){
        largestNumber = secondNumber;
}       if (secondNumber< thirdNumber){
        largestNumber = thirdNumber;

        
}

      
       System.out.println("Largest number is " + largestNumber);  
   
      
       
}
}
