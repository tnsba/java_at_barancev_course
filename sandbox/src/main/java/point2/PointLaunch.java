package point2;

public class PointLaunch {

    public static void main(String[] args) {

        Point p1 = new Point(5, 6); //координаты точки 1
        Point p2 = new Point(1, 2); //координаты точки 2

        System.out.println("Расстояние между двумя точками = " + Point.distance(p1, p2));

    }

}
