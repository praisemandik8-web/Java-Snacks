import java.util.Scanner;

public class BMIConverter{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("To calculate BMI");            
            System.out.println("Enter weight in pounds");
            int w = inputNum.nextInt();
             System.out.println("Enter height in inches");
            int h = inputNum.nextInt();

            double w2 = w * 0.45359237;
            double h2 = h * 0.0254;
            double bmi= w2/h2;

            System.out.println("after converting weight and height to kg and meters, BMI is: " + bmi);

}
}
