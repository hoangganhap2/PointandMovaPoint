public class MovablePointTest {
    public static void main(String[] args) {
        Point point = new Point(4,6);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(4,6,7,8);
        System.out.println(movablePoint.toString());
    }
}
