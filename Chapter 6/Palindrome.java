//Tanner Clements 02-28-2019

// Return the reversal of an integer, i.e., reverse(456) returns 654
// Return true if number is a palindrome
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole integer: ");
        int number = input.nextInt();
       
        System.out.println("The reversal of the integer is "+reverse(number));

        System.out.println("Number is a Palindrome "+isPalindrome(number));
    }
        public static int reverse(int number){
            int out = 0;
            for(;number != 0; number /=10){
                int dig=number % 10;
                out = out * 10 + dig;
            }
        return out;
        }

        public static boolean isPalindrome(int number){
            int n=reverse(number);
            if(number == n){
                return true;
            }else{
                return false;
            }
        }  
}
