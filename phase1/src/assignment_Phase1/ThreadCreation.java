package assignment_Phase1;
public class ThreadCreation extends Thread{  
		
		public void run(){  
		  System.out.println("thread is running...");  
		}  
		
		public static void main(String args[]){  
		
		ThreadCreation t1=new ThreadCreation();  // Step 1: create the object of the class
		t1.start();                            // Step 2: starting the thread
	 }  
	}  
