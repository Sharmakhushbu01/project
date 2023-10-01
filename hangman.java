import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class
        ArrayList<String> list = new ArrayList<>();// arraylist class

        String name[] ={"aradhya","cheshta","shruti","shrishti","avadhi","khushbu"};// random string generator
        Random obj = new Random();
        int random = obj.nextInt(name.length);
        String guess_name = name[random];



        for (int i = 0 ; i<guess_name.length();i++)  // print arraylist
        {
            list.add("_");
        }
        System.out.println(list);


        for (int j=0;j<guess_name.length()+10; j++)  // this program replace the "_" with guess_character
        {
            System.out.println("enter thr character");
            String guess_character = sc.next();
            if (guess_name.contains(guess_character))
            {
                System.out.println("correct");
                           for (int k=0;k<guess_name.length();k++) // this program is solve the issue "occurance of similar character"
                           {
                               if (guess_name.charAt(k)==guess_character.charAt(0))
                               {
                                   list.set(k,guess_character);
                               }

                           }

                System.out.println(list); // print replaced arraylist
            }
            else
            {
                System.out.println("incorrect");
            }
            if (list.contains("_"))
            {

            }
            else {
                System.out.println("you win");
                break;
            }

        }



    }}
