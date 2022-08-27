package com.ds.stacks;

/**
 * Working with Stack with dynamic size increment
 * @author Srikanta.ydon
 *
 */
public class MyStackImpl {

	private int stackSize;
	private int stackArr[];
	private int top;
	
	/**
	 * Always Stack must be created with a user defined size
	 * @param stackSize
	 */
	public MyStackImpl(int stackSize) {
		super();
		this.stackSize = stackSize;
		this.stackArr= new int[stackSize];
		this.top = -1;	//array starts with 0 so to make sure stack is empty the initial value of top must be -1
	}
	
	/**
	 * The following method will return wether 
	 * @return
	 */
	public boolean isStackFull(){
		return (top==stackSize-1);	//stackSize starts from zero(0) so top value need to count as -1
	}
	
	/**
	 * It returns weather the stack is empty or not 
	 * If the stack is empty then top value will be -1(initialized value)
	 * @return
	 */
	public boolean isStackEmpty(){
//		return(!this.isStackFull());	//tricky one, sorry about that. it shouldn't be like this.
		return(top== -1);
	}
	
	/**
	 * The below method will add an element to the stack 
	 * It throws Exception if the stack is full( for fixed size stack)
	 * for dynamic stack it will automatically increases the capacity
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) throws Exception {
		if (this.isStackFull()){
//			throw new Exception("Stack is full. Can not add more element");	//if the stack is not dynamic 
			System.out.println("Stack is full. increasing the stack Capacity");	//for dynamic stack it will automatically increases the capacity
			this.incrementStackCapacity();
		}
		System.out.println("Adding : "+entry);
		this.stackArr[++top] =entry;
	}
	
	/**
	 * If you are trying to pop then the top element will be removed
	 * if There is no element then it will throws Exception
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception{
		if (this.isStackEmpty())
			throw new Exception("The Stack is empty.");
		int entry=this.stackArr[top--];
		System.out.println("Removed : "+entry);
		return entry;
	}
	
	/**
	 * it will return the top element of stack without removing it
	 * @return
	 */
	public int peek(){
		return stackArr[top];
	}
	
	/**
	 * for dynamic stack this method increases the capacity by double 
	 */
	public void incrementStackCapacity(){
		int newStack[]=new int[this.stackSize*2];
		/*for (int i : this.stackArr){		//trying new things just
			int j=0;
			newStack[j++]=i;
		}*/
		for (int i=0; i<stackSize;i++){		//i<stackSize for stacksize 5 the i should count from 0 to 4
			newStack[i]=this.stackArr[i];
		}
		this.stackArr=newStack;
		this.stackSize=this.stackSize*2;
	}
}
