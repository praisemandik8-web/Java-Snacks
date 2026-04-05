import java.util.Scanner;
public class TaskTwenty{
    public static void main (String[]args){
        
        Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Enter Length");
        int length = inputCollector.nextInt();

        System.out.println("Enter Width");
        int width = inputCollector.nextInt();
        int area =  length * width;
        System.out.println("the area is " + area);
        

}
}
