import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestContactSystem{

    ContactSystem phoneBook;
    ArrayList<String> contacts; 
    
    @BeforeEach
    void setUp(){
        phoneBook = new ContactSystem();
        contacts = new ArrayList<>();
    }
   
    
    @Test
    public void testThatFunctionAddsContact() {

        String phoneNumber = "09055465240";
        String firstName = "Victor";
        String lastName = "Olaomo";

        ArrayList<String> result = phoneBook.addContact(firstName, lastName, phoneNumber, contacts);

        assertEquals(3, result.size());
    
}

    @Test
    public void testThatFunctionAddsAnotherContactWhenPhoneNumberDoesExist() {

        String phoneNumber = "08113398044";
        String firstName = "Badmus";
        String lastName = "Olaomo";
        

        ArrayList<String> result = phoneBook.handleAddContact(contacts);

        assertEquals(6, result.size());
    
}
    
}
