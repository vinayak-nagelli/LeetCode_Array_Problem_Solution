import java.util.Arrays;

public class Reverse_String_II {
 public static void main(String[] args) {
        System.out.println("reverse the string : "+reverseStr("Vinayak", 4));
 }
 
 
 public  static String reverseStr(String s, int k) {
      char [] arr=s.toCharArray();

      if((2*k)<=s.length()){
        for(int i=0;i<(k/2);i++){
            char temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }
      }
      else{
            for(int i=0;i<(arr.length/2);i++){
                char temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
      }

      String res=Arrays.toString(arr);
      return res;
}


}
