public class PrimeNumber 
{
    public static void main(String args[])
    {
        int n=100,i,j;
        System.out.println("Prime Number up to 50:\n");
        for(i=2;i<=n;i++)
        {
            boolean a=true;
            for(j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    a=false;
                    break;
                }
            }
            if(a==true)
            {
                System.out.println(" "+i);
            }
        }
    }    
}
