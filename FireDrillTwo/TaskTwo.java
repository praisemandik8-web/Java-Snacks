import java.util.Scanner;
public class TaskTwo{
public static void main(String[]args){
    
        Scanner inputLove = new Scanner(System.in);
        //for (int score= 1; score <= 10; score++){
        
        System.out.println("Enter score 1");
        int scoreOne = inputLove.nextInt();
        
        System.out.println("Enter score 2");
        int scoreTwo = inputLove.nextInt();
        
        System.out.println("Enter score 3");
        int scoreThree = inputLove.nextInt();
        
        System.out.println("Enter score 4");
        int scoreFour = inputLove.nextInt(); 
        
        System.out.println("Enter score 5");
        int scoreFive = inputLove.nextInt();
        
        System.out.println("Enter score 6");
        int scoreSix = inputLove.nextInt();
        
        System.out.println("Enter score 7");
        int scoreSeven = inputLove.nextInt();
        
        System.out.println("Enter score 8");
        int scoreEight = inputLove.nextInt(); 

        System.out.println("Enter score 9");
        int scoreNine = inputLove.nextInt();
        
        System.out.println("Enter score 10");
        int scoreTen = inputLove.nextInt(); 
    int sum = scoreOne+ scoreTwo+ scoreThree+ scoreFour+ scoreFive+ scoreSix+ scoreSeven+ scoreEight+ scoreNine+ scoreTen;
    int average = (scoreOne+ scoreTwo+ scoreThree+ scoreFour+ scoreFive+ scoreSix+ scoreSeven+ scoreEight+ scoreNine+ scoreTen)/10;


    System.out.println("average is "+ average);

}
}

