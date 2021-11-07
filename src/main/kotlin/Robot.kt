package xitowzys.robotClass

class Robot(
    var x: Int,
    var y: Int,
    var direction: Direction
) {

    fun turnLeft() {
        direction = when (direction) {
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.UP -> Direction.LEFT
        }

        println("Вызван метод turnRight(). Направление взгляда: ${direction.name}")
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
            Direction.DOWN -> Direction.LEFT
            Direction.UP -> Direction.RIGHT
        }

        println("Вызван метод turnRight(). Направление взгляда: ${direction.name}")
    }

    fun stepForward() {
        when (direction) {
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
            Direction.DOWN -> y--
            Direction.UP -> y++
        }

        println("Вызван метод stepForward() координаты x: $x; y: $y")
    }
}