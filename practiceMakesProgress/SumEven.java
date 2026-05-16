import java.util.Scanner;
public class SumEven{
    public static void main(String[]args){
    Scanner inputLove = new Scanner(System.in);

    int scoreCounter = 1;
    int evenIndex= 0;
    
    while ( scoreCounter <= 10) 
    {
    System.out.println("Enter Score");
    int score = inputLove.nextInt();

    if ( scoreCounter % 2 == 0){
    evenIndex += score;
}
   scoreCounter++;
    
    
}
    
    System.out.println("sum of even indexes " + evenIndex); 
     

}
}
