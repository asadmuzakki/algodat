package JurnalPraktikumMod2;

public class Stack {
    Node top;
	   boolean isEmpty(){
	      return top == null;
	   }

	   void push(String elemen) {
	      Node baru = new Node(elemen);
	      if (isEmpty()) {
	         top = baru;
	         return;
	      }
	      baru.next = top;
	      top = baru;
	   }
	   String pop(){
	      if(isEmpty()){
	         return"";
	      }
	      String atas = top.elemen;
	      top = top.next;
	      return atas;
	   }
	   String gettop(){
	      return top.elemen;
	   }
}
