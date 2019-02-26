//Tanner Clements 02-21-2019
import java.util.Scanner;
public class DaysofMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();
        
        String month1 = "Jan";
        String month2 = "Feb"; 
        String month3 = "Mar";
        String month4 = "Apl";
        String month5 = "May";
        String month6 = "Jun";
        String month7 = "Jul";
        String month8 = "Aug";
        String month9 = "Sep";
        String month10 = "Oct";
        String month11 = "Nov";
        String month12 = "Dec";
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    

        //January
        if(month.equals(month1)){
            int days = 31;
            System.out.print(month1+" "+year+" has "+days+" days");
        }
        //February
        if(month.equals(month2)){
                if(isLeapYear){
                    int days = 29;
                    System.out.print(month2+" "+year+" has "+days+" days");
                }else{
                    int days = 28;
                    System.out.print(month2+" "+year+" has "+days+" days");
                }
        }
        //March
        if(month.equals(month3)){
            int days = 31;
            System.out.print(month3+" "+year+" has "+days+" days");
        }
        //April
        if(month.equals(month4)){
            int days = 30;
            System.out.print(month4+" "+year+" has "+days+" days");
        }
        //May
        if(month.equals(month5)){
            int days = 31;
            System.out.print(month5+" "+year+" has "+days+" days");
        }
        //June
        if(month.equals(month6)){
            int days = 30;
            System.out.print(month6+" "+year+" has "+days+" days");
        }
        //July
        if(month.equals(month7)){
            int days = 31;
            System.out.print(month7+" "+year+" has "+days+" days");
        }
        //August
        if(month.equals(month8)){
            int days = 31;
            System.out.print(month8+" "+year+" has "+days+" days");
        }
        //September
        if(month.equals(month9)){
            int days = 30;System.out.print(month9+" "+year+" has "+days+" days");
        }
        //October
        if(month.equals(month10)){
            int days = 31;
            System.out.print(month10+" "+year+" has "+days+" days");
        }
        //November
        if(month.equals(month11)){
            int days = 30;
            System.out.print(month11+" "+year+" has "+days+" days");
        }
        //December
        if(month.equals(month12)){
            int days = 31;
            System.out.print(month12+" "+year+" has "+days+" days");
        }

    }

}
