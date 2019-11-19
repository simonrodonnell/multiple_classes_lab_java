import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        busstop = new BusStop("Princess Street");
        bus = new Bus("Leith", 100);
        person = new Person();
    }

    @Test
    public void addPassengerToQueue(){
        busstop.addPerson(person);
        assertEquals(1, busstop.queueSize());
    }

    @Test
    public void removePassengerFromQueue(){
        busstop.addPerson(person);
        assertEquals(person, busstop.removePerson());
    }

}
