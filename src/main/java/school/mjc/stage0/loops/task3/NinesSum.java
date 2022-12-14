package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int nine =9;
        int num = 0;
        int sum =0;
        for(int x = 1; x<=lengthOfLastNumber; x++){
            num = (num*10) +nine;
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
