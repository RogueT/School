//Tanner Clements 02-28-2019

import java.util.Scanner;

public class ConvertML {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time in Milliseconds: ");
        long num = input.nextLong();
       
        
        System.out.print(convertMillis(num));
    }
        public static String convertMillis(long num){
            int seconds = (int) (num / 1000)%60;
            int minutes = (int) (num /(1000*60)%60);
            int hours = (int) ((num /(1000*60*60)));
            
              
        return (hours+":"+minutes+":"+seconds);
        
        }

      
}
