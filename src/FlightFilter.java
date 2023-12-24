


import java.util.List;
public interface FlightFilter {
    void allFlightSegments(List<Flight> flights);

    List<Flight> departureToTheCurrentPointInTime(List<Flight> flights);

    List<Flight> thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate(List<Flight> flights);

    List<Flight> theTotalTimeSpentOnTheGroundExceedsTwoHours(List<Flight> flights);
}
