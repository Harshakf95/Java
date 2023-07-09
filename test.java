import java.util.*;
public class test 
{
    public static void main(String a[])
    {
        float eng,java,ds,hin,ca;
        double avg,total,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        System.out.println("Enter eng marks");
        eng=sc.nextFloat();
        System.out.println("Enter java marks");
        java=sc.nextFloat();
        System.out.println("Enter ds marks");
        ds=sc.nextFloat();
        System.out.println("Enter hin marks");
        hin=sc.nextFloat();
        System.out.println("Enter ca marks");
        ca=sc.nextFloat();
        total=eng+java+ds+hin+ca;
        avg=(total/5.0);
        per=(total/1500.0)*100;
        System.out.println("Total marks= "+total);
        System.out.println("Average marks= "+avg);
        System.out.println("Percentyage= "+per);
    }
}
