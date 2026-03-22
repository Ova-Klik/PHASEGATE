import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestMilkyDoughnut{

    MilkyDoughnut milky;
    
    
    @BeforeEach
    void setUp(){
    
        milky = new MilkyDoughnut();
    }    
        
    @Test
    public void testThatFunctionReturnNumberOfEvenElement(){
    
        int [] numbers={1,2,3,4,5,6};
        
        int expected = milky.countEvenElements(numbers);
        int actual = 3;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturns0WhenArrayIsEmpty(){
    
        int [] numbers={};
        
        int expected = milky.countEvenElements(numbers);
        int actual = 0;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturns0WhenArrayContainsOnlyOddElements(){
    
        int [] numbers={3,9,5,7,11,13};
        
        int expected = milky.countEvenElements(numbers);
        int actual = 0;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionCountsNegativeEvenNumbers(){
    
        int [] numbers={1,-2,3,-4,5,6,8,-12};
        
        int expected = milky.countEvenElements(numbers);
        int actual = 5;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsIndexOfAsearchedElement(){
    
        int [] numbers = {1,-2,3,-4,5,6,8,-12};
        int elementToSearch = 5;
        
        int expected = milky.getElementIndex(numbers,elementToSearch);
        int actual = 4;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsMinusOneWhenElementNotFound(){
    
        int [] numbers = {1,-2,3,-4,5,6,8,-12};
        int elementToSearch = 18;
        
        int expected = milky.getElementIndex(numbers,elementToSearch);
        int actual = -1;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsMinusOneWhenArrayIsEmpty(){
    
        int [] numbers = {};
        int elementToSearch = 18;
        
        int expected = milky.getElementIndex(numbers,elementToSearch);
        int actual = -1;
        
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsTrueIfNumberIsPerfectSquare(){
    
        int number= 4;
        
        boolean expected = milky.checkPerfectSquare(number);
        assertTrue(expected);
    
    }
    
     @Test
    public void testThatFunctionReturnFalseIfNumberIsPerfectSquare(){
    
        int number= 5;
        
        boolean expected = milky.checkPerfectSquare(number);
        assertFalse(expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsArrayFirstNPerfectSquares(){
    
        int [] numbers = {1,2,3,4,5,9,8,-12,12,-9};
        int firstNnumberOfPerfectSquare = 3;
        
        int[]expected = milky.getFirstNPerfectSquares(numbers,firstNnumberOfPerfectSquare);
        int[]actual = {1,4,9};
        
        assertArrayEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsArrayOfMaxNPerfectSquaresAvailableIfNotUpToRequestedNumber(){
    
        int [] numbers = {1,2,3,4,5,9,8,-12,12,-9};
        int firstNnumberOfPerfectSquare = 5;
        
        int[]expected = milky.getFirstNPerfectSquares(numbers,firstNnumberOfPerfectSquare);
        int[]actual = {1,4,9};
        
        assertArrayEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsTrueWhenArrayEqualsInLengthAndValue(){
    
        int [] numbers = {1,2,3,4,5,9,8,-12,12,-9};
        int [] numbers2 = {1,2,3,4,5,9,8,-12,12,-9};
        
        boolean expected = milky.checkArrayEquals(numbers,numbers2);
        
        assertTrue(expected);
    
    }
    
    @Test
    public void testThatFunctionReturnsFalseWhenArrayEqualsInLengthOnly(){
    
        int [] numbers = {1,2,3,4,5,9,8,-12,12,-9};
        int [] numbers2 = {1,2,3,4,5,9,1,10,12,-9};
        
        boolean expected = milky.checkArrayEquals(numbers,numbers2);
        
        assertFalse(expected);
    
    }
    
    
    
    
    @Test
    public void testThatFunctionCountsDuplicateElement(){
    
        int [] numbers = {1,2,3,4,3,7,2};
        
        int expected = milky.countDuplicateElement(numbers);
        int actual = 2;
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatFunctionRemovesDuplicateElement(){
    
        int [] numbers = {7,1,2,3,4,3,7,2,9};
        
        int []expected = milky.removeDuplicateElement(numbers);
        int []actual = {7,1,2,3,4,9};
        assertArrayEquals(actual,expected);
    
    }
    
    @Test
    public void testThatCountsElementOfA2DArray(){
    
        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        
        int expected = milky.getCountForElementsIn2DArray(numbers);
        int actual = 9;
        assertEquals(actual,expected);
    
    }
    
    @Test
    public void testThatReturnsElementOfA2DArrayInALinearArray(){
    
        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        
        int[] expected = milky.copy2DArrayElementsIntoLinearArray(numbers);
        int []actual = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(actual,expected);
    
    }
  
    
}
