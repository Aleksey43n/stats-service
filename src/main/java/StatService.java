public class StatService {

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

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverage(int[] sales) {
        int underAvg = 0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)) {
                underAvg += 1;
            }
        }
        return underAvg;
    }

    public int overAverage(int[] sales) {
        int overAvg = 0;
        for (int sale : sales) {
            if (sale > calculateAverage(sales)) {
                overAvg += 1;
            }
        }
        return overAvg;
    }

}
