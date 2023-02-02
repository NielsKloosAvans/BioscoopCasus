import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMovieScreening {
        @Test
        public void testGetPricePerSeat() {
            Movie movie = new Movie("The Matrix");
            LocalDateTime dateAndTime = LocalDateTime.of(2023, Month.FEBRUARY, 2, 20, 0);
            double pricePerSeat = 10.0;
            MovieScreening movieScreening = new MovieScreening(movie, dateAndTime, pricePerSeat);

            double expectedPrice = 10.0;
            double actualPrice = movieScreening.getPricePerSeat();
            assertEquals(expectedPrice, actualPrice, 0.0);
        }
        @Test
        public void testGetPricePerSeatFalse() {
            Movie movie = new Movie("The Matrix");
            LocalDateTime dateAndTime = LocalDateTime.of(2023, Month.FEBRUARY, 4, 20, 0);
            double pricePerSeat = 10.0;
            MovieScreening movieScreening = new MovieScreening(movie, dateAndTime, pricePerSeat);

            double expectedPrice = 0;
            double actualPrice = movieScreening.getPricePerSeat();
            assertEquals(expectedPrice, actualPrice, 0.0);
    }
}
