package Day11;

import java.util.Arrays;
import java.util.Scanner;


public class stackArray {
	static int[] array=new int[1];
	int rear=-1;

	public  void push(int value) {
		// TODO Auto-generated method stub
		rear++;
		array=Arrays.copyOf(array, rear+1);
			array[rear]=value;
			
	}
	public  void pop() {
		if(rear==-1) {
			System.out.println("Stack is Empty.");
		}
		else {
			rear--;
			array=Arrays.copyOf(array, rear+1);
		}
		
	}
	public  void print() {
		System.out.println(Arrays.toString(array));
		
	}
	
		
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			stackArray stack= new stackArray();
			int n,val;
			System.out.println("1.Stack push");
			System.out.println("2.Stack pop");
			System.out.println("3.Stack Print");
			System.out.println("4.Exit");
			while(true) {
				n=sc.nextInt();
				if(n==1) {
					val=sc.nextInt();
					stack.push(val);
				}
				else if(n==2) {
					stack.pop();
				}
				else if(n==3) {
					stack.print();
				}
				else {
					break;
				}
				
			}
			
		}
		
	}

