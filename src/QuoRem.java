import java.util.Scanner;

public class QuoRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be divided");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor");
        int divisor = sc.nextInt();

        int quotient = dividend/divisor;
        int remaindr = dividend%divisor;
        System.out.println("Quotient"+quotient+ " ,Remainder"+ remaindr);
    }
}
