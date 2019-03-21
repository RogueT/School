//Tanner Clements 03-20-2019

import java.util.Scanner;

public class Locker {
    public static void main(String[] args) {
        
        boolean[] lockerList = new boolean[100];

        for(int S2=1; S2 <= lockerList.length; S2++){
            for(int S3 = S2; S3 <= lockerList.length; S3 = S3+S2){
                lockerList[S3-1]=!lockerList[S3-1];
            }
        }

        System.out.println("These Lockers are still open: ");
        for(int prnt=0; prnt < lockerList.length; prnt++){
            if(lockerList[prnt]){
                System.out.print("L"+(prnt+1)+" ");
            }
        }
        
    }
      
}
