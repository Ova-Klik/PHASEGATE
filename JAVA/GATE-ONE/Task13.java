import java.util.Scanner;

public class Task13{

    public static void main (String...args){
    
    Scanner input= new Scanner (System.in);
    
    System.out.print(" Kindly enter a score: ");
    double score =  input.nextDouble();
    
    if(score>=50) System.out.printf("You passed CONGRATULATIONS!!%n");
    else System.out.printf("You Failed, TRY AGAIN%n");
        
    }
}
