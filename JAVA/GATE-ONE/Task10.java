import java.util.Scanner;


public class Task9{
    public static void main(String...args){
        
          final double PI = 3.142;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter three numbers to get their average: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        double average =  (number1 + number2 + number3)/3.0;
        System.out.printf("%n\tThe avarage  is %.2f%n%n", average);
        
        
    }

    
}
