import java.util.Scanner;

public class Task15{

    public static void main (String...args){
    
    Scanner input= new Scanner (System.in);
    
    System.out.println(" Kindly enter three numbers: ");
    double firstNumber =  input.nextDouble();
    double secondNumber =  input.nextDouble();
    double thirdNumber =  input.nextDouble();
    
    int [] numbers = {firstNumber,secondNumber,thirdNumber};    
   
   for(int index=0; index<numbers.length;index++){
   
            double largest =  numbers[0];
            
            if(numbers[index]>largest)largest= numbers[index];
   
   }
   
   System.out.printf("The Largest number is : largest", );
    }
}
