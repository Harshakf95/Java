public class Swap 
{
    public static void main(String[] args)
    {
        float f=1.20f,s=2.45f;
        System.out.println("--Before Swap--");
        System.out.println("First Number= "+f);
        System.out.println("Second Number= "+s);
        float temp=f;
        f=s;
        s=temp;
        System.out.println("--After Swap--");
        System.out.println("First Number= "+f);
        System.out.println("Second Number= "+s);        


    }    
}
