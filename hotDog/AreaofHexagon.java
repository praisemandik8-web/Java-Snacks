import java.util.Scanner;

public class AreaofHexagon{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("To calculate Area");            
            System.out.println("Enter side of Hexagon");
            int h = inputNum.nextInt();
            
            int h2 = h * h;
            double h3 = 0.7211;

            double area = h3 * h2;
            System.out.println("Area is " + area);

}
}
