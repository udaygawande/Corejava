package Feb2;

import java.io.File;
import java.io.FileInputStream;

public class ThrowExp 
{
	public static void main(String[] args) throws Exception
	{
		myException("Chrome");
	}
public static void myException(String path) throws Exception{
	File fh=new File(path);	
FileInputStream io=new FileInputStream(fh);
}
public static void myException1(String browsername) throws Exception
{
if(browsername.equals("chrome"))
{
	


}
}




}
