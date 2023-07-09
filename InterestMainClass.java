abstract class Interest 
{ 
abstract void bankName(); 
abstract void rateOfInterest();
} 
class BankOfBaroda extends Interest 
{ 
void bankName() 
{ 
System.out.println("The bank name is Bank of Baroda."); 
} 
void rateOfInterest() 
{ 
System.out.println("Its rate of interest is: " + 6 + "% \n"); 
} 
} 
class PunjabNationalBank extends Interest 
{ 
void bankName() 
{ 
System.out.println("The bank name is Punjab National Bank."); 
}
void rateOfInterest() 
{ 
System.out.println("Its rate of interest is: " + 7.5 + "% \n"); 
} 
} 
class HDFCBank extends Interest 
{ 
void bankName() 
{ 
System.out.println("The bank name is HDFC Bank.");
} 
void rateOfInterest() 
{ 
System.out.println("Its rate of interest is: " + 8.3 + "% \n"); 
} 
} 
public class InterestMainClass 
{ 
// a static method for displaying rate of interest and 
// names of different banks 
static void display(Interest obj) 
{
obj.bankName(); 
// calling the method rateOfInterest() of the concerned class 
obj.rateOfInterest(); 
} 
public static void main(String argvs[]) 
{ 
BankOfBaroda barodaObj = new BankOfBaroda(); 
PunjabNationalBank pnbObj = new PunjabNationalBank(); 
HDFCBank hdfcObj = new HDFCBank(); 
display(barodaObj); 
display(pnbObj); 
display(hdfcObj); 
} 
}