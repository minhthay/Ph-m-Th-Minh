package Bai1;

public class PassObject {
	static void f(Number m) {
	m.i = 15;
}
	public static void main(String[] args) {
		
	    Number n = new Number();
		n.i = 14;
		f(n);
		System.out.println(n.i);
	}
}
//return value: 15
//Difference: PassObject trả về kết quả f()