package Modul2;

public class Driver {
	public static void main(String[] args) {
		Stack obj = new Stack();
		Stack obj2 = new Stack();
		obj.push("Goku");
		obj.push("Anya");
		obj.push("Nagato");
		obj.push("Denji");
		obj.push("Loid");
		System.out.println("Stack Sebelum  elemen dihapus");
		obj.print();
		
		obj2.push(obj.pop());
		obj2.push(obj.pop());
		obj2.push(obj.pop());
		obj.pop();
		
		obj.push(obj2.pop());
		obj.push(obj2.pop());
		obj.push(obj2.pop());
		System.out.println("\nStack setelah elemen dihapus");
		obj.print();
		obj2.print();
	}
}
