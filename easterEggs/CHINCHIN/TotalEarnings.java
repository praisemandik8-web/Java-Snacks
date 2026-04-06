import java.util.Scanner;
public class TotalEarnings{
    public static void main (String [] arg){
        Scanner inputLove = new Scanner(System.in);       
        
        System.out.println("Enter hourly wage");
        int hourlyWage = inputLove.nextInt();

         System.out.println("Enter hours worked");
        int hoursWorked = inputLove.nextInt();

        int earnPerHour = hourlyWage * hoursWorked;
        double earnPerHour2 =  earnPerHour * 1.5;

        if (hoursWorked <= 40) {
        System.out.println("Your total earnings is " + earnPerHour);
}
         if (hoursWorked > 40) {
        System.out.println("Your total earnings is " + earnPerHour);
}

}
}
