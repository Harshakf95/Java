import java.util.Scanner;
public class tel 
{
    public static void main(String[] args) 
    {
        int numberofcalls;
        float phonebill;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of calss made this month: ");
        numberofcalls=sc.nextInt(); 
        if (numberofcalls<=60) 
            phonebill=14;
        else
        {
            numberofcalls=numberofcalls-60;
            phonebill=14+(float)(numberofcalls*0.12);
        }
        System.out.println("Bill= "+phonebill);        
    }    
}