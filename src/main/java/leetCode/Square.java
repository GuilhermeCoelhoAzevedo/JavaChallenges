package leetCode;

public class Square{
    private double side = 0;
    private double area;

    public Square(double length){
        this.side = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}