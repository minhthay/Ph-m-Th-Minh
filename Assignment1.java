package Bai1;

public class Assignment1 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        n2.i = 10;// what is n1.i?
        n1.i = 20;// what is n2.i?
        System.out.println(n1.i);// return value: 20
        System.out.println(n2.i);// return value: 20
        }
}
// Difference: n1.i== n2.i (vì gán đối tượng n2 cho n1);
