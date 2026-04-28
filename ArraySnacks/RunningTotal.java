public class RunningTotal {

    public static void runningTotal(int[] arr) {
        for (int num = 1; num < arr.length; num++) {
            arr[num] = arr[num] + arr[num - 1];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        runningTotal(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
    }
}
