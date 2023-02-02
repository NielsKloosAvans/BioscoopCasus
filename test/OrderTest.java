import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testCalculatePrice() {
        Order order = new Order(1,true);
        List<MovieTicket> tickets = new ArrayList<>();
        Movie movie = new Movie("Saw");
        MovieScreening movieScreening = new MovieScreening(movie, LocalDateTime.now(),10);
        tickets.add(new MovieTicket(movieScreening,1,1,false));
        tickets.add(new MovieTicket(movieScreening,1,2,false));
        tickets.add(new MovieTicket(movieScreening,1,3,false));
        tickets.add(new MovieTicket(movieScreening,1,4,false));
        tickets.add(new MovieTicket(movieScreening,1,5,false));
        tickets.add(new MovieTicket(movieScreening,1,6,false));

        double expectedPrice = (10.0 + 15.0 + 25.0 + 35.0 + 1.0) * 0.9;
        double result = order.calculatePrice();
        assertEquals(expectedPrice, result, 0.001);
    }
}
