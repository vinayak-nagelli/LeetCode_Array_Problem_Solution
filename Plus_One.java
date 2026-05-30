public class Plus_One {
 public static void main(String[] args) {
    
 int [] arr={9,9,9};

 int [] res;
 res=plusOne(arr);
 for(int i=0;i<res.length;i++){
    System.out.println(res[i]+" :");
 }

    
 }
 
 
 public static int[] plusOne(int[] digits) {
    
             int flag=0;
        for(int i=digits.length-1;i>=0;i--){

            if(digits[i]==9){
                digits[i]=0;
                flag=1;
            }
            else{
                digits[i]=digits[i]+1;
                flag=0;
                break;
            }
        }
        int [] arr =new int [(digits.length+flag)];
        for(int i=0;i<arr.length;i++)
        {
            if(flag==1&&i==0){
                arr[i]=1;

            }
            else if(flag==1){
                arr[i]=digits[i-1];
            }
            else {
                arr[i]=digits[i];
            }
        }
        return arr;
    }

}
