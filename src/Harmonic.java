import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        double hvalue = scanner.nextDouble();
        double Result = nHarmonic(hvalue);
        if(hvalue>0)
            System.out.println("Harmonic value is "+Result);
        else
            System.out.println("Number should be greater than 0");



    }
    public static double nHarmonic(double hvalue){
        double value =0;
        for (int i=1;i<hvalue;i++){
            value = value + (double)1/i;
        }
        return value;
    }
}
