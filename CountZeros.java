package learn.java;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZero(30530402));
    }

    public static int countZero(int n) {
        return helper(n,0);
    }

    public static int helper(int n,int count) {
        if(n == 0) {
            return count;
        }
        int rem = n % 10;
        if(rem == 0) {
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
