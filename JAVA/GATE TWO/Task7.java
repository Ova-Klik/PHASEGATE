import java.util.Scanner;

public class Task7{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter 5 number to sum them: ");
         int sum=0;
        
        for(int index=1; index<=5; index++){
            
            System.out.printf("Kindly enter %d: ", index);
                int number = input.nextInt();
                sum+=number;
        
        }
        
         System.out.printf("The Sum of the Five numbers = %d%n", sum);
 }
 }
