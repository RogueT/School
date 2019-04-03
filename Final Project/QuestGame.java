//Tanner Clements 03-29-2019
/* The Networking Tutor Game is a program that asks the user a series of multiple 
choice questions. The program will either grant or deduct game points based on 
whether the answer is correct or not. When questions are answered correctly the first 
time full points are granted. If the question is answered incorrectly the correct answer is 
displayed and no points are granted. The questions that are incorrectly answered are 
put back in the pool of questions for a second attempt. If answered correctly on the 
second attempt a low point value is rewarded. If the user answers incorrectly on the 
second attempt points are deducted. */


import java.util.Scanner;

public class QuestGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Questions array
        String[][] questList ={
    /* 1 */ {"Which sets of connectors are used for twisted pair cabling? ", 
                "A"," RJ11 and RJ45 \n",
                "B"," RJ11 and F Type \n",
                "C"," SC and ST \n",
                "D"," BNC and RJ45 \n"," RJ11 and RJ45 \n"},
    /* 2 */ {"Which of the following transport layer protocol is used to support electronic mail? ",
                "A"," SMTP \n",
                "B"," IP \n",
                "C"," TCP \n",
                "D"," UDP \n"," TCP \n"}, 
    /* 3 */ {"When signals are free to travel in both directions over a medium simultaneously, the transmission is considered______. ",
                "A"," File-Sharing \n",
                "B"," Full-Duplex \n",
                "C"," Peer-to-Peer \n",
                "D"," Cable Plant \n"," Full-Duplex \n"}, 
    /* 4 */ {"How many layers are there in the Network Model? ",
                "A"," 6 \n",
                "B"," 5 \n",
                "C"," 8 \n",
                "D"," 7 \n"," 7 \n"},
    /* 5 */ {"In terms of communications across a network, What does ATM stand for?",
                "A"," Automatic Transferral of Multiplex \n",
                "B"," Automated Teller Machine \n",
                "C"," Asynchronous Transfer Mode \n",
                "D"," At The Moment \n"," Asynchronous Transfer Mode \n"},
    /* 6 */ {"What huge San Jose based company is considered the king of networks? ",
                "A"," STECH \n",
                "B"," Cisco \n",
                "C"," IBM \n",
                "D"," Symtec \n"," Cisco \n"},
    /* 7 */ {"Which is the following is usually the largest? ",
                "A"," MAN \n",
                "B"," School Wifi \n",
                "C"," LAN \n",
                "D"," WAN \n"," WAN \n"},
    /* 8 */ {"When performing error checking over a sequence of bits, which bit is used to locate the error? ",
                "A"," Pretty bit \n",
                "B"," Qubert \n",
                "C"," Parity bit \n",
                "D"," Gigabit \n"," Parity bit \n"},
    /* 9 */ {"What is the difference between an RG-8 and a RG-59 coaxial cable? ",
                "A"," RG-59 is edible \n",
                "B"," RG-8 is also called Thin Net \n",
                "C"," RG-59 is more expensive \n",
                "D"," RG-8 has a larger copper core \n"," RG-8 has a larger copper core \n"},
    /* 10 */ {"What type of connector is used in a 10base2 network? ",
                "A"," BNC \n",
                "B"," RJ-11 \n",
                "C"," BAMF Type \n",
                "D"," RJ-45 \n"," BNC \n"},
        };

        String[][] repeat1List = new String[10][10];
        String[][] repeat2List = new String[10][10];

        System.out.println("Welcome to the Networking Question Games");
        System.out.println("Enter your name to begin: ");        
        String Name = input.nextLine();

        int score=0;
        int wrong1=0;
        int wrong2=0;

        //print array which is questions
        for(int i=0; i<10; i++){
            System.out.println(questList[i][0]);
            for(int j=1; j<9; j++){
                
                System.out.print(questList[i][j]);
                //System.out.print(" ");

                //Once questions and all choices printed ask for input and check correctness
                if(j==8){
                    System.out.print("Enter your answer: ");
                    System.out.print(" ");
                
                   String Guess = input.nextLine();
                   String UpperCase=Guess.toUpperCase();
                    
                   boolean wrong=false;
                   int chAN=2; //chAN+=2; add to bottom
                for(int chIN=1; chIN<9; chIN+=2){
                        
                   if(questList[i][chIN].equals(UpperCase) && questList[i][chAN].equals(questList[i][9])){
                        System.out.println("Your answer is correct!!!");
                        System.out.println();
                        score=score+10;
                        wrong=true;
                    }
                    chAN+=2;      
                }
                if(!wrong){
                    System.out.println("Incorrect. The correct answer should be "+questList[i][9]);
                      //System.out.print(wrong1);
                      for(int k=0; k<10; k++){
                        repeat1List[wrong1][k]=questList[i][k];
                        //System.out.print(repeat1List[i][k]);
                      }
                    wrong1++;
                    } 
                }
                }          
            }
        
        //Questions answered wrong after 1st attempt- going through questions again a 2nd time
        for(int i=0; i<wrong1; i++){
            System.out.println(repeat1List[i][0]);
            for(int k=1; k<9; k++){
                //if(k==1){System.out.println();};
                System.out.print(repeat1List[i][k]);
                //System.out.print(" ");

                if(k==8){
                    System.out.print("Enter your answer: ");
                    System.out.print(" ");
                
                   String Guess = input.nextLine();
                   String UpperCase=Guess.toUpperCase();
                    
                   boolean wrong=false;
                   int chAN=2;
                for(int chIN=1; chIN<9; chIN+=2){

                   if(repeat1List[i][chIN].equals(UpperCase) && repeat1List[i][chAN].equals(repeat1List[i][9])){
                      System.out.println("Your answer is correct!!!");
                      System.out.println();
                      score=score+5;
                      wrong=true;
                    }
                    chAN+=2;
                }                  
                    if(!wrong){
                        System.out.println("Incorrect. The correct answer should be:"+repeat1List[i][9]);
                        score=score-5;
                        for(int p=0; p<10; p++){
                            //System.out.println(wrong2);
                        repeat2List[wrong2][p]=repeat1List[i][p];
                             //System.out.print(repeat2List[wrong2][p]);
                        
                        }
                        wrong2++;  
                    }  
                
                    
                }
                }
            }   
        
        //Questions answered wrong after 2nd attempt- going through questions again a 3nd time
        for(int i=0; i<wrong2; i++){
            System.out.println(repeat2List[i][0]);
            for(int k=1; k<9; k++){
                //if(k==1){System.out.println();};
                System.out.print(repeat2List[i][k]);
                //System.out.print(" ");

                if(k==8){
                    System.out.print("Enter your answer: ");
                    System.out.print(" ");
                
                   String Guess=input.nextLine();
                   String UpperCase=Guess.toUpperCase();
                    
                   boolean wrong=false;
                   int chAN=2; //chAN+=2; add to bottom
                for(int chIN=1; chIN<9; chIN+=2){

                   if(repeat2List[i][chIN].equals(UpperCase) && repeat2List[i][chAN].equals(repeat2List[i][9])){
                     
                      System.out.println("Your answer is correct!!!");
                      System.out.println();
                      wrong=true;
                    }
                    chAN+=2; 
                }
                        
                    if(!wrong){
                        score=score-10;
                        System.out.println("Incorrect. The correct answer should be:"+repeat2List[i][2]);
                    }
                
              
                }
            }
        }
        //public static void playGame(questList [])     
        System.out.println(Name+" Your Total Score: "+score);
        if(score==100){System.out.print(" Perfect Score!!!");}  
    }
}
