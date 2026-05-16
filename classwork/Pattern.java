//ENter number of rows; 5
//*
//**
//***
//****
//*****



import java.util.Scanner;
public class Pattern{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int numberOfRows = inputCollector.nextInt();
    
    for(int rowCounter = 1; rowCounter <= numberOfRows; rowCounter++){
    for(int spaceCounter = numberOfRows; spaceCounter>numberOfRows; spaceCounter = spaceCounter --) 
        { 
        System.out.println(" ");
        
    for(int starCounter = 1; starCounter <= rowCounter; starCounter++){  
        System.out.print("*");
}
        
}  
            
}
        System.out.print("*"); 
        System.out.println();   
 
  
}
}
