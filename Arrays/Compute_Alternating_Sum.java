public class Compute_Alternating_Sum {
    public static void main(String[] args) {
        int [] vinu={1,3,5,7};
        System.out.println("Result : "+alternating_Sum(vinu));
    }


    public static int alternating_Sum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];

            }
            else {
                sum-=arr[i];
            }
        }
        return sum;
    }


}