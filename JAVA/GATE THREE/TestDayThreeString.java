import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestDayThreeString{

    
    DayThreeStringTask string;
    
   @BeforeEach
   void setUp(){
   
        string = new DayThreeStringTask();
    
   }
   
   @Test
   public void testThatFunctionReturnsCharacterOccurenceForStringOfLengthEigth(){
   
        String word= "AaaBBc";
        
        String expected = string.getOccurence(word);
        String actual = "A1a2B2c1";
        
        assertEquals(expected,actual);
   }
   
   @Test
   public void testThatFunctionReturnsCharacterOccurenceForStringOfLengthEleven(){
   
        String word= "EEEEnnnneee";
        
        String expected = string.getOccurence(word);
        String actual = "E4n4e3";
        
        assertEquals(expected,actual);
   }
   
   
   @Test
   public void testThatFunctionReturnsCharacterOccurenceForStringOfLengthNine(){
   
        String word= "ooooooYOO";
        
        String expected = string.getOccurence(word);
        String actual = "o6Y1O2";
        
        assertEquals(expected,actual);
   }

}
