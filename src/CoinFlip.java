import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int heads=0, tails=0 ,i;
        double headcount , tailcount;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of times you want to flip the coin ");
        int number=scanner.nextInt();

        for (i=0; i<number;i++) {
            double random=Math.random();
            if (random < 0.5)
                heads++;
            else
                tails++;
        }

        headcount=heads / (double) number *100;
        tailcount=tails / (double) number *100;
        System.out.println("Heads Percentage "+headcount);
        System.out.println("Tails Percentage "+tailcount);
        }
    }

