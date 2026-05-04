public class MileKilometerConverter {
  
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }

    
    public static void main(String[] args) {
        
        System.out.println("2 miles = " + mileToKilometer(2) + " kilometers");
        
        System.out.println("2 kilometers = " + kilometerToMile(2) + " miles");

        System.out.println("\nMiles to Kilometers");
        for (int mtok = 1; mtok <= 10; mtok++) {
            System.out.println(mtok + " miles = " + mileToKilometer(mtok));
        }

        System.out.println("\nKilometers to Miles");
        for (int ktom = 1; ktom <= 10; ktom++) {
            System.out.println(ktom + " kilometers = " + kilometerToMile(ktom));
        }
    }
}
