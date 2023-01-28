package ru.netology.javaqa.services;
public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {

            sum = sum + sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {

            sum = sum + sale;
        }
        int averageSale = sum / 12;

        return averageSale;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int daysLessThanAverageSale(int[] sales) {
        int days = 0;
        int average=averageSales(sales);

        for (int sale : sales) {

            if (sale < average) {
                days = days + 1;
            }
        }
        return days;
    }
    public int daysMoreThanAverageSale(int[] sales) {
        int days = 0;
        int average=averageSales(sales);

        for (int sale : sales) {

            if (sale > average) {
                days = days + 1;
            }
        }
        return days;
    }
}
