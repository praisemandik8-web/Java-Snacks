import java.util.Scanner;
    public class MinutesConverter {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter number in minutes");
            int num = inputLove.nextInt();

            int days = num/1440;
            int hours = num/60;
            int remMin = num % 60;

            System.out.printf("when converted to days %d is %d\n", num, days);
            System.out.printf("when converted to hours %d is %d\n", num, hours);
            System.out.printf("remaining minutes of %d is %d\n", num, remMin);







}
}
