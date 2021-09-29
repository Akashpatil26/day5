import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a four digit number ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean result= checkleapyear(year);
        if (result)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
        public static boolean checkleapyear( int year){
            if(year%400==0)
                return true;
                if (year%100==0)
                    return false;
                    if (year %4==0)
                        return true;
                    return false;

            }

    }

