public class Left_and_Right_Sum_Differences {
    public static void main(String[] args) {
        
    }

     public int[] leftRightDifference(int[] vinu) {
        int n=vinu.length;
        int [] orgsum=new int [n];
        int [] leftsum=new int [n];
        int [] rightsum=new int [n];

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                leftsum[i]+=vinu[j];
            }

            for(int j=i+1;j<n;j++){
                rightsum[i]+=vinu[j];
            }

            orgsum[i]=Math.abs(leftsum[i]-rightsum[i]);
        }

        return orgsum;
    }
}
