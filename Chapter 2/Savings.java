import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Monthly Savings Amount ");
        double sav = input.nextDouble();
        double mint = (1 + (.05/12));
        double month = 0;
        double sum = 0;

        //double up = out + sum;

        do {
            
          double up = sum + sav;
           double out = up * mint;
           
           sum = out;
            month++;
            System.out.printf("Monthly amount after "+month+" $%4.3f ",+ out);
             System.out.println(" ");
        } while (month <=5);


       
    }
}
