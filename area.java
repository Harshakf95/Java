class area
{
void area(float x) 
{ 
System.out.println("Area of the circle is:"+3.14*x*x); 
} 
void area(float x,float y) 
{ 
System.out.println("Area of the rectangle:"+x*y); 
}
void area(int x,int y) 
{ 
System.out.println("Area of the Triangle:"+0.5*x*y); 
} 
public static void main(String args[]) 
{ 
area circle=new area(); 
area rectangle=new area(); 
area triangle=new area(); 
circle.area(2.2f); 
rectangle.area(2.4f,7.0f); 
triangle.area(2,4); 
} 
}