import java.util.Scanner;
    public class VehicleSpeed {
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("speed in km/h ");
            int speed = inputLove.nextInt();

            if(speed >= 1 && speed <= 40){
            System.out.println("Vehicle is Stationary");
}
            if(speed >= 41 && speed <= 80 ){
            System.out.println("Moderate");
}
            if(speed >= 81 && speed <= 120){
            System.out.println("Dangerously fast!");
}


}
}
