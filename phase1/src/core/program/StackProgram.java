package core.program;

	import java.util.Stack;

	public class StackProgram {

	public static void main(String[] args)
	{

	Stack stack1 = new Stack();

	    // Initialization of Stack using Generics
	    Stack<String> stack2 = new Stack<String>();

	    // pushing the elements
	    stack1.push("apple");
	    stack1.push("mango");
	    stack1.push("goa");
	    stack1.push("orange");
	    stack1.push("bananna");
	    stack1.push("hyderabad");
	    stack1.push("delhi");
	    stack1.push("vizag");
	    stack1.push("mumbai");
	    stack1.push("10");
	    stack1.push("11");
	    stack1.push("12");
	    stack1.push("13");
	    stack1.push("h");
	    stack1.push("y");
	     
	   
	    System.out.println(stack1);
	   
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	   
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("after removing 2 elements"+ " stack-1 is: " + stack1.peek());
	   
	    System.out.println("index of element inside the stack "+ stack1.indexOf("apple"));
	    System.out.println("index of element  inside the stack "+ stack1.indexOf("delhi"));

	}

}
