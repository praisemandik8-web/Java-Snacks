import java.util.Arrays;
public class BubbleSort{
    public static void main(String[]args){
      int [] numbers = {12,234, 22, 11, 2};

        for(int index = 0; index<numbers.length; index++){
            
            for(int sort =index+1; sort<numbers.length; sort++){

            int temp = 0;
            temp= numbers[sort];
            numbers[sort]= numbers[index];
            numbers[index] = temp;
            }
            
        }
            System.out.println(Arrays.toString(numbers)); 
    }
} 
//  temp = a
//a =b
// b= temp
