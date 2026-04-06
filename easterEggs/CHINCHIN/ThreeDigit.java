import java.util.Scanner;
    public class ThreeDigit{
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("enter number");
            int num = inputLove.nextInt();
           

            if (num > 99 && num < 1000){
            System.out.println("number is a 3 digit number");
}
            //if (num <= 99 && num >= 1000) {
            //System.out.println("not a 3 digit number");
//}
            else {
            System.out.println("not a 3 digit number");
}

}
}
