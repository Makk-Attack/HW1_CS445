package ParkPaySystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkTest {

    @Test
    public void testConstructor(){
        String [] comments = new String[5];
        Park park1 = new Park("Yosemite", 12.0, comments, "123 Something Ln");
        Park park2 = new Park("Yosemite", 12.0, comments, "123 Something Ln");

        assertEquals(park1, park1);
    }

    @Test
    public void testEqual(){
        String [] comments = new String[5];
        Park park1 = new Park("Yosemite", 12.0, comments, "123 Something Ln");
        Park park2 = new Park("Yosemite", 12.0, comments, "123 Something Ln");
        Boolean results = park1.equals(park2);

        assertEquals(results, Boolean.TRUE);
    }

}