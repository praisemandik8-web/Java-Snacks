import java.util.Scanner;
public class TaskTwentytwo{
    public static void main (String[]args){
         Scanner inputCollector = new Scanner(System.in);
         
        System.out.println("Enter Length");
        int r = inputCollector.nextInt();
        int rSquare = r * r;
        double pie = 3.142; 

        double area =  pie * rSquare;
        System.out.println("Area of the circle is " + area);
        

}
}
