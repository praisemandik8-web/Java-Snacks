import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestOshoFree {


    @Test
    public void shouldApplyStarter10PercentDiscount() {
        double result = OshoFree.oshoFreee(8000, new String("STARTER10"));

        
        assertEquals(7200.0, result, 0.01);
    }
}
