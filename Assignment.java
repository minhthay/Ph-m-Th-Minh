package Bai1;

public class Assignment {
    public static void main(String[] args) {
		Number n1 = new Number();
		Number n2 = new Number();
		 n1.i = 2;
	     n2.i = 5;
	     n1.i = n2.i;
	     n2.i = 10;
	     System.out.println(n1.i);
	}
}
//value return: 5
//Difference: n1.i trả về kết quả của n2.i(sau khi n2.i đc gán giá trị cho n1.i)
