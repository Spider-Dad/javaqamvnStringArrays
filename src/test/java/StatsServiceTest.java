import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 180;
        double actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual, 0.01);

    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.calculateAverage(sales);

        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthsBelowAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}




