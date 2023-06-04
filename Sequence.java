import java.lang.*;

import javax.swing.plaf.synth.SynthStyle;
public class Sequence {
     public static void main(String []args) {
       /*  for (int i = 1 ; i <= 100 ; i = i + 2) {
            System.out.println(i);
        } */
// odd change i = 1 and then i=i+2
// even i= 0 then i=i+2
       //System.out.println("sequence 1 to 200");
        //print_sequence(200);
        //System.out.println("sequence to 250 increment by 5");
        //print_sequence(250 , '\0', 5);
        //System.out.println("sequence to 400 increment by 8 with a pipe delimeter");
        //print_sequence(400, '|', 8);
        fibonacci_sequence(10, 1,2);
    }

    public static void fibonacci_sequence(int top_limit , int first_number , int second_number){
        int last_number = second_number;
        int penultimate_number = first_number;
        int current_number = 0;
        System.out.println(first_number);
        System.out.println(second_number);
        for (int i = 0 ; i <= top_limit ; i++  ) {
            current_number = last_number + penultimate_number;
            System.out.println(current_number);
            penultimate_number = last_number;
            last_number = current_number;
            
        }
       


    }

    //Solution For Fibonnacci - More Elegant by Adi
   /*  public static void fibonacci_sequence(int top_limit){
        int current_number = 0;
        int penultimate_number = 0;
        int my_fibonacci = 0;
        System.out.println("---------- Starting Fibonnaci ----------");
        for (int i = 0 ; i <= top_limit ; i++  ) {
            my_fibonacci = current_number+penultimate_number;
            System.out.println("Current: "+current_number + " Penultimate: " + penultimate_number + " Fibonnacci: " + my_fibonacci);
            penultimate_number=current_number;
            current_number++;   
        }
        System.out.println("---------- Ending Fibonnaci ----------");



    }*/
    public static void print_sequence(int top_limit) {
        print_sequence(top_limit, Character.MIN_VALUE, 1);
    }

    public static void print_sequence(int top_limit, char delimiter, int increment){
        for (int i = 0 ; i <= top_limit ; i = i + increment) {
            if (i == 0 ) continue;
            if (Character.isDefined(delimiter) && (delimiter == '|' || delimiter == ',')){ 
                System.out.print(i); 
                if (i < top_limit) System.out.print(delimiter);
                
            } else {
                if (i % 2 == 0){
                    System.out.println(i + "*");
                } else { 
                    System.out.println(i);

                }
            }

            
        }

    }
}
