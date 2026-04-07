import java.util.Scanner;
    public class AnnualTax {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter monthly salary ");
            int salary = inputLove.nextInt();

            double tax1 = 0.15 * salary;
            double tax2 = 0.25 * salary;

            double annualTax1 = tax1 * 12;
            double annualTax2 = tax2 * 12;

            if(salary <= 300000){
            System.out.println("No tax owed");
}
            if(salary >= 300001 && salary <= 600000 ){
            System.out.println("Annual tax owed is " + annualTax1);
}
            if(salary > 600000){
            System.out.println("Annual tax owed is " + annualTax2);
}


}
}
