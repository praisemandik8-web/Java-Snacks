import java.util.Scanner;
public class SumofPrimeFactors{
    public static void main(String[]args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("Enter number");
    int number = inputCollector.nextInt();
    int total = 0;
    int count=2;
    
    while (number != 1) {
    if (number % count== 0) {
    
       
    total = total + count;
    number = number/count; 
    
     
    
    

     
         
    
}
      
 
  
}
   System.out.println(total+ number);   
}
    
}
    
