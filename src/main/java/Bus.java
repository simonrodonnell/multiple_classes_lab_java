import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
       if (this.getPassengers() < this.capacity) {
           this.passengers.add(person);
       }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickup(BusStop busstop) {
        Person newPassenger = busstop.removePerson();
        this.passengers.add(newPassenger);
    }
}
