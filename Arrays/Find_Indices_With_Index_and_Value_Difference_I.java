public class Find_Indices_With_Index_and_Value_Difference_I {

    public static void main(String[] args) {
        int [] array={5,1,4,1};
        int [] res=findIndices(array,2,4);
        System.out.println("result : "+ res[0]+"  " + res[1]);
    }
     public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        
        int [] arr={-1,-1};
       
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {

                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;

    }
}
