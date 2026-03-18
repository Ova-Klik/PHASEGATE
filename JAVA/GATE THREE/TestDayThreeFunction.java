import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestDayThreeFunction{
    
    DayThreeFunction array;
    
   @BeforeEach
   void setUp(){
   
        array = new DayThreeFunction();
    
   } 

   @Test
   public void testThatArrayLengthIncreasesToGivenLengthWithDefaultValuesInExtraPositions(){
   
        int [] numbers={10,11,12};
        int length=5;
        
        int []expected = array.modifyLengthOfAgivenArrayToSpecifiedLength(numbers,length);
        int []actual = {10,11,12,-1,-1};
        
        assertArrayEquals(expected,actual);
   }
   
   @Test
   public void testThatAnArrayOfGivenlengthReducesToSpecifiedLengthWithElementsInPosition(){
   
        int [] numbers={10,11,12,13,14};
        int length=2;
        
        int []expected = array.modifyLengthOfAgivenArrayToSpecifiedLength(numbers,length);
        int []actual = {10,11};
        
        assertArrayEquals(expected,actual);
   }
   
   @Test
   public void testThatAnEmptyArrayReturnsArrayOfLengthGivenWithMinus1FillingPositions(){
   
        int [] numbers={};
        int length=4;
        
        int []expected = array.modifyLengthOfAgivenArrayToSpecifiedLength(numbers,length);
        int []actual = {-1,-1,-1,-1};
        
        assertArrayEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsArrayGivenWhenSpecifiedLengthIsNegative(){
   
        int [] numbers={10,11,12,13,14};
        int length=-4;
        
        int []expected = array.modifyLengthOfAgivenArrayToSpecifiedLength(numbers,length);
        int []actual = {10,11,12,13,14};
        
        assertArrayEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsArrayGivenWhenSpecifiedLengthIsZero(){
   
        int [] numbers={10,11,12,13,14};
        int length=0;
        
        int []expected = array.modifyLengthOfAgivenArrayToSpecifiedLength(numbers,length);
        int []actual = {10,11,12,13,14};
        
        assertArrayEquals(expected,actual);
   }
}
