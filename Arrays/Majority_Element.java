import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
       
            int [] arr={1,2,2,2,3};
            System.out.println("resutl : "+majorityElement(arr));

    }

     public static  int majorityElement(int[] vinu) {
        int n=vinu.length;
        if (n == 1) {
            return vinu[0];
        }

        Arrays.sort(vinu);

        int count=1;

        for(int i=1;i<n;i++){
            if(vinu[i]==vinu[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>(n/2)){
                return vinu[i];
            }

        }

       
        return vinu[0];
    }
}
