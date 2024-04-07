import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner jin = new Scanner(System.in);
        int n = jin.nextInt();
        var arr = new ArrayList<MovingGameObject>();

        for (int i = 0; i < n; i++) {
            double x = jin.nextDouble();
            double y = jin.nextDouble();
            double vx = jin.nextDouble();
            double vy = jin.nextDouble();
            var movingGameObject = new MovingGameObject(x, y);
            movingGameObject.setVelocity(vx, vy);
            arr.add(movingGameObject);
        }
        int q = jin.nextInt();

        for (int i = 0; i < q; i++) {
            int t = jin.nextInt();
            switch (t) {
                case 1 -> {
                    int k = jin.nextInt();
                    double speed = jin.nextDouble();
                    arr.get(k).setSpeed(speed);
                }
                case 2 -> {
                    int k = jin.nextInt();
                    var obj = arr.get(k);
                    System.out.printf("%#.06f %#.06f %#.06f\n", obj.getVelocityX(), obj.getVelocityY(), obj.getSpeed());
                }
                case 3 -> {

                }
            }
            for (var obj: arr) {
                obj.move();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%#.06f %#.06f\n", arr.get(i).getX(), arr.get(i).getY());
        }*/

        ArrayList<GeometryShapes.Shape> obj = new ArrayList<>();
        obj.add(new GeometryShapes.Shape());
        obj.add(new GeometryShapes.Polygon());
        obj.add(new GeometryShapes.Triangle());
        obj.add(new GeometryShapes.IsoscelesTriangle());
        obj.add(new GeometryShapes.EquilateralTriangle());
        obj.add(new GeometryShapes.Quadrilateral());
        obj.add(new GeometryShapes.Rectangle());
        obj.add(new GeometryShapes.Parallelogram());
        obj.add(new GeometryShapes.Square());

        ArrayList<GeometryShapes.Polygon> obj1 = new ArrayList<>();
        obj1.add(new GeometryShapes.Polygon());
        obj1.add(new GeometryShapes.Triangle());
        obj1.add(new GeometryShapes.IsoscelesTriangle());
        obj1.add(new GeometryShapes.EquilateralTriangle());
        obj1.add(new GeometryShapes.Quadrilateral());
        obj1.add(new GeometryShapes.Rectangle());
        obj1.add(new GeometryShapes.Parallelogram());
        obj1.add(new GeometryShapes.Square());

        ArrayList<GeometryShapes.Triangle> obj2 = new ArrayList<>();
        obj2.add(new GeometryShapes.Triangle());
        obj2.add(new GeometryShapes.IsoscelesTriangle());
        obj2.add(new GeometryShapes.EquilateralTriangle());

        ArrayList<GeometryShapes.Quadrilateral> obj3 = new ArrayList<>();
        obj3.add(new GeometryShapes.Quadrilateral());
        obj3.add(new GeometryShapes.Rectangle());
        obj3.add(new GeometryShapes.Parallelogram());
        obj3.add(new GeometryShapes.Square());

        ArrayList<GeometryShapes.Rectangle> obj4 = new ArrayList<>();
        obj4.add(new GeometryShapes.Rectangle());
        obj4.add(new GeometryShapes.Square());

        System.out.println("OK");

    }


}