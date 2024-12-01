package tr.edu.ozyegin.cs101.geometry2d;

public class Line {
    // We are going to represent a line with parameters
// a, b, and c where
// ax + by + c = 0
    private double a;
    private double b;
    private double c;

    /**
     * Create a line with the equation ax + by + c = 0
     *
     * @param a the parameter a
     * @param b the parameter b
     * @param c the parameter c
     */
    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Create a line with the equation y = mx + n
     *
     * @param m slope of the line
     * @param n y-intercept of the line
     */
    public Line(double m, double n) {
        this.a = m;
        this.b = -1.0;
        this.c = n;
    }

    /**
     * Create a line that goes through both
     * points p and q.
     *
     * @param p first point
     * @param q second point
     */
    public Line(Point p, Point q) {
// TO BE IMPLEMENTED
        this.a = q.getY()-p.getY();
        this.b = q.getX()-p.getX();
        this.c = p.getX() * q.getY() - q.getX() * p.getY();

    }

    /**
     * The parameter a for the equation ax + by + c = 0
     *
     * @return parameter a
     */
    public double getA() {
        return a;
    }

    /**
     * The parameter b for the equation ax + by + c = 0
     *
     * @return parameter b
     */
    public double getB() {
        return b;
    }

    /**
     * The parameter c for the equation ax + by + c = 0
     *
     * @return parameter c
     */
    public double getC() {
        return c;
    }

    /**
     * The slope of the line, m where y = mx + n
     *
     * @return m, the slope of the line
     */
    public double getM() {
        return -a / b;
    }

    /**
     * The y-intercept of the line, n where y = mx + n
     *
     * @return n, the y-intercept of the line.
     */
    public double getN() {
        return -c / b;
    }

    /**
     * Checks if given point p lies on this line or not.
     * If it does, returns true. Otherwise, returns false.
     *
     * @param p the point to be checked
     * @return true if p lies on this line
     */
    public boolean goesThrough(Point p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }

    /**
     * Finds the intersection point of this line and
     * the line other given as the parameter.
     * <p>
     * Returns null if this line and the other line
     * are parallel.
     *
     * @param other the other line
     * @return the intersection as a Point, null if parallel
     */
    public Point intersection(Line other) {
// TO BE IMPLEMENTED
        if(){


        }
        else{
            return null;
        }
    }
}