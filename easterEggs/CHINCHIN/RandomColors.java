public class RandomColors{
    public static void main (String [] args){
        SecureRandom randomNumbers = new SecureRandom();
        int randNum = 1 + randomNumbers.nextInt(6);

        System.out.println(randNum);
}
}
