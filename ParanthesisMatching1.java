import java.util.*;
class Node{
	int data;
	Node next;
}
public class ParanthesisMatching1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		//System.out.println(isBalance(s));
		if(isBalance(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
	public static boolean isBalance(String s){
		//Creating a LinkedList
		LinkedList list=new LinkedList();
		for(char ch:s.toCharArray()){
			//if any open brackets comes then we wil push them into stack
			if ((ch=='(')||(ch=='{')||(ch=='['))
				list.push(ch);
			else{
			//if we found same closing brackets at top then we will pop out else return false i.e it is not balances
			if (((ch==')')&&(list.stackTop()==(int)'('))||((ch==']')&&(list.stackTop()==(int)'['))||((ch=='}')&&(list.stackTop()==(int)'{')))
				list.pop();
			else
				return false;
		}}
		if (list.isEmpty())
			return true;
		else
			return false;
}}
class LinkedList{
	Node top;
	public void push(int data){
		Node node=new Node();
		if (node==null){
			System.out.println("OverFlow");
		}else{
			node.data=data;
			node.next=top;
			top=node;
		}
	}
	public void pop(){
		Node t;
		if(top==null){
			System.out.println("UnderFlow");
		}else{
			t=top;
			top=top.next;
			t=null;
		}
	}
	public int stackTop(){
		if (top==null)
			return 0;
		return top.data;
	}
	public boolean isEmpty(){
		if (top==null)
			return true;
		return false;
	}
}	
