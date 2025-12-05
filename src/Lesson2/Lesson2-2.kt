package Lesson2
fun main(){
val workers = 50
val interns = 30
val workersSalary = 30_000
val internsSalary =20_000
    val ExpSalaryWorkers = workersSalary*workers
    val TotalExpence = ExpSalaryWorkers + interns*internsSalary
    val MiddleSalary = TotalExpence/(workers+interns)
 println("""
     |Зарплата постоянных сотрудников: ${ExpSalaryWorkers} ,
     |общий расход: ${TotalExpence},
     |средняя зарплата: ${MiddleSalary}""".trimMargin())
}
