import java.util.ArrayList;
import java.util.List;

public class Valid_Elements_in_an_Array {
    public static void main(String[] args) {
        // i checked on leetcode , it runs successfully without fails test case , so no need to check again here 
    }
     public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        
         List<Integer> res=new ArrayList<> ();
            res.add(nums[0]);
         for(int i=1;i<n-1;i++){
                int flag_left=1,flag_right=1;
                for(int j=0;j<i;j++){ // for left side 
                    if(nums[j]>=nums[i]){
                        flag_left=0;
                        break;
                        }
                    
                }

                for(int j=i+1;j<n;j++){   // for right side okay
                    if(nums[j]>=nums[i]){
                        flag_right=0;
                        break;
                    }
                   
                }

                if(flag_left==1 || flag_right==1){
                    res.add(nums[i]);
                }
                
         }

         if(n>1){  
         res.add(nums[n-1]);
         }   

         return res;
    }
}
