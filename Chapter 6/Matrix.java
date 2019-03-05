//Tanner Clements 02-28-2019

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int num = input.nextInt();
       
        printMatrix(num);

    }
        public static void printMatrix(int num){
            

            for(int col=0;num > col; col++){

            for(int row=0;num > row; row++){
                int rand = (int)(Math.random()*2);
                System.out.print(rand+" ");
                }
                System.out.println("");
            }
        }

      
}
