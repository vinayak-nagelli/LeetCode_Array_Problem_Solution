public class Find_the_Distance_Value_Between_Two_Arrays {
    public static void main(String[] args) {
        
    }
    
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(Math.abs(arr1[i]-arr2[j])<=d)// finding which count of fails
                {
                    count++;
                    break;
                }
            }
        }
        return n-count; // substract fails from total no , gives correct count 
    }

}
