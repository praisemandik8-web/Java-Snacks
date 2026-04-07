import java.util.Scanner;
    public class FizzBuzz {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter number");
            int num = inputLove.nextInt();

            int buzz = num % 5;
            int fizz = num % 3;

            if(buzz == 0){
            System.out.println("Buzz");
}
            if(fizz == 0){
            System.out.println("Fizz");
}
            if(buzz == 0 && fizz == 0){
            System.out.println("FizzBuzz");
}
            if(buzz != 0 && fizz != 0){
            System.out.println("fizzbuzz");
}



} 
}
