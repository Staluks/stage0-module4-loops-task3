package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int preFib =0;
        int fib =1;
        for (int x=0;x<lastFibonacci; x++){
            fib = fib + preFib;
            System.out.println(preFib);
            preFib = fib - preFib;
        }

    }
}
