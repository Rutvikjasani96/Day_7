public class SubarraySum {
//    Print all sub array sum(Home work)
    public static void main(String[] args) {
        int[] array ={0,1,2,3,4};
        int ps[] = new int[array.length];
        prefixSum(array,ps);
        subarraySum(array,ps);
    }
    static void subarraySum(int[] array,int[] ps){
        int sum=0;
        for(int i = 0;i< array.length;i++){
//            for(int j=i;j< array.length;j++){
//                sum=sum+array[j]; // using carry forward
                if(i!=0) {
                    sum = sum + ps[ps.length - 1] - ps[i - 1];
                }else{
                    sum = sum + ps[ps.length-1] - ps[i];
                }
//            }
        }
        System.out.println(" "+sum);
    }
    static void prefixSum(int[] array,int[] ps){
        ps[0]=array[0];
        for(int i=1;i< array.length;i++){
            ps[i]=ps[i-1]+array[i];
        }
    }
}
