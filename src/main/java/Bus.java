import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public void add(Person passenger) {
        if (getNumberOfPassengers() < capacity ) {
            passengers.add(passenger);
        }
    }

    public void remove(Person passenger) {
        passengers.remove(passenger);
    }
}
