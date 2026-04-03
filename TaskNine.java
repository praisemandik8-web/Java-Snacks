import java.util.Scanner;
public class TaskNine{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("What's your favorite color?");
        String FavColr = inputCollector.nextLine();
        
        System.out.println("Your favorite color is " + FavColr);

}
}
