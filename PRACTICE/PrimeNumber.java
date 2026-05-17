import java.util.Scanner;

    public class PrimeNumber{

        public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = inputCollector.nextInt();

        boolean isPrime = true;

            if(number <=1){
                isPrime = false;
            }
            for(int count=2; count<number; count++){
                if(number % count == 0){
                isPrime = false;
                break;
                }
            }
        
            if(isPrime){
                System.out.println(number + " is a prime number.");
            }

            else{
                System.out.println(number + " is not a prime number.");
            }
        }














}
