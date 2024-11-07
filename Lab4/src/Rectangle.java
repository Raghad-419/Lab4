public class Rectangle extends Shape {
    private double hight;
    private double width ;

    public Rectangle() {
    }

    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public Rectangle(int x, int y, double hight, double width) {
        super(x, y);
        this.hight = hight;
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area= hight*width;
        return Double.parseDouble(String.format("%.2f",area));
    }

    @Override
    public double calculateCircumference() {
        double circumference= (hight+width)*2;
        return Double.parseDouble(String.format("%.2f",circumference));

    }
}
