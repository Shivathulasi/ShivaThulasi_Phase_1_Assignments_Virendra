package core.program;

public class Constructorass1 {

	public static void main(String[] args) {
		calculate(5,6);
		calculate(43.7f,6);
		calculate(5.55,6);
		}
	public static void calculate(int a, int b){
		System.out.println("The addition of two numbers is "  +a+b);
	}
	public static void calculate(float f, int r){
		System.out.println("Area of a circle  is " +f*r*r);
	}
	public static void calculate(double d, int c){
		System.out.println("Area of rectangle  is " +d*c);
	}
	

}
