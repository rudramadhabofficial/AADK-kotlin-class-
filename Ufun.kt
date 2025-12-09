fun student( name: String , grade: Char , roll_no: Int) {
    println("Name of the student is: $name")
    println("Grade of the student is: $grade")
    println("Roll no of the student is: $roll_no")

}

fun main(args: Array<String>) {
    val name = "Praveen"
    val rollno = 25
    val grade = 'A'
    student(name,grade,rollno)
    student("Gaurav",'B',30)
}