public class Digit_Frequency_Score {
    public static void main(String[] args) {
        
        System.out.println("result : "+digitFrequencyScore(122));
    }
     public static int digitFrequencyScore(int n) {
        
        int sum=0;
         while(n>0){
            int ldig=n%10;
            sum+=ldig;
            n/=10;

         }
         return sum;
    }


}
