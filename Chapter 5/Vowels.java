//Tanner Clements 02-28-2019
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        phrase = phrase.toUpperCase();

        int vowels = 0;
        int con = 0;

        for(int count = 0; count<phrase.length(); count++){
            char comp =phrase.charAt(count);
            if(comp == 'A'||comp == 'E'||comp == 'I'||comp == 'O'||comp == 'U'){
                vowels++;
            }else{
                con++;
            }

        }
        
        System.out.println("Number of Vowels: "+vowels);
        System.out.println("Number of Consonants: "+con);
    
    }
       
}

