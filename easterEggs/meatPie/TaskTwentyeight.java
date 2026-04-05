import java.util.Scanner;
public class TaskTwentyeight {
        public static void main(String[]args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = inputCollector.nextInt();

        int div3 = number/3;
        System.out.printf("when %d is divided by 3, it is %d", number, div3);
}
}
