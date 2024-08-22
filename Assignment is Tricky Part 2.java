public class Assignment2 {
    public static void main(String[] args) {
        MyNumber n1 = new MyNumber();
        MyNumber n2 = new MyNumber();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;  

        n2.i = 10;
        System.out.println("n1.i after n2.i = 10: " + n1.i); 
        n1.i = 20;
        System.out.println("n2.i after n1.i = 20: " + n2.i); 
    }
}

class MyNumber {
    int i;
}