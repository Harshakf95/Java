public class check 
{
    static void vowel_or_consonant(char y)
    {
        if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
            System.out.println("it is a vowel ");
        else
            System.out.println("it is a consonant");
    }
    public static void main(String[] args)
    {
        vowel_or_consonant('b');
        vowel_or_consonant('u');    
    }
}