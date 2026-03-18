public class FunctionTaskLevel4{

    public static int getSum(int number1,int number2){

            return number1 + number2;
    
        }
        
        
    public static boolean checkEven(int number){
    
        if(number%2==0)return true;
        return false;

    }
    
    
    public static int getSquareOfAnumber(int number){
    
        return number * number;

    }
    
    public static double getSquareOfAnumber(double number){
    
        return number * number;

    }
    
    public static double getFahrenheit(double celcius){
    
        double fahrenheit = (celcius * 1.8) + 32;
         
        return fahrenheit;
    }
    
    public static boolean getPrimeNumber(int number){
    
         
         if(number==1)return false;   
          
         for(int divisor=2; divisor<number; divisor++ ){
         
            if(number%divisor==0){
            
                return false;
               
            }
         }
         return true;
        
    }
    
    public static int getLargest(int number1, int number2, int number3){
    
        int largest=number1;
        
        if(number2>largest)largest=number2;
        if(number3>largest)largest=number3;
         
        return largest; 
        
    }
    
    public static double getSimpleInterest(double principal, double rate, double time){
        
        if(principal<=0 || rate<=0 || time<=0) return 0;
        
        double simpleInterest = (principal*rate*time)/100;
         
        return simpleInterest; 
        
    }
    
    public static double getAreaOfRectangle(double length, double width){       
        if(length<=0)return 0;
        return length * width;
    
    }

    public static double getReverseOfANumber( int number){       
        
        int reverse = 0;
        while(number!=0){
        
           int newNumber=number%10;
            reverse= reverse*10 + newNumber;
            number/=10;
        }
        
        return reverse;
    }
    


}

