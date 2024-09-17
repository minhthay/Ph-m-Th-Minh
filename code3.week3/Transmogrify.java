public class Transmogrify {
    private String state;

    public Transmogrify() {
        this.state = "Normal";
    }

    public void transmogrify() {
        this.state = "Transmogrified";
        System.out.println("Object has been transmogrified!");
    }

    public String getState() {
        return state;
    }

    public static void main(String[] args) {
        Transmogrify obj = new Transmogrify();
        System.out.println("Initial state: " + obj.getState());
        obj.transmogrify();
        System.out.println("Current state: " + obj.getState());
    }
}
