import java.util.*;
public class Age {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What year were you born?"); 
        int birth_year = sc.nextInt();
        System.out.println("What month were you born in?");
        int birth_month = sc.nextInt();
        System.out.println("What day were you born on?");
        int birth_day = sc.nextInt();

        String ty="thanks, you were born on ";
        System.out.println(ty  + birth_month + "/" + birth_day + "/" + birth_year);
    

        int age= function_calculate_age(birth_month, birth_day, birth_year);
        System.out.println("you are "+ age +" years old");


    }
    private static int function_calculate_age(int birth_month, int birth_day, int birth_year) {
        int current_year=2023;
        int age= current_year-birth_year;

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        month = month + 1;
        if (birth_month >= month && birth_day > day) {
            age = age - 1;

        }


        return age;
    }
//hhshshshs//

};
