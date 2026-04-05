import java.util.Scanner;

public class AreaofTriangle{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("to calculate area, enter length");
            double length = inputNum.nextInt();

            double lengthSqr = length * length;
            double area1 = (1.73/4.0);
            double area2 = lengthSqr * area1;

            System.out.println(area1 * lengthSqr);


}
}
