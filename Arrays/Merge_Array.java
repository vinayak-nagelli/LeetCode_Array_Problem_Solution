public class Merge_Array{


    public static void main(String[] args) {
        int ab[]={1,4,6};
        int ac[]={2,3,5};

        // mergearray(ab,ac);

    }

}


        
    // public static void mergearray(int[] ab, int[] ac) { 
    //     int[] array = new int[(ab.length + ac.length)]; 
    //     int i = 0, j = 0, k = 0; 

    //     // Phase 1: Compare and merge until one array is empty
    //     while (i < ab.length && j < ac.length) { 
    //         if (ab[i] < ac[j]) { 
    //             array[k] = ab[i]; 
    //             i++; 
    //         } else { 
    //             array[k] = ac[j]; 
    //             j++; 
    //         } 
    //         System.out.println(array[k] + " : ");
    //         k++; 
    //     } 

    //     // Phase 2: Copy remaining elements from array 'ab' (if any)
    //     while (i < ab.length) { 
    //         array[k] = ab[i]; 
    //         System.out.println(array[k] + " : ");
    //         i++; 
    //         k++; 
    //     } 

    //     // Phase 3: Copy remaining elements from array 'ac' (if any)
    //     while (j < ac.length) { 
    //         array[k] = ac[j]; 
    //         System.out.print(array[k] + " : ");
    //         j++; 
    //         k++; 
    //     } 
    // } 

