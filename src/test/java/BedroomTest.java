import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 4, "Family");
        guest1 = new Guest("Sam");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Keith");
        guest4 = new Guest("Juan");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.collectionCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.collectionCount());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.collectionCount());
    }

    @Test
    public void cantAddGuestToRoom(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        bedroom.addGuest(guest4);
        bedroom.addGuest(guest2);
        assertEquals(4, bedroom.collectionCount());
    }
}
