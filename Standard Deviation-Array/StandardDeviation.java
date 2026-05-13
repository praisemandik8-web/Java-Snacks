public class StandardDeviation{

    public static void main(String[]args){
        int [] numbers = {3,4,6,8};
        System.out.println("Sum of array is: "+ sumArray(numbers));
        System.out.println("mean of array is: "+ mean(numbers));
        System.out.println("mean deviation is: "+ meanDeviation(numbers));
    }
        public static int sumArray(int []array){
        
            int sum = 0;
            for(int num = 0; num<array.length; num++){
            sum = sum + array[num];
            }
            return sum;
    
    
    
        }

        public static double mean(int []array){
            int sum = 0;
            int mean = 0;
            for(int num = 0; num<array.length; num++){
            sum = sum + array[num];
            
            }
            
            return (double)sum/array.length;
        }

        public static double meanDeviation(int []array ){
            double newMean = mean(array);
            double sum = 0;

            for(int num = 0; num<array.length; num++){
            double diff = array[num]- newMean;

                if(diff <0){
                diff = -diff;
                }
           
            }
            return sum/array.length; 
        }

}
