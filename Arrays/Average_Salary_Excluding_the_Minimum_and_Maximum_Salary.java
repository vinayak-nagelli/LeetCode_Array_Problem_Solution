public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static void main(String[] args) {
        int salary []={4000,3000,1000,2000};
        System.out.println("average : "+average(salary));
    }

    public static double average(int[] salary) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,n=salary.length;
        double avg,sum=0;

        for(int i=0;i<n;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
            sum+=salary[i];
        }
        System.out.println("max : "+max+"min : "+min);
        avg=(sum-max-min)/(n-2);
        return avg;
    }
}
