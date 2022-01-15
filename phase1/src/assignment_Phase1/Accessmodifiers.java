package assignment_Phase1;
class Accessmodifier{
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 
public class Accessmodifiers{
		public static void main(String[] args) {
			
			//default
			System.out.println("Dafault Access Specifier");
			 Accessmodifier obj = new  Accessmodifier(); 		  
	        obj.display(); 

		}
	}
