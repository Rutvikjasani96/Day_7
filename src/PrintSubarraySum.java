public class PrintSubarraySum {
    // anything problem i think
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        int sum=0,totalSum=0;
        for(int i=0;i< array.length;i++){

            for(int j=i;j< array.length;j++){
                sum=0;
                sum = sum + array[j];
                totalSum = totalSum + sum;
            }
        }
        System.out.println("Total Sum : "+totalSum);
    }
}
