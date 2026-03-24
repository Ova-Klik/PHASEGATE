
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestMiniParkingLot{

    MiniParkingLot park;
    
    @BeforeEach
    void setUp(){
    
        park = new MiniParkingLot();
    }    
        
    @Test
    public void testThatParkingSlotIsUp20(){
    
        int [][] lot = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int expected = park.countParkingLot(lot); 
        int actual= 20;
        
        assertEquals(actual,expected);
    }
    
    
    @Test
    public void testThatAllLotsAtDayStartIsAvailable(){
    
        int [][] lot = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        boolean expected = park.checkAllLotIsEmptyAtDayStart(lot); 
        boolean actual= true;
        
        assertEquals(actual,expected);
    }
    
    @Test
    public void testThatCarAutoMaticallyParksAtLot1WhenLotNumberIsNotSpecified(){
    
        int [][] lot = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        final String command = "assign";
        int [][] expected = park.parkACarBySequence(lot,command); 
        int [][] actual= {{1,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        
        assertArrayEquals(actual,expected);
    }
    
    @Test
    public void testThatCarParksWithLotNumberSpecified(){
    
        int [][] lot = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int lotNumber = 10;
        String command = "assign";
        int [][] expected = park.parkCarByLotNumber(lot, lotNumber, command); 
        int [][] actual= {{0,0,0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0,0,0}};
        
        assertArrayEquals(actual,expected);
    }
    
    @Test
    public void testThatCarCanUnParksWithLotNumberSpecified(){
    
        int [][] lot = {{1,0,0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0,0,0}};
        int lotNumber = 10;
        String command = "unassign";
        int [][] expected = park.unparkCarByLotNumber(lot,lotNumber,command); 
        int [][] actual= {{1,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        
        assertArrayEquals(actual,expected);
    }
    
    
}


