class Sort_Array_By_Parity{

    public static void main(String[] args) {
        int [] vinu= {3,1,2,4};
        int [] res=sortArrayByParity(vinu);
        for(int i=0;i<res.length;i++){
        System.out.println(res[i]+" ,");
    }
    }
     public static int[] sortArrayByParity(int[] vinu) {
        int n=vinu.length;
        int []arr= new int [n];
        int i=0,k=0;

        for(int j=0;j<n;j++){
            if(vinu[j]%2==0){
                arr[k]=vinu[j];
                k++;
            }
            else{
                vinu[i]=vinu[j];
                i++;
            }
        }
        for(int j=0;j<i;j++){
            arr[k]=vinu[j];
            k++;
        }

        return arr;
    }
}