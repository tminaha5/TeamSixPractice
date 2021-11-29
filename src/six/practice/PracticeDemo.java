package six.practice;

public class PracticeDemo {

	private int age;

	public static void main(String[] args) {
		System.out.println("This is our second practice");
		
		System.out.println("Homework Practice for Team 6");
		System.out.println("Great job");
		
		System.out.println("Trying again");
		
		System.out.println("Saranya practice");
		
		sum(5,10);
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + " + " + b + " = " + a+b);
		
	}

	public static void addNum(int s, int k) {
		System.out.println(s+k);
		System.out.println("Added new commet");
	}
	
	public static void getName(String name) {
		name = "Amanda";
		System.out.println(name);
	}

	public static void addNum(String apple, String Orange) {
		System.out.println(apple+Orange);
		System.out.println("practice,paractice");
	}
	public static void getnumber(int a, int b) {
		System.out.println( a + b);
	}
		
	


	public void getAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age; 
		
	}
	public static void groupSix(String name) {
		
		System.out.println("Does everyone like gitHub?");
	}
	public static void teamSix(String Hardwork) {
		System.out.println("Thank you team six for your hard work");
	}
}


