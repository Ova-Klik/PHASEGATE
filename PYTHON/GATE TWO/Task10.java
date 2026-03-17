import java.util.Scanner;

public class Task10{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        System.out.print("Kindly enter number: ");
        int number = input.nextInt();
        int count=0;
        
        while(number>0){
        
            int newNumber=number%10;
            number=number/10;
            count++;
        }
        
         System.out.printf("There are %d digits in the number%n", count);
 }
 }
