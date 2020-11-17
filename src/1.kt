fun main() {
    val h1 = BMI()
    h1.height = 5
    h1.weight = 8

    val h2 = BMI()
    h2.height = 5
    h2.weight = 8

    println(h1 == h2)
    println(h1)
}
class BMI {

    var height: Int = 0
    var weight: Int = 0

    override fun equals(other: Any?): Boolean {
        if (other is BMI) {
            if (height * other.weight  == other.height *  weight) {
                return true
            }
        }
        return false

    }

    override fun toString(): String {
        return "$height . $weight"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }



}
