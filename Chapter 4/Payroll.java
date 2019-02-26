//Tanner Clements -- 02-25-2019
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked: ");
        double hours = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double fedtax = input.nextDouble();

        System.out.print("Enter state tas withholding rate: ");
        double statetax = input.nextDouble();

        double gross = pay * hours;

        System.out.println("Employee Name: "+name);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Pay Rate: "+pay);
        System.out.println("Gross Pay: "+gross);
        System.out.println("Dedcutions: ");
        double Fedwit = gross*fedtax;
        double Fedint = (fedtax*100)/100.0;
        System.out.printf("        Federal Withholding: ( %%%4.1f ): $%4.2f\n",Fedint,Fedwit);
        double Statewit = gross*statetax;
        double Stateint = (statetax*100)/100.0;
        System.out.printf("        State Withholding ( %%%4.1f ): $%4.2f\n",Stateint,Statewit);
        double Deduc = Fedwit+Statewit;
        System.out.printf("        Total Deduction: $%4.2f\n",Deduc);
        double netpay = gross-Deduc;
        System.out.printf("Net Pay: $%4.2f\n",netpay);

        

        
    }
}
