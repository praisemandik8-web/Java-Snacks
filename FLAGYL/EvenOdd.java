import java.util.Scanner;
public class EvenOdd {
    
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int even = 0, odd = 0;
        int num;

        while ((num = inputCollector.nextInt()) != 0) {
            if (num % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
