import java.util.Scanner;


public class Task2{
    public static void main(String...args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Kindly enter your age: ");
        int age = input.nextInt();
        
        System.out.printf("%n\tYou will be  %dyears old in next 5 years (you are getting old soon)%n%n", age+5);
        
        
    }

    
}
