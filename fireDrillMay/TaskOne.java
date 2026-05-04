import java.util.Scanner;
public class TaskOne{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
         int[] arrayStores= new int[10];
        for(int score = 0; score<= 9; score++){
        int arrayStore = inputCollector.nextInt();
        arrayStores[score] = arrayStore;
       
        }    
            for (int score = 0; score<=9; score++){
            System.out.println(arrayStores[score] + "print array vertically ");
            }
                for (int score = 0; score<=9; score++){
            System.out.print(arrayStores[score] + "print array horizontally ");
            }
    
    }

}
