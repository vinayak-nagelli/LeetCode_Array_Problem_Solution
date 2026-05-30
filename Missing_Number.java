public class Missing_Number{



    public static void main(String []args){
        int [] nums={1,2,0,3,4,6};
        System.out.println("Missing value : "+missingNumber(nums));
    }
     public static int missingNumber(int[] nums) {

        int n=nums.length;
        n=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum==n){
            return 0;
        }
        else
        {
            return (n-sum);
        }
        
    }
}