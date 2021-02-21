public class Wall implements Obstacle {
    int size;

    public Wall(int size) {
        this.size = size;
    }

    @Override
    public boolean overcome(Movable movable) {
        return movable.jump(size);
    }
}
