package assignment_Phase1;
class MultiThreading_Synchronized {  
		void printTable(int n){
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  class MyThread1 extends Thread{  
			MultiThreading_Synchronized t;  
		MyThread1(MultiThreading_Synchronized  t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
			MultiThreading_Synchronized t;  
		MyThread2(MultiThreading_Synchronized  t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
	    class MultiThreading_Synchronized1{  
		public static void main(String args[]){  
			MultiThreading_Synchronized  obj = new MultiThreading_Synchronized(); 
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
		}
