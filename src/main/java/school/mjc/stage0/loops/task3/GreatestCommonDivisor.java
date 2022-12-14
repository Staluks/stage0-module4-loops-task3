package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int devider = 0;
        int largestNumber;
        if(first >= second){
            largestNumber = first;
        }else{
            largestNumber = second;
        }
        for(int a = 1; a<=largestNumber; a++){
            if(first%a ==0 && second%a==0){
                devider = a;
            }
        }
        System.out.println(devider);
    }
}
