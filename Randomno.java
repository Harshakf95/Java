import java.io.IOException;
import java.util.*;
import java.io.*;
public class Randomno 
{
public static void main(String[] args) 
{
Random obj = new Random();
for(int i=0;i<50;i++)
{
float num = obj.nextFloat()*50;
if(num<50)
num+=50;
System.out.println(num); 
}
} 
}