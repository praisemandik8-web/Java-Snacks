import java.util.Scanner;

public class Patternn{
    public static void main(String[] args){
    
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("ENter number of rows");
    int numberOfRows = inputCollector.nextInt();

    for(int rowCounter = 1; rowCounter <= numberOfRows; rowCounter++){
        for(int spaceCounter = numberOfRows; spaceCounter>rowCounter; spaceCounter--){
        System.out.print(" ");
}
        for(int starCounter = 1; starCounter <= rowCounter; starCounter++){

            System.out.print("*");
}

            System.out.println();
}


            
    }











}
