public class PentagonNumbers {

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            System.out.printf("%7d", getPentagonalNumber(num));
            if (num % 10 == 0) {
                System.out.println();
            }
        }



    }




}
