package core.program;
import java.util.regex.*;  
	public class PhoneNoValidation{  
	public static boolean isValidMobileNo(String str)  
	{  
	 Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
	 Matcher match = ptrn.matcher(str);  
	 return (match.find() && match.group().equals(str));  
	}  
	 public static void main(String args[])  
	{        
	String str = "9701774557";  
	if (isValidMobileNo(str))  
	System.out.println("The mobile no is verified.");   
	else  
	System.out.println("The mobile is incorrect.");      
}
}
