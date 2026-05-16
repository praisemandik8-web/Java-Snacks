public class PatternLoop{
    public static void main(String[]args){

    int number = 5;

    for (int mainLoop = 1; mainLoop <= number; mainLoop++){
        for (int countdown = mainLoop; countdown> 0; countdown--)
            System.out.print(countdown);

        for (int countdown = (2 * number); countdown > (2 * mainLoop); countdown --)
            System.out.print(" ");
        for (int countdown = 1; countdown <= mainLoop; countdown++)
            System.out.print(countdown);
            System.out.println();
}
        
}


}


