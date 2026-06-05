public class Apply_Operations_to_an_Array {
 public static void main(String[] args) {
    int []nums={1,2,2,4,5,5,0};

    int []res=applyOperations(nums);
    for(int i=0;i<res.length;i++){
        System.out.println(" "+res[i]);
    }
 }  
 
  public static int[] applyOperations(int[] nums) {
           int  n=nums.length;
            for(int i=0;i<(n-1);i++){
                if(nums[i]==nums[i+1]){
                    nums[i]*=2;
                    nums[i+1]=0;
                }
            }

            int write=0;
            for(int read=0;read<n;read++){
                if(nums[read]!=0){
                    int temp=nums[read];
                    nums[read]=nums[write];
                    nums[write]=temp;
                    write++;
                }
            }



        return nums;
    }


}
