//Tanner Clements 03-04-2019

import java.util.Scanner;

public class Width {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        System.out.print("Enter the numbers width: ");
        int width = input.nextInt();
        
        System.out.print(format(num, width));
        System.out.println(" ");
    }
        public static String format(int num, int width){
            String number = num+"";
            if(number.length()<width){
                for(int zero = width - number.length(); zero > 0; zero--){
                    number=0+number;
                }
            }
            
              
        return number;
        
        }

      
}
