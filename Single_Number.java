public class Single_Number {
 
        public static void main(String[] args) {
            
            int arr []={1,1,2,2,4};
            System.out.println("the single appear number : "+singleNumber(arr));


        }

         public  static int singleNumber(int[] nums) {
        int single=0;

        for(int i=0;i<nums.length;i++){
            single=single^nums[i];

        }
        return single;
    }


}
