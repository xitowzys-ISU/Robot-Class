# Разработка класса Robot

Необходимо разработать класс **Robot** в соответствии с заданием на [сайте Stepik](https://stepik.org/lesson/12766/step/12?unit=3114) (курс по Java, но это не страшно). Реализуйте вне этого класса функцию `moveRobot(robot: Robot, toX: Int, toY: Int)`. Функция перемещает робота в заданную точку `(toX, toY)`.

Обратите внимание, что мы используем тип enum для указания направления. Двигать робота - `turnLeft()`, `turnRight()`, `stepForward()`. Эти методы вызываются у переменной **robot**, переданной в качестве параметра.

Демонстрация работы:

![Демонстрация](https://gitlab.com/ISU_Applied_Computer_Science/5th-semester/mobile-development/Robot-class/-/raw/main/raw/demo.png?inline=false)