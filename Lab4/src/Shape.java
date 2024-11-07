public abstract class Shape {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();

}
