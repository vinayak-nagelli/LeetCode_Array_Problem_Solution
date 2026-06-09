class Sum_Multiples{
    public static void main(String[] args) {
        System.out.println("Result : "+sumOfMultiples(7));
    }

     public static int sumOfMultiples(int n) {
        int sum=0;
        if(n<=2){
            return 0;
        }

        for(int i=3;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}