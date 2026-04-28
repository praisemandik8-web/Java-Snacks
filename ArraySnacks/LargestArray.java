public class LargestArray {

    public static int findLargest(int[] arr) {
        int largest = arr[0]; 

        for (int num = 1; num < arr.length; num++) {
            if (arr[num] > largest) {
                largest = arr[num]; 
    }
    }

        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};
        System.out.println(findLargest(numbers)); 
    }
}
