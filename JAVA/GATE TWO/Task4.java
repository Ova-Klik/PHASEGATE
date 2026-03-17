import java.util.Scanner;

public class Task4{

    public static void main(String...args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Kindly enter a number to get it's multiplication Table: ");
        int number = input.nextInt();
        
        System.out.printf("The Time Table for %d:", number);
        
        for(int index=1; index<=12; index++){
        
            System.out.printf("%d x %d = %d%n", number, index, number * index );
        }
        
        
//        for(int row =1; row<=5; row++){
//        
//               for(int column=1; column<=number; column++){
//               
//                System.out.print(column * row + "  ");
//               }
//            System.out.println();
//        }

        
        
}}
