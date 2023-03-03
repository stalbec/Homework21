public class Parallelepiped {
    private double height;
    private double length;
    private double width;

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return 2*((height * length) + (length * width) + (height * width));
    }

    public double getVolume(){
        return length*width* height;
    }
    }

