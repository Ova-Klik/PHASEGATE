import java.util.Scanner;

public class Task6{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Kindly enter a number: ");
        int number = input.nextInt();
        int sum=0;
        
        for(int index=1; index<=number; index++){
        
           sum+=index;
        }
        
         System.out.printf("The Sum of numbers in 1 to %d = %d%n", number, sum);
 }
 }
