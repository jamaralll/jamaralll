import java.util.*;
public class Age {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What year were you born?"); 
        int birth_year = sc.nextInt();
        String ty="thanks, you were born on ";
        System.out.println(ty  + birth_year);
        int age= function_calculate_age(birth_year);
        System.out.println("you are "+ age +" years old");


    }
    private static int function_calculate_age(int birth_year) {
        int current_year=2023;
        int age= current_year-birth_year;


        return age;
    }


};
