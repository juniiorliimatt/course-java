package curso.entities;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        var w = Math.pow(this.width, 2);
        var h = Math.pow(this.height, 2);
        return Math.sqrt((w + h));
    }

    @Override
    public String toString() {
        return "\nAREA = " + String.format("%.2f", this.area()) + "\nPERIMETER = " + String.format("%.2f",
                this.perimeter()) + "\nDIAGONAL = " + String.format("%.2f", this.diagonal());
    }
}
