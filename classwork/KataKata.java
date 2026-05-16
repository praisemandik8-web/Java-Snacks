import java.util.Scanner;
public class KataKata{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    int[] arrayStores= new int[10];
    for(int userInput= 1; userInput<=9; userInput++){
    System.out.println("Enter " + userInput + " number");
    //userInput2 = inputCollector.nextInt();
    
     
     int arrayStore = inputCollector.nextInt();
     arrayStores[userInput] = arrayStore;
   
    
    

}

    for (int userInput = 0; userInput<=9; userInput++){
     System.out.print(arrayStores[userInput] + " ");
}
    
       // int arrayStore[]= new int[11];
    // arrayStore[10]= userInput2;
    // userInput2 = arrayStore[9];
     //arrayStore[10]= userInput2;
    //System.out.print(userInput + userInput2);
    //System.out.println(arrayStore[10]);
    //System.out.println(userInput2);


    }
}
