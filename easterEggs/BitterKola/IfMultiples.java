import java.util.Scanner;
    public class IfMultiples{
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);
            
            System.out.println("Enter first number");
            int num1 = inputLove.nextInt();
        
            System.out.println("Enter second number");
            int num2 = inputLove.nextInt();

            int num3 = num2 % num1;

            if (num3 == 0){
            System.out.printf("%d is a multiple of %d ", num1, num2);                
}
                        if (num3 != 0){
            System.out.printf("%d is a multiple of %d ", num1, num2);                
}

}
}
