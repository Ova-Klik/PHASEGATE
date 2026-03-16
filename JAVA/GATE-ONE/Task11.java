import java.util.Scanner;

public class Task11{

    public static void main (String...args){
    
    Scanner input= new Scanner (System.in);
    
    System.out.print(" Kindly enter a number: ");
    int number =  input.nextInt();
    
    if(number%2==0) System.out.printf("The number %d is even%n", number);
    else System.out.printf("The number %d is odd%n", number);
        
    }
}
