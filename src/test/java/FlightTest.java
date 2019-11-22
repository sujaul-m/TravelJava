import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setup() {
        flight = new Flight("QT321", PlaneType.BOEING747, "IST", "EDI", "14:45");
        passenger1 = new Passenger("Sujaul", 3);
        passenger2 = new Passenger("Zsolt", 1);
        passenger3 = new Passenger("Louis", 5);
        passenger4 = new Passenger("Harrison", 2);
        passenger5 = new Passenger("Hannah", 0);
    }

    @Test
    public void flightHasANumberQT321(){
        assertEquals("QT321", flight.getFlightNo());
    }

    @Test
    public void  flightHasADestinationIstanbul(){
        assertEquals("IST", flight.getFlightDestination());
    }

    @Test
    public void flightHasADepartureEdinburgh(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasADepartureTime1100(){
        assertEquals("14:45", flight.getDepartureTime());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(10, flight.getPlaneCapacity(), 0.01);
    }

    @Test
    public void getPlaneWeight(){
        assertEquals(250.00, flight.getPlaneWeight(), 0.01);
    }

    @Test
    public void getWeightAvailableForPassengerLuggage(){
        assertEquals(50.00, flight.getAvailableLuggageWeight(), 0.01);
    }

    @Test
    public void passengerNumbers(){
        assertEquals(0, flight.getPassengersBookingSize());
    }

    @Test
    public void addPassengerToFlightTrue(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3, flight.getPassengersBookingSize());
    }

    @Test
    public void checkIfRoomOnFlightTrue(){
        assertEquals(true, flight.availableRoomOnFlight());
    }

    @Test
    public void checkIfRoomOnFlightFalse(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger5);
        assertEquals(false, flight.availableRoomOnFlight());
    }

    @Test
    public void checkAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(6, flight.getAvailableSeats());
    }

    @Test
    public void getNoOfPassengersBags(){
        assertEquals(5, flight.getNoOfPassengersBags(passenger3));
    }

}