package core.program;
		public class SleepThread extends Thread {
			public void run(){  
				for (int i = 0; i < 3; i++)
				{
		 System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
		 System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread
		System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
		 System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or deadntThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
					  
			}
			}

		public static void main(String args[]){  
			  
			SleepThread m1=new SleepThread();  
			SleepThread m2=new SleepThread();  
			SleepThread m3=new SleepThread();
			  
			  m1.setName("IT");
			  m2.setName("finance");
			  m3.setName("HR");
			  m1.setPriority(Thread.MIN_PRIORITY);  
			  m2.setPriority(Thread.MAX_PRIORITY);  
			  m3.setPriority(Thread.NORM_PRIORITY); 
			  
			  
			  
			  m1.start();  
			  m2.start();  
			  m3.start();
			   
		}

		

	}


