public class ArrayShar{
    public static void main(String[]args) {      
        char[][]TicTac = new char [3][3];
        
        TicTac[0][0]='x';
        TicTac[0][1]='o';
        TicTac[0][2]='x';

        TicTac[1][0]='o';
        TicTac[1][1]='o';
        TicTac[1][2]='o';

        TicTac[1][0]='x';
        TicTac[1][1]='x';
        TicTac[1][2]='o';

        System.out.println(TicTac);

     for(index = 0; index<TicTac.length; index++){
     for(position = 0; position<TicTac.length; postion++ )

      System.out.print([index, position, TicTac]);


        }
    }
}
