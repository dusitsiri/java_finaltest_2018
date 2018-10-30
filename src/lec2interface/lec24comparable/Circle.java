package lec2interface.lec24comparable;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        // เปรียบเทียบ this object กับ other object ใน parameter
        if (this.radius < other.radius) return -1;
        if (this.radius > other.radius) return 1;
        return 0; // this.radius == other.radius
        //return this.radius - o.radius;
    }
}
