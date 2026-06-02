public class Reverse_Vowels_of_a_String{

    public static void main(String[] args) {
        String name="VinaYAk";
        System.out.println("answer : "+reverseVowels(name));

    }


     public static String reverseVowels(String s) {

        char [] arr=s.toCharArray();

        int front=0,back=arr.length-1;
        int flagi=0,flagj=0;

        while(front<back){

            if(arr[front]=='a'||arr[front]=='A'||arr[front]=='e'||arr[front]=='E'||arr[front]=='i'||arr[front]=='I'||arr[front]=='O'||arr[front]=='o'||arr[front]=='u'||arr[front]=='U')
            {
                flagi=1;
            }
            else{
                front++;
            }

            if(arr[back]=='a'||arr[back]=='A'||arr[back]=='e'||arr[back]=='E'||arr[back]=='i'||arr[back]=='I'||arr[back]=='O'||arr[back]=='o'||arr[back]=='u'||arr[back]=='U')
            {
                flagj=1;
            }
            else{
                back--;
            }
            if(flagi==1&&flagj==1){
                char temp=arr[front];
                arr[front]=arr[back];
                arr[back]=temp;
                flagi=0;flagj=0;
                front++;back--;
            }

        }
      
        String res=new String(arr);



        return res;

        
    }

}