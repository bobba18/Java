package learn.java;
//Not(Completed)
public class ReverseDigit$$$$NotCompleted {
    static int sum = 0;

    public static void reverseDigit(int digit) {
        if(digit == 0) {
            return;
        }
        int rem = digit % 10;
        sum = sum * 10 + rem;
        reverseDigit(digit/10);

    }

    public static void main(String[] args) {
        reverseDigit(1234);
        System.out.println(sum);
    }

}
