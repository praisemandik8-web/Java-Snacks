import java.util.Scanner;
public class ScoreAverage{
    public static void main(String[]args){
    Scanner inputLove = new Scanner(System.in);

    int total = 0;
    int scoreCounter = 1;
    
    while ( scoreCounter <= 10) 
    {
    System.out.println("Enter Score");
    int score = inputLove.nextInt();

    total= total + score;
    scoreCounter = scoreCounter + 1;
    
    
}
    int average = total/10;
    
    System.out.println("average is " + average);  

}
}
