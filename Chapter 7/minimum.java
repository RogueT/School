//Tanner Clements 03-20-2019

import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers separated by a space: ");
        double[] numList = new double[10];
       
        for(int mklist = 0; mklist < numList.length; mklist++){
            numList[mklist] = input.nextDouble();
        }

        
        System.out.println("The minimum number is "+minNum(numList));
    }
        public static double minNum(double[] num){
                     
            double min= num[num.length-1];
  
            for(int count=0;count<num.length;count++ ){
                if(num[count]<min){
                    min=num[count];  
                } 
            }return min;
            
            }
            
        }
