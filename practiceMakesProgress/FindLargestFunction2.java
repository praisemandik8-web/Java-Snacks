public class FindLargestFunction2{
   
    public static int findLargest(int[] arr) {
    int largest = arr[0];
    
    for(int num=1; num<arr.length; num++){
    if(arr[num] > largest){
    largest = arr[num]; 

    }



    }

    return largest;

    }

    public static void main(String[] args){
    int[] numbers = {32, 43, 11, 55, 67, 88, 44, 2};
    System.out.println(findLargest(numbers));

}    
}



