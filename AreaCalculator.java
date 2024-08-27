import java.util.Scanner;

public class AreaCalculator {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        Float base = scanner.nextFloat();
        System.out.print("Enter the height of the triangle : ");    
        Float height = scanner.nextFloat();
        Float triangle = (1/2F) * base * height;
        System.out.println("Area of the triangle : "+ triangle + " square units" );
        System.out.println("----------------------------");
        System.out.print("Enter the length  of the square : ");
        Float length = scanner.nextFloat();
        Float square = length * length ;
        System.out.println("Area of the square "+ square+" square units");











    }
}
