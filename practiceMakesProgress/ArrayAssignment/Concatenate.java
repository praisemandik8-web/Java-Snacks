public class Main {

    public static int[] concatenate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0;

        
        for (int num : a) {
            result[i] = num;
            i++;
        }

        
        for (int num : b) {
            result[i] = num;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] a = {a, b, c};
        int[] b = {4, 5, 6};

        int[] combined = concatenate(a, b);

        for (int num : combined) {
            System.out.print(num + " ");
        }
        
    }
}
