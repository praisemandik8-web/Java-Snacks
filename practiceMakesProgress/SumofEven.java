import java.util.Scanner;
public class SumofEven{
    public static void main(String[]args){
    Scanner inputLove = new Scanner(System.in);

    
    int scoreCounter = 1;
    int evenNumber = 0;
    

    while ( scoreCounter <= 10) 
    {
    System.out.println("Enter Score");
    int score = inputLove.nextInt();
    
    if ( score % 2 == 0){
    evenNumber += score;
}
   scoreCounter++;
    
   
}
    
    System.out.println("sum of even numbers is " + evenNumber);     
   //  System.out.println("sum is " + average);
     

}
}
