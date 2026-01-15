import java.util.Scanner;
import java.util.*;

public class emailchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email Address:- ");
        String email = sc.nextLine();

        if(IsValidEmail(email)){
            System.out.println("Your Email Address is Valid");
        }
        else{
            System.out.println("Your Email Address is not Valid");
        }

    }


    public static boolean IsValidEmail(String email) {
        int i =0;
        int count1=0;
        int count2=0;
        int validcount =4;


        //for loop for checking for only one symbol!!
        for(i=email.length()-1;i>=0;i--){
            if(email.charAt(i)=='@'){
                count1++;
            }
            if(email.charAt(i)=='.'){
                count2++;
            }
            if(email.charAt(i)==' ')
            {
                return false;
            }
        }
        if(count1!=1 && count2!=1){
            validcount--;
        }
        if(email.charAt(0)=='.' || email.charAt(email.length()-1)=='.')
        {
            validcount--;
        }

        if(email.charAt(0)=='@' || email.charAt(email.length()-1)=='@')
            {
            validcount--;
            }

        if(email.indexOf('@')>email.indexOf('.')){
            validcount--;
        }

        if(validcount==4){
            return true;
        }
        else
            return false;



    }
}