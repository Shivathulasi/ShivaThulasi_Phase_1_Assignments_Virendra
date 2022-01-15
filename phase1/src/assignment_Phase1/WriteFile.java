package assignment_Phase1;
	import java.io.FileWriter;  
	public class WriteFile {
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("D:\\testout.txt");    
	           fw.write("Welcome to corejava.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }   

	}
