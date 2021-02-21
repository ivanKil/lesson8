public class Les8 {

    public static void main(String[] args) {
        Movable movables[] = {new Human("Пётр Иванович", 10, 100),
                new Cat("Васька", 5, 20),
                new Robot("RB001", 1, 110),
                new Cat("Мурзик", 2, 200),};

        Obstacle obstacles[] = {new Treadmill(100), new Wall(1), new Wall(10)};

        for (Movable movable : movables) {
            for (Obstacle obs : obstacles) {
                if (!obs.overcome(movable)) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}