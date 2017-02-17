package Mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

interface Stack
	{
	 void push(int i);
	 int pop();
	}


class FixedStack implements Stack
	{
		int[] Stack;
		int top,size=5,ele;
	FixedStack()
	{
		Stack = new int[size];
		top=0;
	}
	
	
	public void push(int i) {
		// TODO Auto-generated method stub
		top++;
		if(top<=size)
		{
			Stack[top]=i;
		}
		else
		{
			System.out.println("Stack Overflow");
		}
		
		
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(top<0)
		{
			System.out.println("Stack Empty");
			return 0;
		}
		else
		{
			
			return Stack[top--];
		}
		
	}
	
	}

class VariableStack implements Stack
	{
	
	ArrayList<Integer> st;
	int ele,top;
	VariableStack(int size)
	{
		new ArrayList<Integer>(size);	
	}

	public void push(int i) 
	{
		// TODO Auto-generated method stub
		st.add(i);
		int top=st.size();
	}

	public int pop() {
		// TODO Auto-generated method stub
		Integer a = st.remove(top);
		top--;
		int ele=a.intValue(); 
		return  0 ;   // st.remove();
	}
	
	
	}


public class StackImplementation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int choice,elem,vr_size;
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Choose the type of stack implementation");
		System.out.println("1.Fixed size Stack /n2.Variable Size Stack");
		choice = br.read();
	
		switch(choice)
		{
		case '1' : System.out.println("You have Selected for Fixed Size Stack Implementation (fixed size = 5 elements)");
				 FixedStack fs = new FixedStack();
				 System.out.println("Enter the element");
				 do{
					 
					 elem=br.read();
					 fs.push(elem);
					 
					 System.out.println("Enter again yes or no (Y/N)");
//					 br.reset();
					 ch = (char)br.read();
				 }while((ch=='Y') || (ch=='y'));
				break;
		case '2' :  System.out.println("You have Selected for Variable Size Stack Implementation(it adjusts dynamically )");
				  System.out.println("Enter the size for stack");
	//			  br.reset();
				  vr_size = br.read();
				  VariableStack vs = new VariableStack(vr_size);
				  
		          System.out.println("Enter the element");
		          do{
		//        	  br.reset();
		        	  elem=br.read();
		        	  vs.push(elem);
			 
		        	  System.out.println("Enter again yes or no (Y/N)");
		  //      	  br.reset();
		        	  ch = (char) br.read();
		            }while((ch=='Y') || (ch=='y'));
		
				  break;
		}
		
		
	}

}
