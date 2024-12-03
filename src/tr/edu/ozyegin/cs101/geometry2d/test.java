// this class is designed to test the point and line classes
package tr.edu.ozyegin.cs101.geometry2d;

public class test {
    public static void main(String[] args) {
        // Test constructor with points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line = new Line(p1, p2);

        assert line.getA() == 2 : "Test failed: getA()";
        assert line.getB() == 2 : "Test failed: getB()";
        assert line.getC() == -2 : "Test failed: getC()";

        //  goesThrough method test
        Line line1 = new Line(1, -1, 0);
        Point p = new Point(1, 1);
        assert line1.goesThrough(p) : "Test failed: goesThrough()";

        //  intersection method test
        Line line2 = new Line(1, 1);
        Point intersection = line1.intersection(line2);
        assert intersection != null : "Test failed: intersection() is null";
        assert intersection.getX() == 1 : "Test failed: intersection().getX()";
        assert intersection.getY() == 1 : "Test failed: intersection().getY()";

        //  parallel line test
        Line line3 = new Line(1, -1, 1);
        assert line1.intersection(line3) == null : "Test failed: intersection() for parallel lines";

        System.out.println("All tests passed.");
    }
}
