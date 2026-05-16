public class LargestArrayFunction{

    public static int findLargestFunction(int[] arr){
    int largest = arr[0];
    for(int num = 1; num<arr.length; num++){
    if (arr[num] > largest ){
        largest = arr[num];
        }
    }
        return largest;
    }

    public static void main(String[]args){
        int[] numbers = {32, 4, 5, 7, 89, 103, 5};
        System.out.println(findLargestFunction(numbers));
    }


}
