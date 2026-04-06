import java.util.Scanner;
public class HourtoGreeting{
    public static void main (String [] arg){
        Scanner inputLove = new Scanner(System.in);       
        
        System.out.println("Enter current hour from 0-23 for greeting response");
        int hour = inputLove.nextInt();

        if (hour >= 5 && hour <= 11) {
        System.out.println("Good Morning");
}
         if (hour >= 12 && hour <= 17) {
        System.out.println("Good Afternoon");
}
         if (hour >= 18 && hour <= 21) {
        System.out.println("Good Evening");
}
         if (hour >= 22 && hour <= 4) {
        System.out.println("Good Night");
}
}
}
