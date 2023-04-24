import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceDoubleTypeTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        double expected = 565.92;
        double actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual, 0.01);

    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        double expected = 47.16;

        double actual = service.calculateAverage(sales);

        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        int expected = 10;

        int actual = service.findMaxMonth(sales);

        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        int expected = 12;

        int actual = service.findMinMonth(sales);

        Assertions.assertEquals(expected, actual, 0.01);

    }

    @Test
    void shouldCalculateMonthsBelowAverage() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        int expected = 10;

        int actual = service.calculateMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void shouldCalculateMonthsAboveAverage() {
        StatsService service = new StatsService();
        double[] sales = {11.52, 21.60, 180.72, 21.60, 24.48, 28.80, 27.36, 28.80, 10.08, 180.72, 20.16, 10.08};
        int expected = 2;

        int actual = service.calculateMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual, 0.01);
    }
}




