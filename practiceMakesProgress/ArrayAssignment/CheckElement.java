public class CheckElement {

    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        System.out.println(contains(numbers, 5)); 
        System.out.println(contains(numbers, 2)); 
    }
}
