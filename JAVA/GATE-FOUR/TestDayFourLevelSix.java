
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestDayFourLevelSix{

    DayFourLevelSix array;
    
    @BeforeEach
    void setUp(){
    
        array = new DayFourLevelSix();
    }
    
    @Test
    public void testThatArrayFunctionReturnsNumbersOfOddAndOddElementsContained(){
    
        int[]numbers = {45,60,3,10,9,22};
        int[]expected = array.countEvenOdd(numbers);
        int[]actual = {3,3};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayFunctionSplitsToEvenAndOddArrays(){
    
        int[]numbers = {45,60,3,10,9,22};
        int[][]expected = array.splitArrayIntoEvenAndOddArrays(numbers);
        int[][]actual = {{45,3,9},{60,10,22}};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayIsPalindrome(){
    
        int[]numbers = {45,0,8,0,45};
        boolean expected = array.checkArrayPalindrome(numbers);
        boolean actual = true;
        
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayReturnsAllPerfectSquares(){
    
        int[]numbers = {4,7,9,10,16,18};
        int[]expected = array.getPerfectSquares(numbers);
        int[]actual = {4,9,16};
        
        assertArrayEquals(expected,actual);
        
    }
    
    @Test
    public void testThatArrayReturnsMinusOneForEveryNonPerfectQuaredElement(){
    
        int[]numbers = {4,7,9,10,49,18};
        int[]expected = array.replaceNonPerfectSquaresElementWithMinus0ne(numbers);
        int[]actual = {4,-1,9,-1,49,-1};
        
        assertArrayEquals(expected,actual);
        
    }
    
    
}
