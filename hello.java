package learn.java;

public class hello {
    public static void main(String[] args) {
//        System.out.println(Math.ceil((float) 10 / 3));
//        System.out.println(Phone(10, 3, 10));
        System.out.println(DivisorProblem(5));
    }
    static int DivisorProblem(int N){
    //Enter your code here
        int divisor = 0;
        for(int i = N - 1; i >= 1; i--) {
            if(N % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
//        int count = 0;
//        while(true) {
//            int divisor;
//            if(N % 2 == 0) {
//                divisor = N /2;
//            }
//        }
    }

}
