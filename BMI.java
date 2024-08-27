import java.util.Scanner;

public class BMI {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms : ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in meters : ");
        float height = scanner.nextFloat(); 
        double BMI = weight/( height* height);
        System.out.println("Your BMI for weight = "+weight+"Kg."+"and height = "+height+"meters is :" + BMI+" bmi.");











    
    }
}
