package Mathamatics;

public class SumOfDigit {
    public static int digit(int n){
        int sum =0;
        while(n>0){
            int lastDigit= n%10;
            sum = sum+lastDigit;
            n=n/10;
        }
        return(sum);
    }
    
}
