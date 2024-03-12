package L11_Polymorphism.Task02_Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
