import java.util.Scanner;


public class Task7{
    public static void main(String...args){
        
          final double PI = 3.142;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter radius of the Triangle: ");
        double radius = input.nextDouble();
        
        
        System.out.printf("%n\tThe circumference of the Circle is %.2f %n%n", 2 * PI * radius);
        
        
    }

    
}
