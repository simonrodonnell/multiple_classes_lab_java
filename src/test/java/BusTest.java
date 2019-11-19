import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Leith", 5);
        person = new Person();
        busstop = new BusStop("Bus Stop One");
    }

    @Test
    public void numberOfPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void cannotAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getPassengers());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(3, bus.getPassengers());
    }

    @Test
    public void canPickupPassenger(){
        busstop.addPerson(person);
        bus.pickup(busstop);
        assertEquals(1, bus.getPassengers());
    }
}
