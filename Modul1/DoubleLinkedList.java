package Modul1;

public class DoubleLinkedList {
	Node head, tail, curr;
	public void add(String nama, int tinggi, int power) {
		Node newNode = new Node(nama, tinggi, power);
		if(head == null){
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	public void addAfter(String nama, int tinggi, int power, String acuan){
		Node newNode = new Node(nama, tinggi, power);
		curr = head;
		while(curr.next != null){
			if(curr.next.nama == acuan){
				newNode.next = curr.next;
				curr.next.prev = newNode;
				curr.next = newNode;
				newNode.prev = curr;
				break;
			}
			curr = curr.next;
		}
	}
	public void delFirst() {
		head = head.next;
	}
	public void delete(String del) {
		curr = head;
		if (head.nama == del) {
			delFirst();
		} else {
			while (curr.next != null) {
				if (curr.next.nama == del) {
					curr.next = curr.next.next;
					curr.next.prev = curr;
					break;
				}
				curr = curr.next;
			}
		}
	}
	public void print(){
		curr = head;
		if(head == null){
			System.out.println("List Empty");
		}
		while(curr != null){
			System.out.println("Nama : "+curr.nama + ", Height : "+curr.tinggiBadan + ", Power : " +curr.power);
			curr = curr.next;
		}
	}
	public void printList(){
		curr = head;
		while(curr != null){
			if(curr.next != null){
				System.out.print(curr.nama + " -> ");
			}else{
				System.out.print(curr.nama);
			}
			curr = curr.next;
		}
	}
	public void mergeList(DoubleLinkedList list1, DoubleLinkedList list2){
		list1.tail.next = list2.head;
		list2.head.prev = list1.tail;
		
		curr = list1.head;
		while(curr != null){
			if(curr.next != null){
				System.out.print(curr.nama + " -> ");
			}else{
				System.out.print(curr.nama);
			}
			curr = curr.next;
		}
	}
}
