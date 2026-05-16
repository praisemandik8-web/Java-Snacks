public class RangeFunction{

    public static int findRangeFunction(int[] arr){
    int largest = arr[0];
    int smallest = arr[0];
    for(int element: arr){
   // for(int num = 1; num<arr.length; num++){
    if (arr[element] > largest ){
        largest = arr[element];
    if (arr[element]< smallest)
        smallest = arr[element];
        }
    }
        return largest-smallest;
        
       
    }

    public static void main(String[]args){
        int[] numbers = {2, 5, 7, 9, 20};
        System.out.println(findRangeFunction(numbers));

        int[] number = {1, 3, 2, 4, 6};
        System.out.println(findRangeFunction(number));
    }


}
