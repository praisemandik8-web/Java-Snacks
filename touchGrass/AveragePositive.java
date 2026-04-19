import java.util.Scanner;
public class AveragePositive{
public static void main(String[]arg){
    Scanner inputCollector = new Scanner(System.in);
    int total = 0;
    int count = 0;
    int number= 0;
    int average = 0;
    while (number > 0)  {
    System.out.println("Enter Number");
    number= inputCollector.nextInt();
    total = total + number;
    count++;
    average = total/count;
}
System.out.println(average);

}
}

