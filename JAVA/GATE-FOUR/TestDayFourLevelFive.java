
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestDayFourLevelFive{

    DayFourLevelFive array;
    
    @BeforeEach
    void setUp(){
    
        array = new DayFourLevelFive();
    }
    
    @Test
    public void testThatArrayFunctionReturnsSortedArrayOfPrimeNumbers(){
    
        int[]numbers = {5,9,3,6,2};
        int[]expected = array.getSortedPrimeNumbers(numbers);
        int[]actual = {5,3,2};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayFunctionReplacesAllNegativeNumbersInAGivenArrayWithZero(){
    
        int[]numbers = {5,-9,3,-6,2,-11};
        int[]expected = array.replaceNegativeElementsWithZero(numbers);
        int[]actual = {5,0,3,0,2,0};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayFunctionMovesAllZeroElementToEndOfArray(){
    
        int[]numbers = {5,0,3,0,2,0};
        int[]expected = array.moveZeroElementsToEndOfArray(numbers);
        int[]actual = {5,3,2,0,0,0};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayFunctionReturnsCommonElementInAnArray(){
    
        int[]numbers = {45,60,3,0,67,2,45,3,22,0};
        int[]expected = array.getCommonElements(numbers);
        int[]actual = {45,3,0};
        
        assertArrayEquals(expected,actual);
        
    }
}
