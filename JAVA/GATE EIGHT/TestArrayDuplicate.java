import java.util.Random;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayDuplicate{

        ArrayDuplicate modify;
        
        @BeforeEach
        void setUp(){
        modify = new ArrayDuplicate();
        
        }
        
        @Test
        public void testThatArrayHasDuplicateElement(){
        
            int [] numbers = {9,2,3,2,1};
            
            int result = modify.countDuplicate(numbers);
            int expected = 2;
            
            assertEquals(expected,result);
        }
        
        @Test
        public void testThatFunctionRemovesDuplicate(){
        
            int [] numbers = {9,2,3,2,1};
            
            int []result = modify.reomveDuplicate(numbers);
            int []expected = {9,3,1};
            
            assertEquals(expected,result);
        }
        
    
}
