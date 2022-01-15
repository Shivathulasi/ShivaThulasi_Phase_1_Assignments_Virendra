package core.program;

public class SleepThreadAss extends Thread {
		 public void run(){  
		  for(int i=1;i<3;i++){  
		    try{
		    		Thread.sleep(3000);  // 3000 miliseconds = 3 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		    System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		    System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		    System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		  }  
		 }
		     
	
		 
		 
		 public static void main(String args[]){  
		  SleepThread t1=new SleepThread();  
		  t1.setName("IT");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  SleepThread t2=new SleepThread();  
		  t2.setName("HR");
		  
		  SleepThread t3=new SleepThread(); 
		  t3.setName("Finance");
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t2.getState());
		  System.out.println(t3.getState());
		 }  
		}
