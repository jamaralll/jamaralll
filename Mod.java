import java.text.DecimalFormat;
import java.util.Scanner;

public class Mod {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first operand.");
        int first_operand = sc.nextInt();
        System.out.println("Insert the second operand.");
        int second_operand = sc.nextInt();
        
        int remainder = mod(first_operand, second_operand);
        //DecimalFormat df = new DecimalFormat("###.####");

        System.out.println("The result equals " + remainder);

    }

    public static int mod(int first_operand, int second_operand) {
        int result = first_operand / second_operand;
        int remainder = first_operand - (result * second_operand);


        return remainder;
    }

}
