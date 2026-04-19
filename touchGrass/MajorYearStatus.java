import java.util.Scanner;
    public class MajorYearStatus{
        public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        
        String i = "informationManagement" ;
        String c = "ComputerScience" ;
        String a = "Accounting" ;

        System.out.println("Enter student's major");
        System.out.println("i= information Management, C= Computer Science, A= Accounting");
        String StudentMajor = inputCollector.nextLine();

        if(StudentMajor== i){
        System.out.println("Information Management");
}
        if(StudentMajor== c){
        System.out.println("Computer Science");
}    
        if(StudentMajor== a){
        System.out.println("Accounting");
}
         System.out.println(StudentMajor);

        System.out.println("Enter student's year(1-4)");
        System.out.println("1= Freshman, 2= Sophmore, 3= Junior, 4= Senior");
        int StudentYear = inputCollector.nextInt();
        if(StudentYear== 1){
        System.out.println("Freshman");
}
        if(StudentYear== 2){
        System.out.println("Sophmore");
}    
        if(StudentYear== 3){
        System.out.println("Junior");
}
        if(StudentYear== 4){
        System.out.println("Senior");
}      
    System.out.println(StudentMajor + StudentYear);  
}
}
