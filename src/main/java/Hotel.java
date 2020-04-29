import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> roomCollection;

    public Hotel(String name){
        this.name = name;
        this.roomCollection = new ArrayList<Bedroom>();
    }

    public int hotelRoomCount() {
        return this.roomCollection.size();
    }

    public void addRoom(Bedroom bedroom1) {
        this.roomCollection.add(bedroom1);
    }

    public void removeRoom(Bedroom bedroom1) {
        this.roomCollection.remove(bedroom1);
    }

    public void checkInGuest(Guest guest1, Bedroom bedroom3) {
        bedroom3.addGuest(guest1);
    }

    public void checkOutGuest(Guest guest2, Bedroom bedroom3) {
        bedroom3.removeGuest(guest2);
    }
}
