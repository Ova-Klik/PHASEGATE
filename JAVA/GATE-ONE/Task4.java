import java.util.Scanner;


public class Task4{
    public static void main(String...args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter first number: ");
        int number1 = input.nextInt();
        System.out.printf("Kindly enter second number: ");
        int number2 = input.nextInt();
        
        System.out.printf("%n\tProduct is %d %n%n", number1 * number2);
        
        
    }

    
}
