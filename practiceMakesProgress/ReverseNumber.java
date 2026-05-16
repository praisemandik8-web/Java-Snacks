public static int ReverseNumber(int num) {
    int reversed = 0;
    
    while (num != 0) {
        int digit = num % 10;        // get last digit
        reversed = reversed * 10 + digit;  // add it to reversed number
        num = num / 10;              // remove last digit
    }
    
    return reversed;
}

public static void main(String[]args){
int n = 1234;
System.out.println(ReverseNumber(n));
}
