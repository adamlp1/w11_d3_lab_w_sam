import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private ConferenceRoom conferenceRoom;


    @Before

    public void before(){
        guest1 = new Guest("Sam");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Juan");
        guest4 = new Guest("Keith");
        conferenceRoom = new ConferenceRoom("Keith's Webex", 5);
    }

    @Test

    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test

    public void canAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test

    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test

    public void cantAddGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest1);
        assertEquals(5, conferenceRoom.guestCount());
    }

}
