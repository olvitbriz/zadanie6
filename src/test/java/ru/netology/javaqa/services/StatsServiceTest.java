package ru.netology.javaqa.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfSalesInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=180;
        int actual=service.sumSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void averageSaleInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=15;
        int actual=service.averageSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void monthWithMinSaleInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=9;
        int actual=service.minSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void monthWithMaxSaleInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=8;
        int actual=service.maxSales(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void daysLessThanAverangeInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=5;
        int actual=service.daysLessThanAverageSale(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void daysMoreThanAverangeInYear(){
        StatsService service= new StatsService();
        int [] sales= { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected=5;
        int actual=service.daysMoreThanAverageSale(sales);
        Assertions.assertEquals(expected,actual);
    }
}
