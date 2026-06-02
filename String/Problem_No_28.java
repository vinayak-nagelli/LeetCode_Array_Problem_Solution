import java.util.*;

public class Problem_No_28 {

    public static void main(String[] args) {
        System.out.println("the i position : "+strStr("Vinayak", "aya"));
    }

     public static int strStr(String haystack, String needle) {
        char [] arr1=haystack.toCharArray();
        char [] arr2=needle.toCharArray();
        int i=0,j=0;

        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]==arr2[j]){
                if(j==(arr2.length-1)){
                    return (i-(arr2.length-1));
                }else{
                    j++;
                }
            }
            i++;
        }
        
            return -1;
    }
}
