import java.util.Scanner;
    public class KeypadNumbers{
        public static void main(String[]args){
        Scanner inputLove = new Scanner(System.in);
        
      
        System.out.println("press below buttons to access keypad letters");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");

     int UserInput= inputLove.nextInt();
    
        switch(UserInput) {
        case 1: 
        System.out.println("");


        break;

      case 2: 
        System.out.println("abc");


        break;

       case 3: 
        System.out.println("def");

        break;

        case 4: 
        System.out.println("ghi");


        break;

          case 5: 
        System.out.println("jkl");


        break;

      case 6: 
        System.out.println("mno");


        break;
      
        case 7: 
        System.out.println("pqrs");


        break;

        case 8: 
        System.out.println("tuv");


        break;
        
        case 9: 
        System.out.println("wxyz");


        break;
}
}
}
