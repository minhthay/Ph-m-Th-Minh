public class GlyphTest {
    private String shape;

    public GlyphTest(String shape) {
        this.shape = shape;
    }

    public void displayGlyph() {
        System.out.println("Displaying glyph of shape: " + shape);
    }

    public static void main(String[] args) {
        GlyphTest glyph = new GlyphTest("Circle");
        glyph.displayGlyph();
    }
}
