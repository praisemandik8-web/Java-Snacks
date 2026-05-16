//write a program that simulates the catching of a thief, hint: program ends when I shout "Thief"
import java.util.Scanner;
public class ThiefCatcher{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    
    while(true){
     System.out.println("Enter signal");
     String name = inputCollector.next();
         if (name.equalsIgnoreCase("thief")){
         break;
      
         }
        if (name.equalsIgnoreCase("Thief")){
         break;
         }

       }

    }
}
