public static int sumWhile(int[] arr) {
    int sum = 0;
    int i = 0;

    while (i < arr.length) {
        sum += arr[i];
        i++;
    }

    return sum;
}
