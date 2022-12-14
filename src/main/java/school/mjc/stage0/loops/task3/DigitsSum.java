package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum =0;
        String num = String.valueOf(t);
        for(int count = 1;count<=num.length();count++){
            int lestNumber = t%10;
            t =(t-lestNumber)/10;
            sum = sum + lestNumber;

        }
        if(sum<0){
            sum *= -1;
        }
        System.out.println(sum);
    }
}
