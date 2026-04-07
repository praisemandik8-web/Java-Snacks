import java.util.Scanner;
    public class BMIweight{
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter weight in kg");
            int weight = inputLove.nextInt();

            System.out.println("Enter height in meters");
            int height = inputLove.nextInt();

            double height1 = height * height; 
            double bmi = weight/height1;
            System.out.println("your BMI is" + bmi);

            if(bmi < 18.5){
            System.out.println("You are underweight");
}
            if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your weight is normal");
}
            if(bmi == 35 && bmi <= 29.9){
            System.out.println("You are overweight");
}
            if(bmi >= 30){
            System.out.println("You are underweight");
}



}
}
