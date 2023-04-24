package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1; // сдвигаем ответ на +1, т.к. месяц нумеруется с 1,  а массив с 0
    }

    public int findMinMonth(int[] sales) {
        int minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1; // сдвигаем ответ на +1, т.к. месяц нумеруется с 1,  а массив с 0
    }

    public int calculateMonthsBelowAverage(int[] sales) {
        int average = calculateAverage(sales);
        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int calculateMonthsAboveAverage(int[] sales) {
        long average = calculateAverage(sales);
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }


}

