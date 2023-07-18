import java.util.Scanner;
public class SI 
{
    public static void main(String[] args) 
    {
        float p,t,r,SI;
        try (Scanner op = new Scanner(System.in)) {
            System.out.print("Enter principle amount: ");
            p=op.nextFloat();
            System.out.print("Enter time: ");
            t=op.nextFloat();
            System.out.print("Enter rate: ");
            r=op.nextFloat();
        }
        SI=(p*t*r)/100;
        System.out.print("SI= "+SI);    
    }
}
