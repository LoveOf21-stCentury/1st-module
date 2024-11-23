package secondModule.tasks;

public class Third {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void move(Third robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        if (toX > currentX) {
            while (currentDirection != Direction.RIGHT) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
        } else if (toX < currentX) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
        }

        while (currentX != toX) {
            robot.stepForward();
            currentX = robot.getX();
        }

        if (toY > currentY) {
            while (currentDirection != Direction.UP) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
        } else if (toY < currentY) {
            while (currentDirection != Direction.DOWN) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
        }

        while (currentY != toY){
            robot.stepForward();
            currentY = robot.getY();
        }
    }

}
