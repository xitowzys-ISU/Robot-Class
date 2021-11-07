package xitowzys.robotClass;

fun main(args: Array<String>) {
    val robot = Robot(0, 0, Direction.UP)
    moveRobot(robot, 3, 2)
}

fun moveRobot(robot: Robot, toX: Int, toY: Int) {
    while (!(toX == robot.x && toY == robot.y)) {
        when (robot.direction) {
            Direction.UP -> {
                if (robot.y < toY) while (robot.y != toY) robot.stepForward()
                if (robot.x < toX) robot.turnRight() else robot.turnLeft()
            }
            Direction.RIGHT -> {
                if (robot.x < toX) while (robot.x != toX) robot.stepForward()
                if (robot.y < toY) robot.turnLeft() else robot.turnRight()
            }
            Direction.DOWN -> {
                if (robot.y > toY) while (robot.y != toY) robot.stepForward()
                if (robot.x < toX) robot.turnLeft() else robot.turnRight()
            }
            Direction.LEFT -> {
                if (robot.x > toX) while (robot.x != toX) robot.stepForward()
                if (robot.y < toY) robot.turnRight() else robot.turnLeft()
            }
        }
    }
}