// Francis Aguillar 22243
// Universidad del Valle de Guatemala
// Lab 2 Plataformas moviles
// 27/07/23

fun main(args: Array<String>) {
    // calcular promedio
    val nums = listOf(60.0,89.5,98.6,53.23,65.4)
    val promedio = calcularPromedio(nums)
    println("El promedio de la lista $nums es $promedio")

    // obtener numeros impares
    val nums2 = listOf(4,5,7,8,15,56,43,34,10)
    val im = impares(nums2)
    println("Los numeros impares de la lista $nums2 son $im")

    // palindromo de una cadena
    val palabra1 = "hola"
    val palabra2 = "oso"
    println("La palabra $palabra1 ${isPalindrome(palabra1)} es palindromo")
    println("La palabra $palabra2 ${isPalindrome(palabra2)} es palindromo")

    // funcion map, saludo
    val nombres = listOf("Fernando", "Gustavo", "Angela", "Gabriela", "Gerson")
    val saludos = nombres.map{ "hola $it"}
    for (s in saludos) {
        print("$s, ")
    }
    println()

    // lambda as parameter
    println("\nLa suma de 3 y 4 es ${performOperation(3,4)}")

    // funcion de mapeo
    val persons = listOf(Person("Gustavo",20,"M"),Person("Patricia",18,"M"),Person("Diego",20,"M"))
    val students = persons.map { person -> convert(person)}
    for (s in students) {
        println("El estudiante ${s.name} tiene ${s.age} años")

    }

}

fun calcularPromedio(lista: List<Double>):Double{
    val suma = lista.reduce{ acu , num -> acu + num}
    val promedio = suma / lista.size
    return promedio
}

fun impares(lista: List<Int>): List<Int>{
    val impares = lista.filter{ n -> n % 2 != 0 }
    return impares
}

fun isPalindrome(lista: String): String{
    val rever = lista.reversed()
    return if (rever == lista) "si" else "no"
}


fun performOperation(x:Int, y:Int, suma1: (Int, Int) -> Int =  { x,y -> x+ y} ): Int {
    return suma1(x,y)
}

data class Person(val name: String, val age: Int, val gender: String)

data class Student(val name: String, val age: Int, val gender: String, val
studentId: String)

fun convert(person:Person):Student{
    return Student(person.name, person.age, person.gender, "")
}




