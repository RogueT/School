
public class Pentagon {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the length from the center to the vertex: ");
            double center = input.nextDouble();
            
            double sine = Math.sin(Math.PI / 5);
            double side = (2*center)*sine;
            
            double Area= (5*Math.pow(side, 2)/(4*Math.tan(Math.PI / 5)));
            System.out.printf("The Area of the pentagon is: %4.2f ",Area);
        
    }

}
