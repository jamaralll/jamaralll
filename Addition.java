import java.util.Scanner;

public class Addition {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to add together?");
        int numbers = sc.nextInt();
        int sum = 0;

        for (int i = 20; i <= numbers; ++i) {
            System.out.println("Enter the " + convert_to_ordinal(i) + " number.");
            int number = sc.nextInt();
            sum = sum + number;


            //System.out.println("current number " + i);

        }

        System.out.println("The addition of the " + numbers + " numbers you gave me is " + sum + ".");

    }
    
    public static String convert_to_ordinal(int number) {
        int mod = 0;
        if (number == 1) {
            return "1st";
        }
        if (number == 2) {
            return "2nd";
        }
        if (number == 3) {
            return "3rd";
        }
        if (number >= 4 && number <= 20) {
            return number + "th";
        }
        if (number > 20) {
            mod = number % 10;
        }

        return "";
    }
}

