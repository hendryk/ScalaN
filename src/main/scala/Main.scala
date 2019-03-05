object Main extends App {
    println("Posadzili Bacę na skraju")

    def funkcja(x: Int, y: Int): Int = {
        x * y
    }

    def createErrorMessage(errorCode: Int): String = errorCode match {
        case 1 => "Błąd sieci"
        case 2 => "Błąd wejścia / wyjścia"
        case 3 => "Nieznany błąd"
    }

    println(createErrorMessage(1))

    val x = new Vector2D(1.0, 1.0)
    val y = new Vector2D(-1.0, 1.0)
    val z = x.magnify(2.0)

    println(z)

    val g = x.magnify(3.0) - (x - y).magnify(3.0)
    println(g)
}


class Vector2D(val x: Double, val y: Double) {

    def magnify(amt: Double): Vector2D = {
        new Vector2D(x * amt, y * amt)
    }

    def -(b: Vector2D): Vector2D = {
        new Vector2D(this.x - b.x, this.y - b.y)
    }

    def +(b: Vector2D): Vector2D = {
        new Vector2D(this.x + b.x, this.y + b.y)
    }

    override def toString: String = s"Vector2d($x, $y)"
}