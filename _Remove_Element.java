public class _Remove_Element {
    
    public static void main (String[] args)
    {

        int [] arr={0,1,2,2,3,0,4,2};
        int value=2;

       int k= removeElement(arr,value);
          
        System.out.println("array nums is : ");
        for(int i=0;i<arr.length;i++){
            System.out.println("  "+arr[i]+ "  ");
        }
        System.out.println("value of k : "+k);


    }


    public  static int removeElement(int[] nums, int val) {
        
        int i=0,j=nums.length-1;

        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}



