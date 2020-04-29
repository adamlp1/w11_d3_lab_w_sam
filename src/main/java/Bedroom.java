import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> collection;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.collection = new ArrayList<Guest>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addGuest(Guest guest1) {
        if ( this.collectionCount() < this.capacity )
            this.collection.add(guest1);
    }

    public void removeGuest(Guest guest1) {
        this.collection.remove(guest1);
    }
}
