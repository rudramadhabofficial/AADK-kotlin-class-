fun main() {
    println("Enter the number of subjects:")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Invalid number of subjects")
        return
    }

    println("Number of subjects: $n")

    val marks = IntArray(n)
    var total = 0

    println("Enter the marks for $n subjects:")
    for (i in 0 until n) {
        print("Subject ${i + 1}: ")
        val m = readLine()?.toIntOrNull()

        if (m == null || m < 0 || m > 100) {
            println("Invalid mark entered")
            return
        }

        marks[i] = m
        total += m
    }

    val percentage = total.toDouble() / n

    val grade = when (percentage) {
        in 90.0..100.0 -> "A+"
        in 80.0..89.99 -> "A"
        in 70.0..79.99 -> "B"
        in 60.0..69.99 -> "C"
        in 50.0..59.99 -> "D"
        in 40.0..49.99 -> "E"
        else -> "F"
    }

    val result = when {
        marks.any { it < 40 } -> "Fail"
        percentage < 40 -> "Fail"
        else -> "Pass"
    }

    println("Grade: $grade   Result: $result   Percentage: $percentage")
}
