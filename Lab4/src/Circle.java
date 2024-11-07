public class Circle extends Shape{
    private double radiuse;

    public Circle() {
    }

    public Circle(double radiuse) {
        this.radiuse = radiuse;
    }

    public Circle(int x, int y, double radiuse) {
        super(x, y);
        this.radiuse = radiuse;
    }

    public double getRadiuse() {
        return radiuse;
    }

    public void setRadiuse(double radiuse) {
        this.radiuse = radiuse;
    }

    @Override
    public double calculateArea() {
        double area = 3.14*Math.pow(radiuse,2);
        return Double.parseDouble(String.format("%.2f",area));
    }

    @Override
    public double calculateCircumference() {
          double circumference=2*3.14*radiuse;
          return Double.parseDouble(String.format("%.2f",circumference));
    }
}
