package L11_Polymorphism.Task02_Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    //TODO: Finish encapsulation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius ;
    }

    @Override
    public double calculatePerimeter() {

        return Math.PI * 2 * radius;
    }
}
