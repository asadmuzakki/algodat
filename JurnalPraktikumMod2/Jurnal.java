package JurnalPraktikumMod2;

public class Jurnal {
    static int priority(char operator) {
        if (operator == '+' || operator == '-') {
           return 1;
        }
        if (operator == '*' || operator == '/') {
           return 2;
        }
        if (operator == '^') {
           return 3;
        }
        return -1;
     }
   
     static void toPrefix(String operasi) {
        String tmp = "";
        Stack temp = new Stack();
        for (Character now : operasi.toCharArray()) {
           if (now == '+' || now == '-' || now == '/' || now == '*') {
              String opand1 = temp.pop();
              String opand2 = temp.pop();
              tmp = "";
              tmp += now;
              tmp+=opand2;
              tmp+=opand1;
              temp.push(tmp);
           } 
           
           else {
              tmp = "";
              tmp += now;
              temp.push(tmp);
           }
        }
        System.out.println("Notasi Prefix : " + temp.top.elemen);
        }
  public static void main(String[] args) {
      Stack operator = new Stack();
      Stack operand = new Stack();

      String operasi = "(A+B)*C-(D-E)*(F+G)";
      String hasil = "";
      String tmp = "";
      
      for (int i = 0; i < operasi.length(); i++) {
          char ok = operasi.charAt(i);
          if (ok == ('+') || ok == ('*') || ok == ('-') || ok == ('/')) {
              while (operator.top != null && priority(operator.gettop().charAt(0)) >= priority(ok)) {
                  hasil += operator.pop();
              }
              
              tmp = "";
              tmp += ok;
              operator.push(tmp);
          }
          else if (ok == '(') {
              tmp = "";
              tmp += ok;
              operator.push(tmp);
          } 
          else if (ok == ')') {
              while (operator.gettop().charAt(0) != '(') {
                  hasil += operator.pop();
              }
              operator.pop();
          } 
          else {
              hasil += ok;
          }
      }
      while (operator.top != null) {
          hasil = hasil + operator.pop();
      }
      System.out.println ("Notasi infix : (A+B)*C-(D-E)*(F+G)");
      System.out.println("Notasi Postfix : " + hasil);
      toPrefix(hasil);
  }
}
