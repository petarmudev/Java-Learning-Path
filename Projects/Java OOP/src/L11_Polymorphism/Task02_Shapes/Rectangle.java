package L11_Polymorphism.Task02_Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculateArea();
        this.calculatePerimeter();

    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        super.setArea(width * height);
        return super.getArea();
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2 * width + 2 * height);
        return super.getPerimeter();
    }
}