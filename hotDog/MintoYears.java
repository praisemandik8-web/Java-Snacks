import java.util.Scanner;

public class MintoYears{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter number of minutes");
            int minutes = inputNum.nextInt();

            int days = minutes/24;
            int year = days/365;
            

            System.out.println(year);
            System.out.println(days);
}
}

                
