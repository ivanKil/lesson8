public interface Movable {
    default boolean run(int distance) {
        if (getMaxRunDistance() >= distance) {
            System.out.println(getName() + " пробежал " + distance + " метров, потому что может " + getMaxRunDistance());
            return true;
        } else {
            System.out.println(getName() + " не смог пробежать " + distance + " метров, потому что может " + getMaxRunDistance());
            return false;
        }
    }

    default boolean jump(int distance) {
        if (getMaxJumpDistance() >= distance) {
            System.out.println(getName() + " прыгнул " + distance + " метров, потому что может " + getMaxJumpDistance());
            return true;
        } else {
            System.out.println(getName() + " не смог прыгнуть " + distance + " метров, потому что может " + getMaxJumpDistance());
            return false;
        }
    }

    int getMaxJumpDistance();

    int getMaxRunDistance();

    String getName();
}
