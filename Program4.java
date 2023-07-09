import java.util.*;
class fib 
{
	public static void main(String args[])
	{
		int i,s1=0,s2=1,s3,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(s1);
		System.out.println(s2);
		for(i=3;i<=n;i++)
		{
			s3=s1+s2;
			s1=s2;
			s2=s3;
			System.out.println(s3);
		}	
    }
}    