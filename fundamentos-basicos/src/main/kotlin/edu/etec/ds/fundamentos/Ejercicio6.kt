package edu.etec.ds.fundamentos

fun obtenerDiaSemana(dia: Int): String {
    val nombreDia = when(dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia invalido"
    }
    return nombreDia
    }

fun obtenerNombreMes(mes: Int): String {
    val nombreMes = when(mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes invalido"
    }
    return nombreMes
}

fun clasificarNumeroWhen(numero: Int): String {
    val numeroWhen = when {
        numero < 0 -> "Negativo"
        numero == 0 -> "Cero"
        numero > 0 -> "Positivo"
        else -> "Numero invalido"
    }
    return numeroWhen
}

fun clasificarEdad(edad: Int): String {
    return when {
        edad < 3 -> "Bebe"
        edad in 3..12 -> "Nino"
        edad in 13..17 -> "Adolescente"
        edad in 18..65 -> "Adulto"
        edad > 65 -> "Anciano"
        else -> "Edad invalida"
    }
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    TODO("Convertir: USD a MXN (1.85), EUR a MXN (18), JPY a MXN (0.10), otro retorna 0")
}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    TODO("Usar when para realizar + - * / %. Division por cero retorna 0.0")
}

fun obtenerDescuentoWhen(monto: Double): Double {
    TODO("Usar when como expresion: >200 -> 25%, >150 -> 15%, >100 -> 10%, else 0%")
}

fun obtenerCalificacion(nota: Int): String {
    TODO("Usar when con rangos: >=90 Promocionado, >=60 Aprobado, else Desaprobado")
}

fun esVocal(caracter: Char): Boolean {
    TODO("Usar when para verificar si es vocal (a, e, i, o, u mayusculas y minusculas)")
}

fun esPrimo(numero: Int): Boolean {
    TODO("Usar when para determinar si un numero es primo (mayor a 1 divisible solo por 1 y si mismo)")
}
