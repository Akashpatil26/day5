import java.util.Scanner;

public class VowelConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if (alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u')
            System.out.println("It is a Vowel");
        else
            System.out.println("It is a Consonant");
    }
}
