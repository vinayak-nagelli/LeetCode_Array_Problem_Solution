public class _Sort_Colors {
    
    public static void main(String[] args) {
        int arr[]={0,1,2,2,1,0};
        Sort_Colors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void Sort_Colors(int []arr){
        int [] count={0,0,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
        }

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[index]=i;
                index++;
                count[i]-=1;
            }
        }
    }
}
