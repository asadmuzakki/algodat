package Modul2;

public class Jurnal2 {
	Stack angka = new Stack();
	Stack operator = new Stack();
	void inOperand(String data){
		for(int i = 0; i<data.length(); i++){
			char chr = data.charAt(i);
			if (chr == '+' || chr == '-' || chr == '/' || chr == '*' || chr == '(' || chr == ')'){
				operator.push(chr);
			}else {
				angka.push(chr);
			}
		}
	}
	public void InfixToPostfix(String data) {
	
	}
	public void InfixToPrefix(String data) {
	
	}
}
