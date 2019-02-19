import java.util.Scanner;

public class ConvertCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius ");
        double cel = input.nextDouble();
        double fah = ((9.0 / 5) * cel + 32);
        System.out.println("The temperature in Fahrenheit is " + fah);
    }
}
