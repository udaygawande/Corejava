package Feb2;

public class FinallyExample {
int x=10;
int y=0;
int z=0;
{
try
{
z=x/y;	
}
catch(Exception e)
{
System.out.println("Exception"+e.getMessage());	
}
finally
{
System.out.println("Finally i Am");	
}

}
}
