package Day8;

public class Constructor {
	private String name,dept;
	private int age;
	public Constructor (String name,int age,String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
		
	}
	private void print() {
		
		System.out.println("Student name is "+this.name);
		System.out.println("Student age is "+ this.age);
		System.out.println("Student department is "+this.dept);
	}
	public static void main(String[] args)
	{
		Constructor c= new Constructor("Shiak Younus", 20, "CSE");
		Constructor d=new Constructor("Shaik Saleem", 22, "CSE");
		c.print();
		System.out.println();
		d.print();
	}
}
