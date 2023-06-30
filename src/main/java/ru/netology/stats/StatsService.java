package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale;
    }

    public long middle(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;  //номер месяца с макс продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как макс
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

  public int minSales(long[]sales){
        int minMonth = 0;  //номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int salesBellowMiddle(long[]sales){
        int counter = 0;
        for (long sale : sales) {
            if (sale < middle(sales)){
                counter++;
            }
        }
        return counter;
    }
    public int salesAboveMiddle(long[]sales){
        int counter = 0;
        for (long sale : sales) {
            if (sale > middle(sales)){
                counter++;
            }
        }
        return counter;
    }

}
