//Tanner Clements 02-28-2019

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = input.nextInt();
        
        
        for(int row=1;row <= line; row++) {
           
            for(int space=1; space<=line-row;space++){
                System.out.print("   ");
            }
            for(int back=row; back>=1;back--){
                System.out.printf("%3d",back); 
            }
            for(int num=2; num<=row;num++){
                System.out.printf("%3d",num);                 
            }
            System.out.println("");    
        }
    }
}
