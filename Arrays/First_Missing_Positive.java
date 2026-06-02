public class First_Missing_Positive {
    public static void main(String[] args) {
        int arr[]={12,1,10};
        System.out.println("ouput smallest positive no: "+firstMissingPositive(arr));

    }

     public static int firstMissingPositive(int[] nums) {
    //    int flag=0;
    //    for(int i=1;i<nums.length;i++){
    //     for(int j=0;j<nums.length;j++){
    //         if(i==nums[j]){
    //             flag=1;
    //             break;
    //         }
    //         else{
    //             flag=0;
    //         }
            
    //     }
    //     if(flag==0){
    //         return i;
    //     }
    //   }
        
     int i=1,j=0,flag=0;

        while(j<nums.length){
            if(nums[j]==i){
                j=0;
                i++;
                flag=1;
            }
            else{
                j++;
                flag=0;
            }

        }
        if(flag==0){
            return i;
        }

        return nums.length;
    }
}
