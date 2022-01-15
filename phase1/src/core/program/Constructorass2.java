package core.program;

public class Constructorass2{
	int side;
    float radius;
    int length;
    int breadth;
    Constructorass2(){
    }
    Constructorass2(int s) {
     side = s;
    }
    Constructorass2(float r){
    radius =r;
    }
    Constructorass2(int l, int b){
    length = l;
    breadth= b;
    }
    public float areaofcircle() {
    return 3.14f*radius*radius;
    }
	public int areaofsquare(){
    return side*side;
    }
    public int areaofrectangle(){
    	return length*breadth;
    }
    public int area(int height, int base){
    	return (height*base)/2;
    }
    public float area(float diagonall, Float diagonal2){
    return (diagonall*diagonal2)/2;
    }
   public static void main(String[] args){
   Constructorass2 circle = new Constructorass2(98.98f);
   Constructorass2 square = new Constructorass2(20);
   Constructorass2 rectangle = new Constructorass2(10,20);
   Constructorass2 traingle = new Constructorass2();
   Constructorass2 rhombus = new Constructorass2();
   System.out.println("Area of circle:"+ circle.areaofcircle());
   System.out.println("Area of square:"+ square.areaofsquare());
   System.out.println("Area of rectangle:"+ rectangle.areaofrectangle());
   System.out.println("Area of traingle:"+ traingle.area(39, 3));
   System.out.println("Area of rhombus:"+ rhombus.area(44.09f,77.76f));
   }
    }
	

	
