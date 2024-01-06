import static java.lang.Math.max;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] array ={0,1,2,3,4};
        int ps[] = new int[array.length];
        SubarraySum.prefixSum(array,ps);
        int maxSum = subarraySum(array,ps);
        System.out.println("Max Sum : "+maxSum);
    }
    static int subarraySum(int[] array,int[] ps){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i< array.length;i++){
            sum=0;
            if(i!=0) {
                sum = sum + ps[ps.length - 1] - ps[i - 1];
            }else{
                sum = sum + ps[ps.length-1] - ps[i];
            }
            maxSum = max(maxSum,sum);
        }
        return maxSum;
    }
}
