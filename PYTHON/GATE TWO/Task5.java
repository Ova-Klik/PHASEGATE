import java.util.Scanner;

public class Task5{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Kindly enter a number: ");
        int number = input.nextInt();
        int factorial=1;
     
        while(number>1){
            
            factorial*=number;
            number--;
            
        }
        
         System.out.printf("The factorial is %d%n factorial);
}}
