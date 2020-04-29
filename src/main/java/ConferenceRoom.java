import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> collection;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Guest>();
    }

    public int guestCount() {
        return this.collection.size();
    }

    public void addGuest(Guest guest1) {
        if (this.guestCount() < this.capacity)
            this.collection.add(guest1);
    }

    public void removeGuest(Guest guest1) {
        this.collection.remove(guest1);
    }
}
