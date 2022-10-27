package Modul2;

public class Stack {
	Node top = null;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(Object data){
		Node newNode = new Node(data);
		if(isEmpty()){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
	}
	
	public Object pop(){
		Node temp;
		temp = top;
		top = top.next;
		return temp.item;
	}
	
	public void print(){
		if(isEmpty()){
			System.out.println("Stack Kosong");
		}else{
			Node curr;
			curr = top;
			while(curr != null){
				System.out.println(curr.item);
				curr = curr.next;
			}
		}
	}
	public void printList(){
	
	}
}
