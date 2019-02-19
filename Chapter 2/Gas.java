import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double dist = input.nextDouble(); //driving distance
        System.out.println("Enter miles per gallon: ");
        double mpg = input.nextDouble(); //miles per gallon
        System.out.println("Enter price per gallon: ");
        double ppg = input.nextDouble(); //price per gallon

        double gall = dist / mpg; //number of gallons needed
        double pric = ppg * gall; //calc. cost of trip


        System.out.printf("The cost of driving is $%4.2f",pric);
    }
}
