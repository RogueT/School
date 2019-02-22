//Tanner Clements -- 02-19-2019
import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Input value for x: ");
            double valx = input.nextDouble();
            
            System.out.print("Input value for y: ");
            double valy = input.nextDouble();

            // rect. center (0,0)
            // width 10 height 5

            if(valx<=(10/2) && valy<=(5.0/2) && valx>=(-10/2) && valy>=(-5.0/2)){

                System.out.println("Point ("+valx+", "+valy+") is in the rectangle");
            }
            else{
                System.out.println("Point ("+valx+", "+valy+") is not in the rectangle");
            }
            
    }

}
