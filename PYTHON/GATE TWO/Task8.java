import java.util.Scanner;

public class Task8{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        int sum=0;
        System.out.println("Kindly enter numbers to get total sum (enter 0 to stop): ");
        
        System.out.printf("Kindly enter number");
        int number = input.nextInt();
        sum+=number;
        
        while(number!=0){
            System.out.printf("Kindly enter number");
            number = input.nextInt();
            sum+=number;
        
        }
        
        System.out.printf("You Stopped!! : Total = %d", sum);
         
 }
 }
