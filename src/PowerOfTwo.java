import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int i=0,power2=1;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n= s.nextInt();
        while (i<=n){
            power2 = 2 * power2;
            i = i+1;
            System.out.println(i+" "+power2);
        }

    }
}
