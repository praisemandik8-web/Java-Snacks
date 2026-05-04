public class TaskSix{

    public static void EvenPositions(int[]arr){
        for(int num = 0; num<arr.length; num+=2){
        //System.out.println(arr[num]);

            int sum = 0;
            //int num = 0;
            while(num < arr.length){
            sum += arr[num];
            num++;
            }

            System.out.println(sum);
        
        
        }
    }

    public static void main(String[]args){
    int [] numbers = {10, 20, 30, 40, 50, 60};
    
    EvenPositions(numbers);
    
    
    }


}
