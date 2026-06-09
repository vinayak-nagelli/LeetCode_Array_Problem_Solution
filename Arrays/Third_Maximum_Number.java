public class Third_Maximum_Number {
    public static void main(String[] args) {
        int [] arr={1,2,0};
        System.out.println("Third Maximum value/ element : "+thirdMax(arr));
    }
     public static  int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE,max2=max1,max3=max1;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
            else if (nums[i]>max2 && nums[i]<max1){
                max3=max2;
                max2=nums[i];
            }
            else if (nums[i]>max3 && nums[i]<max2 && nums[i]<max1 ){
                max3=nums[i];
            }
        }
        if(max3==Long.MIN_VALUE){ // i used Integer.MIN_VALUE but it is in test case so fails , so i used long , okay .
            return (int)max1;
        }
        return (int)max3;
    }
}
