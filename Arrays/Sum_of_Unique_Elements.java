public class Sum_of_Unique_Elements {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("Sum of unique : "+sumofunique(arr));
    }

    public static int sumofunique(int [] arr){
        int sum=0,n=arr.length;
        boolean [] mark=new boolean[n];
       
        for(int i=0;i<n;i++){
            for(int j=1+i;j<n;j++){

                if(arr[i]==arr[j]){
                    mark[i]=true;
                    mark[j]=true;
                }
            }
        }
       
        for(int i=0;i<n;i++){
            if(mark[i]==false){
                sum+=arr[i];
            }
        }

        return sum;
    }


}
