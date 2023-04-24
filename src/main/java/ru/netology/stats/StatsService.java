package ru.netology.stats;

public class StatsService {
    public double calculateSum(double[] sales) {
        double sum = 0;
        for (double sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverage(double[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMaxMonth(double[] sales) {
        double maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1; // сдвигаем ответ на +1, т.к. месяц нумеруется с 1,  а массив с 0
    }

    public int findMinMonth(double[] sales) {
        double minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1; // сдвигаем ответ на +1, т.к. месяц нумеруется с 1,  а массив с 0
    }

    public int calculateMonthsBelowAverage(double[] sales) {
        double average = calculateAverage(sales);
        int monthsBelowAverage = 0;
        for (double sale : sales) {
            if (sale < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int calculateMonthsAboveAverage(double[] sales) {
        double average = calculateAverage(sales);
        int monthsAboveAverage = 0;
        for (double sale : sales) {
            if (sale > average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }


}

