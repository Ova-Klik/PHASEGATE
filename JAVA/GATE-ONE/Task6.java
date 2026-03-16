import java.util.Scanner;


public class Task6{
    public static void main(String...args){
    
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Kindly enter length of the Triangle: ");
        double length = input.nextDouble();
        
        System.out.printf("Kindly enter width of the Triangle: ");
        double width =  input.nextDouble();
  
        
        System.out.printf("%n\tThe Area of the Triangle is %.2f %n%n", length * width);
        
        
    }

    
}
