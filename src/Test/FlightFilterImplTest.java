package Test;


import org.junit.jupiter.api.DisplayName;

import javax.swing.text.Segment;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightFilterImplTest {
    protected final List<FlightFilterImplTest> flights = new ArrayList<>();
    private final FlightFilterImplTest flightFilter = new FlightFilterImplTest();
    LocalDateTime time = LocalDateTime.now();


    @DisplayName("Test of the deviation display method for the current time.")
    public void departureToTheCurrentPointInTimeTest() {
        Segment segment = new Segment();
        List<Segment> segments = new ArrayList<>();
        segments.add(segment);
        List<FlightFilterImplTest> filteredFlights = flightFilter.departureToTheCurrentPointInTime(flights);
        assertTrue(filteredFlights.isEmpty());
    }

    private List<FlightFilterImplTest> departureToTheCurrentPointInTime(List<FlightFilterImplTest> flights) {
        return null;
    }


    @DisplayName("Test of the method of displaying flights with arrival date earlier than departure date. ")
    public void thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDateTest() {
        Segment segment = new Segment();
        List<Segment> segments = new ArrayList<>();
        segments.add(segment);
        List<FlightFilterImplTest> filteredFlights = flightFilter.thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate(flights);
        assertTrue(filteredFlights.isEmpty());
    }

    private List<FlightFilterImplTest> thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate(List<FlightFilterImplTest> flights) {
        return null;
    }


    @DisplayName("Method test for filtering flights with a total time on the ground of more than two hours")
    public <Flight> void filterFlightsWithTotalTimeOnGroundExceedingTwoHours() {

        Segment segment1 = new Segment(time.plusHours(2), time);
        Segment segment2 = new Segment(time.plusHours(2).plusMinutes(2), time.plusHours(6));
        List<Segment> segments = new ArrayList<>();
        segments.add(segment1);
        segments.add(segment2);
        Flight flight = new Flight(segments);
        List<Flight> flights = new ArrayList<>();
        flights.add(flight);
        List<Flight> filteredFlights = flightFilter.theTotalTimeSpentOnTheGroundExceedsTwoHours(flights);
        assertTrue(filteredFlights.isEmpty());
    }

    private <Flight> List<Flight> theTotalTimeSpentOnTheGroundExceedsTwoHours(List<Flight> flights) {
        return null;
    }
}
