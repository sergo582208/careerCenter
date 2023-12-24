
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Flight {
    private final List<Segment> segments;

    public Flight(final List<Segment> segs) {
        segments = segs;
    }

    public Collection<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return (String) segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}

