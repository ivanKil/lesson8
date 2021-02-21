//скелетная реализация запрещена, поэтому дублирование в Human, Cat и Robot
public class Cat implements Movable {
    private int maxJumpDistance;
    private int maxRunDistance;
    private String name;

    Cat(String name, int maxJumpDistance, int maxRunDistance) {
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
