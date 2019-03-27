//Tanner Clements 03-26-2019

import java.util.Scanner;

public class guesscap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.print("Enter 10 numbers separated by a space: ");
        String[][] stateList ={
            {"TEXAS","AUSTIN"},
            {"UTAH","SALT LAKE CITY"},
            {"HAWAII","HONOLULU"},
            {"NEW YORK","ALBANY"},
            {"MISSOURI","JEFFERSON CITY"},
            {"IDAHO","BOISE"},
            {"OHIO","COLUMBUS"},
            {"GEORGIA","ATLANTA"},
            {"MASSACHUSETTS","BOSTON"},
            {"MONTANA","HELENA"}
        };

        
        int score=0;

        for(int row =0; row<=9; row++){
            System.out.print("What is the capital of :");
            System.out.println(stateList[row][0]);
            //TestLine - // System.out.print("Print test: "); System.out.println(stateList[row][0]+" "+stateList[row][1]);
            String Guess = input.nextLine();
            String UpperCase=Guess.toUpperCase();
            if(stateList[row][1].equals(UpperCase)){
                System.out.println("Your answer is correct!!!");
                score++;
            }else{
                System.out.println("Incorrect. The correct answer should be "+stateList[row][1]);
            }  
        }
        System.out.println("Your score is: "+score);  
    }
    //public static String[][] checkcap(String[][] a, String[][] b){
      // String.toUpperCase();
    //}

}        
