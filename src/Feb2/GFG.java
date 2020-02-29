package Feb2;

public class GFG {
public static boolean isStringAllWhiteSpace (String str)
{
	if(str.trim().isEmpty())
		return true;
	else 
		return false;
	}

public static void main(String[] args)
{
String str1="Geekforgeek";
String str2="           ";
System.out.println("Is String["+str1+"]only whitespaace?"+isStringAllWhiteSpace(str1));
System.out.println("Is String["+str2+"]only whitespaace?"+isStringAllWhiteSpace(str2));
}

}
