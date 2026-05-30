public class Move_Zeroes {
    
    public static void main(String[] args) {
        int [] arr={0,0,1};
        zeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(" " + arr[i]);
        }
    }

    public static void zeroes(int [] arr){

        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }

        for(int j=i;j<arr.length;j++){
            arr[j]=0;
        }
    }
}
