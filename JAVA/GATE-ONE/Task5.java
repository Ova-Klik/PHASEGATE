import java.util.Scanner;


public class Task5{
    public static void main(String...args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter temperature in Celcius: ");
        double degreeInCelcius = input.nextDouble();
        double degreeInFahreinheit =  degreeInCelcius * (9/5.0) + 32;
  
        
        System.out.printf("%n\tDegree in Fahreinheit is %.2f %n%n", degreeInFahreinheit);
        
        
    }

    
}
