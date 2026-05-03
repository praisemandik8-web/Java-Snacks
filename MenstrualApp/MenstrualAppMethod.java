import java.util.Scanner;
public class MenstrualAppMethod {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("WELCOME TO YOUR MENSTRUAL APP");

        System.out.println("Enter last period date:");
        int lastPeriodDate = inputCollector.nextInt();

        System.out.println("Enter average cycle length (e.g 28 days):");
        int avgCycleLength = inputCollector.nextInt();

        System.out.println("Enter period duration:");
        int periodDuration = inputCollector.nextInt();

        
        calculateCycle(lastPeriodDate, avgCycleLength, periodDuration);
    }

    
    public static CycleResult calculateCycle(int lastPeriodDate, int avgCycleLength, int periodDuration) {

        int nextPeriodDate = lastPeriodDate + avgCycleLength;
        System.out.println("Your next period date is in: " + nextPeriodDate + " days");

        int ovulationDate = nextPeriodDate - 14;
        System.out.println("Your next ovulation date is in: " + ovulationDate + " days");

        int fertileStart = ovulationDate - 5;
        int fertileEnd = ovulationDate + 1;
        System.out.println(
            "Your fertility window is between " + fertileStart + " and " + fertileEnd + " days"
        );
    }
}
