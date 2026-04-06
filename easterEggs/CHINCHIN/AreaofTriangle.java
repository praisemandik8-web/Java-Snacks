import java.util.Scanner;
    public class AreaofTriangle{
        public static void main(String[]args){
            Scanner inputLove = new Scanner(System.in);

            System.out.println("Enter Base");
            int base = inputLove.nextInt();

            System.out.println("Enter Height");
            int height = inputLove.nextInt();

            int area = base * height;
            System.out.println("Area of Triangle is " + area);
}
}

