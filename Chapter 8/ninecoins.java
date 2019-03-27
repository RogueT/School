//Tanner Clements 03-26-2019

import java.util.Scanner;

public class ninecoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        int[] feed = matrix(number);
        display(feed);
 
    }

        public static int[] matrix(int binary){
            
            int[] grid = new int[9]; 

            for(int i =grid.length-1; i>=0 && binary>0; i--){
                if (binary%2==0){
                    grid[i]=0;
                }else{
                    grid[i]=1;
                }
                binary = binary/2;
            }return grid;
        } 

        public static void display(int[] grid){

            for(int i =0; i<9; i++){
                if (grid[i]==0){
                    System.out.print("H ");
                }else{
                    System.out.print("T ");
                }
                if((i+1)%3==0){
                    System.out.println("");
                }
            }
        }
    }        
