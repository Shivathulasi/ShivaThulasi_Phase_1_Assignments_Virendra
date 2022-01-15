package assignment_Phase1;
import java.util.Scanner;
public class ArrayOfStrings{
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String lang[] = new String[5];
      System.out.println("Enter five Names:");
      for (int i = 0; i < 5; i++) {
         lang[i] = scan.nextLine();
      }
      System.out.println();
      System.out.println("The five names are:");
      for (int i = 0; i < 5; i++) {
         System.out.println(lang[i]);
      }
   }
}




