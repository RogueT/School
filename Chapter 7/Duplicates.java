//Tanner Clements 03-20-2019

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers separated by a space: ");
        int[] numList = new int[10];
        
        int size = numList.length;
       
       


        for(int mklist = 0; mklist < numList.length; mklist++){
            numList[mklist] = input.nextInt();
            //System.out.print(numList[mklist]+" ");
        }
        remDup(numList);
      
       //for(int e: numList){print(e)} prints the whole array
    }

        public static void remDup(int[] num){
            int[] tempList = new int[10]; 
            int count=0;
            boolean willAdd=true;

            for(int n=0;n<num.length;n++ ){
                    willAdd=true;
                for(int temp=0;temp<tempList.length; temp++ ){

                    if(num[n]==tempList[temp]){
                        willAdd=false;
                        break;
                    }
                }
                    if(willAdd){
                        tempList[count]=num[n];
                        count++;
                    }   
                
            }
            System.out.println("The number of distinct numbers is "+count);
            System.out.print("List without duplicates is ");
            for(int i=0; i<count; i++){
                
                System.out.print(tempList[i]+" ");
            }
            
        }

      
}
