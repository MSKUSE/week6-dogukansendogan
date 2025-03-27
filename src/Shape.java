public class Shape {
    private Point location;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation(){


        return location;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "location=" + location +
                '}';
    }

    public int area(){
        return 0;
    }

    public int perimeter(){
        return 0;
    }

    @Override
    public double  area() {
        return Math.PI = this.radius *this.radius;
    }
    }

