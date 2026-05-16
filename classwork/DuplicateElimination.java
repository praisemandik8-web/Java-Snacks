//exercise 7.12
import java.util.Scanner;
public class DuplicateElimination{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    int[]num = new int[10];
    for(int userInput= 10; userInput<= 100; userInput++){
    System.out.println("Enter 10 number " );

    int numStore = inputCollector.nextInt();
    num[userInput] = numStore ;

    int duplicateNo = 0;
    while (numStore != -1){ 
    if(duplicateNo == numStore){
    numStore = inputCollector.nextInt();
    System.out.println(num[userInput]);
    }

    }
    }

    

    }




}
