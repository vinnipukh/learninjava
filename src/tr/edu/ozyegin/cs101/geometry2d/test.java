package tr.edu.ozyegin.cs101.geometry2d;

public class test {
    public static void main(String[] args) {
        Point p1 = new Point(0,4);
        Point p2 = new Point(6,8);
        Point p3 = new Point(4,3);
        Point p4 = new Point(8,6);
        System.out.println("X value of p1: "+p1.getX()+" Y value of p1: "+p1.getY());
        System.out.println("X value of p2: "+p2.getX()+" Y value of p2: "+p2.getY());

        Line line1 = new Line(0,4);
        if(line1.goesThrough(p1)){
            System.out.print("line1 passes through "+p1.getX()+","+p1.getY());

        }
        Line line2 = new Line(p3,p4);
        if (line1.intersection(line2) == null){
            System.out.println("line1 and line2 are parallel");
        }
        else {
            System.out.println("\n lines intersect at "+line1.intersection(line2).getX()+","+line1.intersection(line2).getY());


        }





    }
}
