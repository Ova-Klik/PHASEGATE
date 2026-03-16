import java.util.Scanner;

public class Task12{

    public static void main (String...args){
    
    Scanner input= new Scanner (System.in);
    
    System.out.print(" Kindly enter a number: ");
    int number =  input.nextInt();
    
    if(number<0) System.out.printf("The number %d is negative%n", number);
    else System.out.printf("The number %d is positive%n", number);
        
    }
}
