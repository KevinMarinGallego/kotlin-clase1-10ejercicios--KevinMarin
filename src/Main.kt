//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("===================================")
    println("   ACTIVIDAD 2 - FUNDAMENTOS KOTLIN")
    println("===================================\n")

    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
    ejercicio10()
}

//=====================================================
// EJERCICIO 1 - Saludo Personalizado
//=====================================================

fun ejercicio1() {

    println("\n===== EJERCICIO 1 =====")

    print("Ingrese su nombre: ")
    val nombre = readLine()?.trim() ?: "Usuario"

    print("Ingrese su edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    println("Hola $nombre, tienes $edad años. ¡Bienvenido a Kotlin!")
}

//=====================================================
// EJERCICIO 2 - Calculadora Básica
//=====================================================

fun ejercicio2() {

    println("\n===== EJERCICIO 2 =====")

    print("Primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Suma: ${num1 + num2}")
    println("Resta: ${num1 - num2}")
    println("Multiplicación: ${num1 * num2}")

    if (num2 != 0.0) {
        println("División: ${num1 / num2}")
    } else {
        println("No se puede dividir entre cero.")
    }
}

//=====================================================
// EJERCICIO 3 - Clasificador de Edad
//=====================================================

fun ejercicio3() {

    println("\n===== EJERCICIO 3 =====")

    print("Ingrese una edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    when {

        edad <= 12 -> println("Categoría: Niño")

        edad <= 17 -> println("Categoría: Adolescente")

        edad <= 59 -> println("Categoría: Adulto")

        else -> println("Categoría: Adulto Mayor")
    }

}

//=====================================================
// EJERCICIO 4 - Contador Regresivo
//=====================================================

fun ejercicio4() {

    println("\n===== EJERCICIO 4 =====")

    print("Ingrese un número: ")

    var numero = readLine()?.toIntOrNull() ?: 0

    while (numero >= 0) {

        println(numero)

        numero--

    }

}

//=====================================================
// EJERCICIO 5 - Promedio de Notas
//=====================================================

fun ejercicio5() {

    println("\n===== EJERCICIO 5 =====")

    var suma = 0.0

    for (i in 1..5) {

        print("Ingrese la nota $i: ")

        val nota = readLine()?.toDoubleOrNull() ?: 0.0

        suma += nota

    }

    val promedio = suma / 5

    println("Promedio final: $promedio")

}

//=====================================================
// EJERCICIO 6 - Null Safety
//=====================================================

fun ejercicio6() {

    println("\n===== EJERCICIO 6 =====")

    print("Nombre: ")
    val nombre = readLine()?.trim() ?: "No ingresado"

    print("Edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    print("Altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")

}

//=====================================================
// EJERCICIO 7 - Parámetros por Defecto
//=====================================================

fun imprimirDatos(
    nombre: String = "Sin nombre",
    edad: Int = 0,
    ciudad: String = "Sin ciudad"
) {

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Ciudad: $ciudad")

}

fun ejercicio7() {

    println("\n===== EJERCICIO 7 =====")

    imprimirDatos()

    imprimirDatos("Ana", 20)

    imprimirDatos("Carlos", 30, "Bogotá")

}

//=====================================================
// EJERCICIO 8 - Tabla de Multiplicar
//=====================================================

fun ejercicio8() {

    println("\n===== EJERCICIO 8 =====")

    print("Ingrese un número: ")

    val numero = readLine()?.toIntOrNull() ?: 1

    for (i in 1..10) {

        println("$numero x $i = ${numero * i}")

    }

}

//=====================================================
// EJERCICIO 9 - Conversor de Temperatura
//=====================================================

fun ejercicio9() {

    println("\n===== EJERCICIO 9 =====")

    println("1. Celsius → Fahrenheit")
    println("2. Fahrenheit → Celsius")

    print("Seleccione una opción: ")

    when (readLine()) {

        "1" -> {

            print("Ingrese grados Celsius: ")

            val c = readLine()?.toDoubleOrNull() ?: 0.0

            val f = (c * 9 / 5) + 32

            println("Resultado: $f °F")

        }

        "2" -> {

            print("Ingrese grados Fahrenheit: ")

            val f = readLine()?.toDoubleOrNull() ?: 0.0

            val c = (f - 32) * 5 / 9

            println("Resultado: $c °C")

        }

        else -> println("Opción incorrecta.")

    }

}

//=====================================================
// EJERCICIO 10 - Resumen Final
//=====================================================

fun ejercicio10() {

    println("\n===== EJERCICIO 10 =====")

    print("Nombre: ")
    val nombre = readLine()?.trim() ?: "Sin nombre"

    print("Edad: ")
    val edad = readLine()?.toIntOrNull() ?: 0

    val categoria = when {

        edad <= 12 -> "Niño"

        edad <= 17 -> "Adolescente"

        edad <= 59 -> "Adulto"

        else -> "Adulto Mayor"

    }

    println("\n========= RESUMEN =========")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Categoría: $categoria")
    println("===========================")

}