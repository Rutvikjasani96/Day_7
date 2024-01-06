import java.util.Scanner;

public class Question1 {
//    In How Many Subarray index 3 is present.  and total subarray sum.
    public static void main(String[] args) {
        int[] array = {-1,3,2,3};
        Scanner x = new Scanner(System.in);
//        System.out.println("Enter N : ");
//        int n = x.nextInt();
//        int ans = (n+1)*(array.length-n);
//        System.out.println("ans : "+ans);
        int totalSubarraySum  = subarraySum(array);
        System.out.println("total subarray sum : "+totalSubarraySum);

    }
    static int subarraySum(int[] array){
        int totalSum=0;
        int sum=0,contribution;
        for(int i=0;i<array.length;i++){
            sum = (i+1)*(array.length-i);
            contribution = array[i] * sum;
            totalSum = totalSum + contribution;
        }
        return totalSum;
    }
}
