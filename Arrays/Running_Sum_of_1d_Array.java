public class Running_Sum_of_1d_Array {

    public static void main(String[] args) {
        int [] nums ={1,1,1,1,1};
        int [] res= runningSum(nums);
        for(int i=0;i<res.length;i++){
            System.out.println("  : "+res[i]);
        }
    }
     public static int[] runningSum(int[] nums) {
        int arr[]=new int [nums.length];
         int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            arr[i]=sum;
        }

        return arr;
    }
    
}
