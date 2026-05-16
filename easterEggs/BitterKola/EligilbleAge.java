import java.util.Scanner
    public class EligibleAge{
        public static void main (String[]args){

            Scanner inputLove = new Scanner(System.in);
            
                System.out.println("Enter Birth year")
                int birthYear = inputLOve.nextInt();
                System.out.println("Enter Current year")
                int currentYear = inputLOve.nextInt();

                int age = currentYear - birthYear;

                if(age >= 65){
                System.out.println("You are eligible for a senior citizens' discount'");
}
                else{
                System.out.println("Your age is " + age);
}           
        
}
}
