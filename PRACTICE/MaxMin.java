public class MaxMin{

    public static void main(String[]args){
        int [] numbers = {34,22,5,67,8,99,1,5,78};
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i<numbers.length; i++){
        
            if(numbers[i] > max)
            max = numbers[i];
           
            if(numbers[i] < min)
            min = numbers[i];
            
                       
            
         
        }
       
       System.out.println(max);
       System.out.println(min);
    }

}
