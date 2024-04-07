public class GameObject {
    protected double x;
    protected double y;
    protected int r;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.r = 30;
        World.getWorld().addGameObject(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getRadius() {
        return r;
    }
}
