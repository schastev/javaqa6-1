package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales)
    {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales)
    {
        int avg = 0;
        for (int sale : sales) {
            avg += sale;
        }
        avg = avg / sales.length;
        return avg;
    }

    public int calcMax(int[] sales)
    {
        int max = 0;
        int max_month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max){
                max = sales[i];
                max_month = i + 1;

            }
        }
        return max_month;
    }

    public int calcMin(int[] sales)
    {
        int min = sales[0];
        int min_month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= min){
                min = sales[i];
                min_month = i+1;
            }
        }
        return min_month;
    }

    public int calcBelowAvg(int[] sales)
    {
        int avg = 0;
        for (int sale : sales) {
            avg += sale;
        }
        avg = avg / sales.length;
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                months++;
            }
        }
        return months;
    }

    public int calcAboveAvg(int[] sales)
    {
        int avg = 0;
        for (int sale : sales) {
            avg += sale;
        }
        avg = avg / sales.length;
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                months++;
            }
        }
        return months;
    }
}
