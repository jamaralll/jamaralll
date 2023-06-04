import java.util.Scanner;

public class Strings {
  public static void main(String []args){
   if(args.length == 2){
    Compare_strings(args[0], args[1]);
   }else if(args.length == 0){
    // Names_exercises();
    String str1 = new String("hello");
    String str2 = new String("Hello");
    Compare_strings(str1, str2);
   }
    
    

  }
  public static void Names_exercises() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your first name.");
    String first = sc.nextLine();
    System.out.println("Please enter your last name.");
    String last = sc.nextLine();
    // System.out.println("Your full name is " + first.concat((" ").concat(last)));
    System.out.println("Your full name is " + first + " " + last);
    System.out.println("The length of your first name is " + first.length());
    System.out.println("The length of your last name is " + last.length());
    System.out.println("Your initials are: " + first.toUpperCase().charAt(0) + last.toUpperCase().charAt(0)) ;
  }
  public static void Compare_strings(String string_one , String string_two) {
    if(string_one.toLowerCase().equals(string_two.toLowerCase())){
        System.out.println(" The strings are equal");
    }

}
}


