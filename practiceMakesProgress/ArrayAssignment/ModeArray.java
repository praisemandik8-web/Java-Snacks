public class ModeArray{

        public static void main(String[]args){
        int[] numbers = {2, 1, 2, 5, 2, 4};
        
        public static int findMostFrequent(int[] numbers) {  
         int mostOccur= numbers[0];
         int maxCount = 0;
         for(int num = 0; num<numbers.length; num++){
            int count = 0;
            for(int numm = 0; num < numbers.length; numm++) {
                if (numbers[num] == numbers[numm]) {
                    count++;
                        }
                    }
            if (count > maxCount) {
            maxCount = count;
            mostOccur = arr[numbers];


            }
        }
    
        return mostOccur;
}


}

