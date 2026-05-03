import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MenstrualAppTest {

    @Test
    void testCalculateCycle() {
        
        int lastPeriodDate = 1;
        int avgCycleLength = 28;
        int periodDuration = 5;

        
        CycleResult result = MenstrualApp.calculateCycle(
            lastPeriodDate,
            avgCycleLength,
            periodDuration
        );

        
        assertEquals(29, result.nextPeriodDate);
        assertEquals(15, result.ovulationDate);
        assertEquals(10, result.fertileStart);
        assertEquals(16, result.fertileEnd);
    }
}
