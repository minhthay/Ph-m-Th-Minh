package week22;


    public class MyClass {
        // Field initialized at the point of definition
        private String field1 = "Initialized at definition";
    
        // Field initialized by the constructor
        private String field2;
    
        // Constructor
        public MyClass(String field2) {
            this.field2 = field2;
        }
    
        // Getters for both fields
        public String getField1() {
            return field1;
        }
    
        public String getField2() {
            return field2;
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass("Initialized by constructor");
    
            System.out.println("Field1: " + obj.getField1());
            System.out.println("Field2: " + obj.getField2());
        }
    }
    
/*Field1: Initialized at definition
Field2: Initialized by constructor */
