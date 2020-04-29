import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Hotel hotel;

    @Before

    public void before(){
        guest1 = new Guest("Sam");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Juan");
        guest4 = new Guest("Keith");
        bedroom1 = new Bedroom(1, 2, "Double");
        bedroom2 = new Bedroom(2, 4, "Family");
        bedroom3 = new Bedroom(3, 6, "Family Suite");
        bedroom4 = new Bedroom(4, 1, "Single");
        conferenceRoom1 = new ConferenceRoom("Keith's Webex", 5);
        conferenceRoom2 = new ConferenceRoom("Juan's Zoom", 10);
        hotel = new Hotel("CodeClan Towers");
    }

    @Test

    public void hotelRoomCount(){
        assertEquals(0, hotel.hotelRoomCount());
    }

    @Test

    public void canAddRoom(){
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.hotelRoomCount());
    }

    @Test

    public void canRemoveRoom(){
        hotel.removeRoom(bedroom1);
        assertEquals(0, hotel.hotelRoomCount());
    }

    @Test

    public void canCheckInGuest(){
        hotel.addRoom(bedroom3);
        hotel.checkInGuest(guest1, bedroom3);
        assertEquals(1, hotel.hotelRoomCount());
        assertEquals(1, bedroom3.collectionCount());
    }

    @Test

    public void canCheckOutGuest(){
        hotel.addRoom(bedroom3);
        hotel.checkInGuest(guest2, bedroom3);
        hotel.checkOutGuest(guest2, bedroom3);
        assertEquals(1, hotel.hotelRoomCount());
        assertEquals(0, bedroom3.collectionCount());
    }







}
