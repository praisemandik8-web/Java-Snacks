import java.util.Scanner;
public class CountVowels{

    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter a word");
    String word = inputCollector.nextLine();

    int count = 0;
        for(int i = 0; i<word.length(); i++){
        char ch = Character.toLowerCase(word.charAt(i));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
        count++;
        }
    System.out.println("Number of vowels is " + count);
    }
}
