//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.setRadiuse(2);
        System.out.println("Radius= "+circle.getRadiuse());
        System.out.println("Circle area= "+circle.calculateArea());
        System.out.println("Circle circumference= "+circle.calculateCircumference());
        System.out.println("*************************");
        Rectangle rectangle = new Rectangle();
        rectangle.setHight(2);
        rectangle.setWidth(3);
        System.out.println("Rectangle height= "+rectangle.getHight());
        System.out.println("Rectangle width= "+rectangle.getWidth());
        System.out.println("Rectangle area= "+rectangle.calculateArea());
        System.out.println("Rectangle perimeter= "+rectangle.calculateCircumference());
        System.out.println("*************************");
        Triangle triangle =new Triangle(3,3);
        System.out.println("Triangle height= "+triangle.getHeight());
        System.out.println("Triangle base= "+triangle.getBase());
        System.out.println("Triangle area= "+triangle.calculateArea());
        System.out.println("Triangle perimeter= "+triangle.calculateCircumference());
        System.out.println("*************************");
        System.out.println("Update Triangle");
        triangle.setBase(2);
        triangle.setHeight(3);
        System.out.println("Triangle height= "+triangle.getHeight());
        System.out.println("Triangle base= "+triangle.getBase());
        System.out.println("Triangle area= "+triangle.calculateArea());
        System.out.println("Triangle perimeter= "+triangle.calculateCircumference());


    }
}