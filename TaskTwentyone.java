import java.util.Scanner;
public class TaskTwentyone{
    public static void main (String[]args){
         Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Enter Length");
        int base = inputCollector.nextInt();

        System.out.println("Enter Width");
        int height = inputCollector.nextInt();
        int area =  (base * height)/2;
        System.out.println("Area of the triangle is " + area);
        

}
}
