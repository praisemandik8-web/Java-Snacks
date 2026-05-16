import java.util.Scanner;
    public class ValidPin {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter 4 digit pin");
            int pin = inputLove.nextInt();

            if(pin >= 1000 && pin <= 9999){
            System.out.println("Valid Pin");
}
             else{
            //(pin < 1000 && pin > 9999)

            System.out.println("Invalid Pin");
}


}
}

            
