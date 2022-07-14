package learn.java;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        //A(0,0)
        //B(x,y)
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(Point second) {
        //A(0,0)
        //B(x,y)
        double X = (x - second.getX()) * (x - second.getX());
        double Y = (y -  second.getY()) * (y -  second.getY());
        return Math.sqrt(X + Y);
    }

    public double distance(int X, int Y) {
        double first = (x - X) * (x - X);
        double second = (y - Y) * (y - Y);
        return Math.sqrt(first + second);
    }
}
