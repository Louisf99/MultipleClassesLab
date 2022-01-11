import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 2);
        passenger = new Person();
        busStop = new BusStop();
        busStop.addPerson(passenger);
    }

    @Test
    public void checkBusIsEmpty(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void addPassenger(){
        bus.add(passenger);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassenger(){
        bus.add(passenger);
        bus.add(passenger);
        bus.add(passenger);
        assertEquals(2, bus.getNumberOfPassengers());
    }

    @Test
    public void removePassenger(){
        bus.add(passenger);
        bus.add(passenger);
        bus.remove(passenger);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpPassengerFromBusStop() {
        bus.collectFromBusStop(busStop, passenger);
        assertEquals(1, bus.getNumberOfPassengers());
        assertEquals(0, busStop.queueCount());
    }
}
