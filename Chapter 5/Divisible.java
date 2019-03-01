//Tanner Clements 02-26-2019
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        System.out.println("Counting from 0 - 100");
        System.out.println("Divisible by 5 or 6, but not 5 and 6 ");
  
        int num=0;

        for(int dash=0; dash<38;dash++) {
            System.out.print("-");  
        }
        System.out.println(); 
        for(int count=0; count<=100; count++) {
            if((count % 5 == 0)^(count % 6 == 0)) {
                    System.out.print(count+" ");
                    num++;
            }
            if(num==10){
                System.out.println();
                num=0;
            }

        }
       
    }
}
