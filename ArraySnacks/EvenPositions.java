public class EvenPositions {

    public static void EvenPositions(int[] arr) {
        for (int num = 2; num < arr.length; num += 2) {
            System.out.print(arr[num] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        EvenPositions(numbers); 
    }
}
