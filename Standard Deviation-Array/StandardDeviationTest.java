import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void get_the_sum_of_numbers_in_array(){
    int [] numbers = {3, 4, 6, 8};
    int expectedSum = 21; 
    int actualSum = StandardDeviation.sumArray(numbers);
    assertEquals(actualSum, expectedSum);
    }

    @Test
    public void get_the_mean_of_numbers_in_array(){
    int [] numbers = {3, 4, 6, 8};
    double expectedMean = 5.25;
    double actualMean = StandardDeviation.mean(numbers);
    assertEquals(actualMean, expectedMean);
    

    }



}
