package Lesson2

fun main() {
    val workers = 50
    val interns = 30
    val workersSalary = 30_000
    val internsSalary = 20_000
    val expSalaryWorkers = workersSalary * workers
    val totalExpense = expSalaryWorkers + interns * internsSalary
    val middleSalary = totalExpense / (workers + interns)
    println(
        """
     |Зарплата постоянных сотрудников: ${expSalaryWorkers},
     |общий расход: ${totalExpense},
     |средняя зарплата: $middleSalary""".trimMargin()
    )
}
