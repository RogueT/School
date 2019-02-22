//Tanner Clements -- 02-19-2019
import java.util.Scanner;

public class Edges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Compute the perimeter of a triangle");
        System.out.print("Input length for the first side : ");
        double side1 = input.nextDouble();
        
        System.out.print("Input length for the second side : ");
        double side2 = input.nextDouble();

        System.out.print("Input length for the third side : ");
        double side3 = input.nextDouble();

       double perm = side1+side2+side3;
       
       double comb1 = side1+side2;
       double comb2 = side1+side3;
       double comb3 = side2+side3;

        if(comb1>side3 && comb2>side2 && comb3>side1) {
            System.out.println("Triangle is valid and perimeter is "+perm);
        }
        else { 
            System.out.println("Triangle is invalid");
        }
    }
}
