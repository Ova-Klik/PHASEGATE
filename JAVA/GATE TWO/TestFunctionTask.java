import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctionTask{


   @Test
   public void testThatFunctionReturnsSum(){
   
        int firstNumber=3;
        int secondNumber=5;
        
        int expected = FunctionTaskLevel4.getSum(firstNumber,secondNumber);
        int actual = 8;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsSumForNegativeNumbers(){
   
        int firstNumber=-3;
        int secondNumber=-5;
        
        int expected = FunctionTaskLevel4.getSum(firstNumber,secondNumber);
        int actual = -8;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsAccurateWhenNumberIsEven(){
   
        int number=2;
        
        boolean expected = FunctionTaskLevel4.checkEven(number);
        boolean actual = true;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsAccurateWhenNumberIsNotEven(){
   
        int number=3;
        
        boolean expected = FunctionTaskLevel4.checkEven(number);
        boolean actual = false;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsSquareOfAnIntegerNumber(){
   
        int number=3;
        
        int expected = FunctionTaskLevel4.getSquareOfAnumber(number);
        int actual = 9;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsSquareOfADoubleNumber(){
   
        double number=3;
        
        double expected = FunctionTaskLevel4.getSquareOfAnumber(number);
        double actual = 9.0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsSquareOfANegativeNumber(){
   
        int number=-3;
        
        int expected = FunctionTaskLevel4.getSquareOfAnumber(number);
        int actual = 9;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionConvertsCelciusToFahrenheit(){
   
        double number=20.0;
        
        double expected = FunctionTaskLevel4.getFahrenheit(number);
        double actual = 68.0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionConvertsNegativeNumberInCelciusToFahrenheit(){
   
        double number=-20.0;
        
        double expected = FunctionTaskLevel4.getFahrenheit(number);
        double actual = -4.0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatNumberIsPrime(){
   
        int number=13;
        
        boolean expected = FunctionTaskLevel4.getPrimeNumber(number);
        boolean actual = true;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatNumberIsNotPrime(){
   
        int number=1;
        
        boolean expected = FunctionTaskLevel4.getPrimeNumber(number);
        boolean actual = false;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsAccurateLargest(){
   
        int number1=4;
        int number2=7;
        int number3=4;
        
        int expected = FunctionTaskLevel4.getLargest(number1, number2, number3);
        int actual = 7;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsAccurateLargestForNegativeNumber(){
   
        int number1=-4;
        int number2=-7;
        int number3=-3;
        
        int expected = FunctionTaskLevel4.getLargest(number1, number2, number3);
        int actual = -3;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatSimpleInterestisAccurate(){
   
        double principal=10000.0;
        double rate = 0.5;
        double time = 2;
        double expected = FunctionTaskLevel4.getSimpleInterest(principal, rate,time);
        double actual = 100;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatPrincipalRateAndTimeCanNotBeNegative(){
        
        double principal=-10000.0;
        double rate = 0.5;
        double time = 2;
        double expected = FunctionTaskLevel4.getSimpleInterest(principal, rate, time);
        double actual = 0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatAreaOfRectangleIsEqual(){
        
     
        double expected = FunctionTaskLevel4.getAreaOfRectangle(3.5, 2.0);
        double actual = 7.0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatLengthOfRectangleCannotBeNegative(){
        
     
        double expected = FunctionTaskLevel4.getAreaOfRectangle(-3.5, 2.0);
        double actual = 0;
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFucnctionReturnsReverseOfNumber(){
        
     
        double expected = FunctionTaskLevel4.getReverseOfANumber(1234);
        double actual = 4321;
        
        assertEquals(expected,actual);
   }
   
   


}
