public class Triangle extends Shape{
private double height;
private double base ;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(int x, int y, double height, double base) {
        super(x, y);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area= (base*height)/2;
        return Double.parseDouble(String.format("%.2f",area));
    }

    @Override
    public double calculateCircumference() {
        if(height==base){
        double perimeter =height*3;
        return Double.parseDouble(String.format("%.2f",perimeter));}
        else {
            System.out.println("Calculating the perimeter of a triangle is limited to equilateral triangles only.");
            return 0.0;}

    }
}
