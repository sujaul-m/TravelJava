import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, PlaneType plane, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public String getFlightNo() {
        return this.flightNumber;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getPassengersBookingSize() {
        return this.passengers.size();
    }

    public boolean availableRoomOnFlight() {
        return plane.getCapacity() >= passengers.size();
    }

    public void addPassenger(Passenger passenger1) {
        if (availableRoomOnFlight()) {
            this.passengers.add(passenger1);
        }
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public double getPlaneCapacity() {
        return plane.getCapacity();
    }

    public double getPlaneWeight() {
        return  plane.getWeight();
    }

    public double getAvailableLuggageWeight() {
        return getPlaneWeight() / 5;
    }

    public int getNoOfPassengersBags(Passenger passenger) {
        return passenger.getBags();
    }
}