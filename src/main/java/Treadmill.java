public class Treadmill implements Obstacle {
    int size;

    public Treadmill(int size) {
        this.size = size;
    }

    @Override
    public boolean overcome(Movable movable) {
        return movable.run(size);
    }
}