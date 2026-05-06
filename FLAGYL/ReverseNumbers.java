import java.util.Scanner;
public class ReverseNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
