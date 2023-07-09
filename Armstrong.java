public class Armstrong 
{
    public static void main(String args[])
    {
        int n,b,i,sum;
        System.out.println("Armstrong number from 1 to 1000");
        for(i=1;i<=1000;i++)
        {
            sum=0;
            n=i;
            while(n>0)
            {
                b=n%10;
                sum=sum+(b*b*b);
                n=n/10;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
        }
    }    
}