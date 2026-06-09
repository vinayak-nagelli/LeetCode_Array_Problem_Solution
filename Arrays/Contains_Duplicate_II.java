public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int [] arr ={1,0,1,1};
        System.out.println("result : "+containsNearbyDuplicate(arr, 1));
    }

    public static  boolean containsNearbyDuplicate(int[] vinu, int k) {
        int n=vinu.length;
    
       
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(vinu[i]==vinu[j] && Math.abs(i-j)<=k){
                return true;
            }
        }
       }
       return false;
    }
}
