public class Squares_of_a_Sorted_Array {
 public static void main(String[] args) {
    
    int [] arr={-4,-1,0,8,10};
    int [] res;
    res=sortedSquares(arr);
    for(int i=0;i<res.length;i++){
        System.out.println(" "+res[i]);
    }

 }   

   public static int[] sortedSquares(int[] nums) {
       
        int [] res=new int[nums.length];
        int i=0,j=nums.length-1,k=nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k]=nums[i]*nums[i];
                i++;
            }else {
                res[k]=nums[j]*nums[j];
                j--;
            }

            k--;
        }
        return res;
    }
}

