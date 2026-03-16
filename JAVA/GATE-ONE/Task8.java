import java.util.Scanner;


public class Task8{
    public static void main(String...args){
        
          final double PI = 3.142;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter a number to get the square: ");
        int number = input.nextInt();
        
        
        System.out.printf("%n\tThe Square of the number is %.2f %n%n", number * number);
        
        
    }

    
}
