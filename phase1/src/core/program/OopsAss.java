package core.program;

public class OopsAss {
	abstract public class Vehicle 
	{
	 int speed;
	 long distance;
	 abstract void run();
	 abstract void stop();
	 public void fuel(int x, int y)
	{
			
	}
	public void fuel(float x, String y)
	{
			
	}
	public void fuel(char x,int y)
	{
			
	}
	public Vehicle()
	{
	System.out.println("Default constructor");
	}
	Vehicle(int x,int y)
	{
			
	}
	void display()
	{
			
	}
	abstract class two extends Vehicle
	{
	abstract void run();
	abstract void stop();
	int speed=40;
	long distance=450;
	int notire=2;
	public two(){
	System.out.println("Default");
	}
	void display()
	{
	 System.out.println("No.of tires " +notire + "Speed "+speed + "Distance "+distance);
	 System.out.println("Variables of Parent Class: " +super.speed +super.distance);
		}
	 }
			}
	public static void main(String[] args) {
		

	}
}
