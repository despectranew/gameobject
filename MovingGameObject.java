public class MovingGameObject extends GameObject{

    public double getVelocityX() {
        return velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocity(double vx, double vy){
        velocityX = vx;
        velocityY = vy;
    }
    public double getSpeed() {
        return Math.sqrt(velocityX * velocityX + velocityY * velocityY);
    }

    void setSpeed(double speed) {
        if (speed == 0) {
            velocityX = 0;
            velocityY = 0;
            return;
        }
        double currentSpeed = getSpeed();
        double coefficient = speed / currentSpeed;
        velocityX *= coefficient;
        velocityY *= coefficient;
    }

    public void move() {
        x += velocityX;
        y += velocityY;
        while (x >= World.getWorld().getWidth()) x-= World.getWorld().getWidth();
        while (x < 0) x += World.getWorld().getWidth();
        while (y >= World.getWorld().getHeight()) y-= World.getWorld().getHeight();
        while (y < 0) y += World.getWorld().getHeight();
    }

    protected double velocityX;
    protected double velocityY;
    public MovingGameObject(double x, double y) {
        super(x, y);
    }
}
