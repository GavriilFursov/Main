public class SalesManager {
    public int[] sales;
    public int max;

    public SalesManager() {
        this.max = -1;
        this.sales = new int[]{-5, -6 ,-8 };
    }
    public int maxSale() {
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int print(int max) {
        return maxSale();
    }
}
