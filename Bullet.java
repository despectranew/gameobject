public class Bullet extends MovingGameObject{
    public Bullet (double x, double y, double vx, double vy) {
        super(x, y);
        setVelocity(vx, vy);
    }
}
