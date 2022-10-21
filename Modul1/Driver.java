package Modul1;

public class Driver {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		DoubleLinkedList list2 = new DoubleLinkedList();
		DoubleLinkedList list3 = new DoubleLinkedList();
		DoubleLinkedList merge = new DoubleLinkedList();
		list.add("Alita", 155, 33);
		list.add("Putri", 158, 34);
		list.add("Devian", 160, 36);
		list.add("Melki", 165, 40);
		list.add("Pande", 168, 51);
		list.add("Azzam", 170, 57);
		list.add("Weng", 182, 61);
		list.add("Jidan", 183, 62);
		System.out.println("KETIKA PENAMPILAN FEAST");
		list.print();
		list.delete("Devian");
		System.out.println("\nKETIKA DEVIAN KELUAR");
		list.print();
		list.addAfter("Dadi", 164, 37, "Melki");
		System.out.println("\nSETELAH DADI GANTIKAN DEVIAN");
		list.print();
		list.delete("Azzam");
		System.out.println("\nSETELAH AZZAM KELUAR BARISAN");
		list.print();
		list.addAfter("Agus", 169, 54, "Weng");
		System.out.println("\nSETELAH AGUS GANTIKAN AZZAM");
		list.print();
		
		System.out.println("\nBERTEDUH");
		list2.add("Dadi", 0,0);
		list2.add("Agus", 0,0);
		list2.add("Weng", 0,0);
		list2.add("Jidan", 0,0);
		list2.printList();
		System.out.println("\nTETAP MENONTON KONSER");
		list3.add("Alita", 0,0);
		list3.add("Putri", 0,0);
		list3.add("Melki", 0,0);
		list3.add("Permadi", 0,0);
		list3.printList();
		
		System.out.println("\nOUTPUT");
		merge.mergeList(list3, list2);
	}
}
