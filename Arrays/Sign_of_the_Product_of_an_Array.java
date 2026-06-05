public class Sign_of_the_Product_of_an_Array {
    public static void main(String[] args) {
        int nums[]={14,0,15,-45,-4};

        System.out.println("result: "+arraySign(nums));
    }
// i solved using simple login , that is counting the negative in array , and check if one zero comes then return 0 , like that i used 

 public static int arraySign(int[] nums) {
            int negative=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]<0){
                negative++;
            }
            else if (nums[i]==0){
                return 0;
            }
        }

        if((negative%2)!=0){
            return -1;
        }
       return 1;

    }

}
