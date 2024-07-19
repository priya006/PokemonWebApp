package KotlinQuestions

/*
Given a key value pairs with employee and manager reporting structure.
Implement a method getEmployees(manager) -
which returns number of  employees that report to the manager.

// Assume that this is map with key being the employee and value is their manager
{
"employeesAtCompany":[
    {employee -> manager}
  {"A" -> "C"},
  {"B" -> "C"},
  {"C" -> "F"},
  {"D" -> "E"},
  {"E" -> "F"},
  {"F" -> "F"}
]
}
*/

fun main() {

    fun getManagerToEmployeesMap(employeesToManagerMap: HashMap<Char, Char>, manager: Char):Int?{

        var managerEmployeesHashMap = mutableMapOf<Char,Int>()
        for((employees, manager) in employeesToManagerMap){

            managerEmployeesHashMap[manager] = managerEmployeesHashMap.getOrDefault(manager, 0) + 1

        }

        return managerEmployeesHashMap[manager]

    }

    var managerToEmployeesMap = hashMapOf(
        'A' to 'C',
        'B' to 'C',
        'C' to 'F',
        'D' to 'E',
        'E' to 'F',
        'F' to 'F')

    var employeeCount = getManagerToEmployeesMap(managerToEmployeesMap, 'E')
    println(employeeCount)
}