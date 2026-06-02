public class Remove_Duplicates_from_Sorted_Array_II {
    
    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3};
        int res=removeDuplicates(arr);


    }
 public  static int removeDuplicates(int[] nums) {
        
    int i=0;

    for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        else{
            i++;
        }
    }
    for(int j=0;j<=i;j++){
        System.out.println(" "+nums[j]);
    }

    return i;
    }

}
