import java.util.Scanner;


public class Task9{
    public static void main(String...args){
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter a price to get the 10%% TAX: ");
        double price = input.nextDouble();
        double percentageTax= 10/100.0;
        double tenPercentDiscoutTax = (price * percentageTax) + price;
        
        System.out.printf("%n\tThe Square of the number is %.2f%n%n", tenPercentDiscoutTax);
        
        
    }

    
}
