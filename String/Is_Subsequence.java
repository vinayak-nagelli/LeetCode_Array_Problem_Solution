public class Is_Subsequence {
    public static void main(String[] args) {
        
        System.out.println("correct gives true or false : "+isSubsequence("vayik", "vinayak"));
    }


     public static boolean isSubsequence(String s, String t) {
        
        char [] arr1=s.toCharArray();//substring word
        char [] arr2=t.toCharArray();// fully word
        int i=0,j=0,flag=0;// i for fully and j for sub word

        if(s.length()==0){ // i added this because some test cases are empty in leetcode  .. okay 
            return true;
        }


        while(i<arr2.length&&j<arr1.length){

            if(arr1[j]==arr2[i]){
                if(j==(arr1.length-1)){
                    return true;
                }
                j++;
            }
            i++;
        }


        return false;
    }
}
