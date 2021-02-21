//скелетная реализация запрещена, поэтому дублирование в Human, Cat и Robot
public class Robot implements Movable {
    private int maxJumpDistance;
    private int maxRunDistance;
    private String name;

    Robot(String name, int maxJumpDistance, int maxRunDistance) {
        this.maxJumpDistance = maxJumpDistance;
        this.maxRunDistance = maxRunDistance;
        this.name = name;
    }

    @Override
    public int getMaxJumpDistance() {
        return maxJumpDistance;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
