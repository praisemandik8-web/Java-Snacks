import java.util.Scanner;
public class MonthName{
    public static void main (String [] arg){
        Scanner inputLove = new Scanner(System.in);       
        
        System.out.println("Enter a number from 1 to 12");
        int monthNum = inputLove.nextInt();

        if (monthNum == 1) {
        System.out.println("January");
}
         if (monthNum == 2) {
        System.out.println("February");
}
         if (monthNum == 3) {
        System.out.println("March");
}
         if (monthNum == 4) {
        System.out.println("April");
}
         if (monthNum == 5) {
        System.out.println("May");
}
         if (monthNum == 6) {
        System.out.println("June");
}
         if (monthNum == 7) {
        System.out.println("July");
}
         if (monthNum == 8) {
        System.out.println("August");
}
        if (monthNum == 9) {
        System.out.println("September");
}
         if (monthNum == 10) {
        System.out.println("October");
}
         if (monthNum == 11) {
        System.out.println("November");
}
         if (monthNum == 12) {
        System.out.println("December");
}
        if (monthNum < 1 || monthNum > 12){
        System.out.println("invalid number");
}
}
}
