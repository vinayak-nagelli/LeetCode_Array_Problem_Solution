public class Concatenate_Array_With_Reverse {
    public static void main(String[] args) {
        int [] nums={1,2,3};

        int [] res=concatWithReverse(nums);
        for(int i=0;i<res.length;i++){
            System.out.println(" "+res[i]);
        }
        
    }
     public static int[] concatWithReverse(int[] nums) {
        int arr []=new int [(2*nums.length)];
        int i=nums.length-1,j=1;

        while(i>=0){
            arr[i]=nums[i];
            arr[i+j]=nums[i];
            i--;
            j+=2;
        }

        return arr;
    }
}
