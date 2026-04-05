import java.util.Scanner;

public class SavingsAccValue{
    public static void main (String[]args){
        Scanner inputNum = new Scanner(System.in);

            System.out.println("Enter monthly saving amount");
            int m = inputNum.nextInt();

            double m1 = m + 0.003125;
            double m2 = m1 + 0.003125;
            double m3 = m2 + 0.003125;
            double m4 = m3 + 0.003125;
            double m5 = m4 + 0.003125;
            double m6 = m5 + 0.003125;
            double m7 = m1 + m2 + m3 + m4 + m5 + m6;
            

           // double mm1 = m + m1;
            //double mm2 = m + m2;
           // double mm3 = m + m3;
           // double mm4 = m + m4;
           // double mm5 = m + m5;
           // double mm6 = m + m6;
           // double m7 = mm1 + mm2 + mm3 + mm4 + mm5 + mm6;

            System.out.println("Account value after the first 6 months is " + m7); 
            System.out.println("Account value after month 1 is " + m1);
            System.out.println("Account value after month 2 is " + m2);
            System.out.println("Account value after month 3 is " + m3);
            System.out.println("Account value after month 4 is " + m4); 
            System.out.println("Account value after month 5 is " + m5); 
            System.out.println("Account value after month 6 is " + m6); 

}
}
 
 
 


            
