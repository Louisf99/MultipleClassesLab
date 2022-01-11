import java.util.ArrayList;

public class BusStop {


    private ArrayList<Person> queue;

    public BusStop() {
        this.queue = new ArrayList<>();

    }

    public void addPerson(Person person){
        this.queue.add(person);
    }

    public int queueCount() {
        return this.queue.size();
    }

    public void removePerson(Person person){
        this.queue.remove(person);
    }

}
