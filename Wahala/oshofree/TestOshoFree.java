import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestOshoFree{


    @Test
    public void shouldApplyStarter10PercentDiscount() {
        double amountFromUser = 14999;
        double amountFromAnotherUser = 12000;
        String tenPercentPromo = "STARTER10";

        double expectedDiscount = OshoFree.oshoFreee(amountFromUser, tenPercentPromo);
        double actualDiscount = 13499.1;
        assertEquals(actualDiscount, expectedDiscount);
        
        double expectedAmount = OshoFree.oshoFreee(amountFromAnotherUser, tenPercentPromo);
        double actualDiscountFromUser = 10800.0;
        assertEquals(actualDiscountFromUser, expectedAmount);
    }
        @Test
     public void shouldApplyStarter20PercentDiscount() {
        double amountFromUser = 18000;
        String tenPercentPromo = "BIGBOY20";

        double expectedDiscount = OshoFree.oshoFreee(amountFromUser, tenPercentPromo);

        double actualDiscount = 14400;
        assertEquals(actualDiscount, expectedDiscount);
        
       
    }
        @Test
     public void shouldApplyStarter35PercentDiscount() {
        double amountFromUser = 40000;
        String tenPercentPromo = "OSHOFREE35";

        double expectedDiscount = OshoFree.oshoFreee(amountFromUser, tenPercentPromo);

        double actualDiscount = 26000;
        assertEquals(actualDiscount, expectedDiscount);


    }

//    @Test
//    public void ueehffrfrfwffhfrwf(){
//    int isItPrime = 18
//    boolean expectedPrimChecker = PrimeNumber.isItPrime(isItPrime);
//    assert(expectedPrimenumber);
//
//    public static boolean expected = isItPrime(int numberu)
//    }
}
