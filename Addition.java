import java.util.Scanner;

public class Addition {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add together?");
        int numbers = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= numbers; ++i) {
            System.out.println("Enter the " + convert_to_ordinal(i) + " number.");
            int number = sc.nextInt();
            sum = sum + number;


            //System.out.println("current number " + i);

        }

        System.out.println("The addition of the " + numbers + " numbers you gave me is " + sum + ".");

    }
    
    public static String convert_to_ordinal(int number) {
        int mod = 0;
        Mod modulus = new Mod();


        mod = modulus.mod(number, 10);
      
        if (mod == 1) {
            return number + "st";
        }
        if (mod == 2) {
            return number + "nd";
        }
        if (mod == 3) {
            return number + "rd";
        }
        if ((number >= 4 && number <= 20) || is_4to9and0(mod) ) {
            return number + "th";
        }
       return "Oh oh, unexpected condition!"; 

    }
    public static Boolean is_4to9and0(int mod) {
        return (mod == 4 || mod == 5 || mod == 6 || mod == 7 || mod == 8 || mod == 9 || mod == 0 );
    }
}

