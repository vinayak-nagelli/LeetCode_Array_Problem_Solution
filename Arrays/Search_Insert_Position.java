public class Search_Insert_Position {
    
    public static void main(String[] args) {
        
        int arr[]={1,5,7,10};

        System.out.println("OUTPUT is : "+searchInsert(arr, 8));


    }

 public static int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1;
        while(start<=end){
            int med=(start+end)/2;
            if(nums[med]==target){
                return med;
            }
            else if ( nums[med]<target){
                start=med+1;
            }
            else{
                end=med-1;
            }
        }
        return start;
    }


}
