import java.util.ArrayList;

public class World {

    private static World world;

    final private int width;
    final private int height;

    private ArrayList<GameObject> gameObjects;

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void addGameObject(GameObject go) {
        gameObjects.add(go);
    }

    public ArrayList<GameObject> getGameObjects(){
        return gameObjects;
    }

    private World(int width, int height) {
        this.height = height;
        this.width = width;
        gameObjects = new ArrayList<>();
    }

    public static World getWorld() {
        if (world == null) world = new World(1024, 128);
        return world;
    }

    public static double getDistance(GameObject go1, GameObject go2) {
        double f = (go2.getX() - go1.getX()) * (go2.getX() - go1.getX());
        double s = (go2.getY() - go1.getY()) * (go2.getY() - go1.getY());
        return Math.sqrt(f + s);
    }

    public void nextTick() {

    }


}
