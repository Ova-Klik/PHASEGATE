import java.util.Scanner;

public class Task14{

    public static void main (String...args){
    
    Scanner input= new Scanner (System.in);
    
    System.out.print(" Kindly enter two numbers: ");
    double firstNumber =  input.nextDouble();
    double secondNumber =  input.nextDouble();
    
    if(firstNumber>secondNumber) System.out.printf("%.2f is Larger%n", firstNumber);
    else if(firstNumber<secondNumber) System.out.printf("%.2f is Larger%n", secondNumber);
    else System.out.printf("Numbers are Equal%n", secondNumber);
    }
}
