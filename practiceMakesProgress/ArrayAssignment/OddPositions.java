public class OddPositions {

    public static void OddPositions(int[] arr) {
        for (int num = 1; num < arr.length; num += 2) {
            System.out.print(arr[num] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        OddPositions(numbers); 
    }
}
