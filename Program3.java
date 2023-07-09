class Program3
{
 public static void main(String args[])
  { 
   int m=0,n=0,o=0;
   int x = Integer.parseInt(args[0]);
   int y = Integer.parseInt(args[1]);
   while(x>0 && y>00)
   {
    m=x%10;
    n=y%10;
    o=o+(m*n);
    x=x/10;
    y=y/10;
   }
   System.out.println("sum of product of corresponding digits= "+o);
  }
}