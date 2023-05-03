package ch4programs;
class FibonacciSeries {
    private int limit;
    private int[] series;

    public FibonacciSeries(int limit) {
        this.limit = limit;
        this.series = new int[limit];
        this.generateSeries();
    }

    private void generateSeries() {
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < limit; i++) {
            series[i] = series[i-1] + series[i-2];
        }
    }

    public void printSeries() {
        System.out.print("Fibonacci Series up to " + limit + ": ");
        for (int i = 0; i < limit; i++) {
            System.out.print(series[i] + " ");
        }
        System.out.println();
    }

    public static class TestMain4{
        public static void main(String[] args) {
            FibonacciSeries fibonacciSeries = new FibonacciSeries(10);
            fibonacciSeries.printSeries();
        }
    }
}