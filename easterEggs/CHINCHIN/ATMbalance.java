import java.util.Scanner;
    public class ATMbalance{
        public static void main(String[]args){
        Scanner inputLove = new Scanner(System.in);

        System.out.println("Welcome to ATM app");
        System.out.println("Enter ATM pin");
        int pin = inputLove.nextInt();

        if (pin == 1234){
        System.out.println("Your balance is $1000");
}
        else {
        System.out.println("Incorrect pin");
}

}
}
