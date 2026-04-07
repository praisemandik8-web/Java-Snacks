import java.util.Scanner;
    public class DateValid {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter Day");
            int day = inputLove.nextInt();
            System.out.println("Enter Month");
            int month = inputLove.nextInt();
            System.out.println("Enter Year");
            int year = inputLove.nextInt();

            System.out.printf("%d--%d--%d\n", day, month, year);            
            if(day >= 1 && day <= 30){
            System.out.println("valid day");
}
            else {
            System.out.println("invalid day");}

             System.out.printf("%d--%d--%d\n", day, month, year);            
            if(month > 0 && month <= 12){
            System.out.println("valid month");
}
             System.out.printf("%d--%d--%d\n", day, month, year);            
            if(year >= 1000 && year <= 9999){
            System.out.println("valid year, therefore date is valid");
}


}
}
