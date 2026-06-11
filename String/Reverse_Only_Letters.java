class Reverse_Only_Letters{
    
    public static void main(String[] args) {
        String s="abc-xyz";
        System.out.println("result : "+reverseOnlyLetters(s));
    }

     public static String reverseOnlyLetters(String s) {
       int flag_i=0,flag_j=0;
       int i=0,j=s.length()-1;
        char [] arr=s.toCharArray();
         while (i < j) { 
            int chi = (int) arr[i]; 
            int chj = (int) arr[j]; 
            
            if (flag_i == 0) { 
                if ((chi >= 65 && chi <= 90) || (chi >= 97 && chi <= 122)) { 
                    flag_i = 1; 
                } else { 
                    i++; 
                } 
            } 
            
            if (flag_j == 0) { 
                if ((chj >= 65 && chj <= 90) || (chj >= 97 && chj <= 122)) { 
                    flag_j = 1; 
                } else { 
                    j--; 
                } 
            } 
            
            if (flag_i == 1 && flag_j == 1) { 
                flag_i = 0; 
                flag_j = 0; 
                char temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                i++; 
                j--; 
            } 
        } 

        String res= new String(arr);
        return res;
    }
}