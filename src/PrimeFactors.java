import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(factors(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();


    }

    public static boolean factors(int i) {
        for (int j=2; j < i; j++) {
            if (i%j == 0) {
                return false;
            }
        }
        return true;
    }
}