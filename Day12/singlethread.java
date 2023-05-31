package Day12;

import java.util.Scanner;

class Student1 extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Writing on the Board");
	}
}
class Student2 extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Looking at the window");
	}
}
class Student3 extends Thread{
	public void run() {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(n*3);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 public class singlethread {
	public static void main(String[] args) {
		Student1 s1= new Student1();
		Student2 s2= new Student2();
		Student3 s3= new Student3();
		
		s3.start();
		s1.start();
		s2.start();
		
		
		
	}
}
