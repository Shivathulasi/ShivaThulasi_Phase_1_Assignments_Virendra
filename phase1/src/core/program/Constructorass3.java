package core.program;

public class Constructorass3 {

  String name;
  int age;
  char section;
  char gender;
  int subject1;
  int subject2;
  int subject3;
	Constructorass3(String n, int a, char s, char g, int s1, int s2, int s3){
	 name = n;
	 age = a;
	 section = s;
	 gender = g;
	 subject1 = s1;
	 subject2 = s2;
	 subject3 = s3;
	 }
	 public int marks(){
	 return subject1+subject2+subject3;
	 }
	 public float percentage(){
	 return (marks()*100)/300;
	 }
	 public static void main(String[] args) {
	 Constructorass3 s1 = new Constructorass3("Thulasi", 24, 'A','M', 80,99,89);
	 Constructorass3 s2 = new Constructorass3("Keerthi", 20, 'B','M', 50,60,65);
	 Constructorass3 s3 = new Constructorass3("Hema", 23, 'A','M', 100,89,86);
	 Constructorass3 s4 = new Constructorass3("Uzma", 24, 'B','F', 79,98,87);
	 System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
	 System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
	 System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s3 " + s3.percentage());
	 System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s4 " + s4.percentage());
	 }
}
