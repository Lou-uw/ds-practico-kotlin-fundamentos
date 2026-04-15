package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0
    for (i in 1..n) {
       suma += i
   }
    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for(i in inicio..fin) {
        if (i % 2 == 0) {
            contador++
        }
    }
    return contador
}


fun fibonacci(n: Int): Int {
    TODO("Retornar el n-esimo numero de Fibonacci")
}

fun factorial(n: Int): Int {
    TODO("Calcular el factorial de n")
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (i in numeros) {
        if (i > maximo) {
            maximo = i
        }
    }

    return maximo
}
fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (i in numeros) {
        if(i < minimo) {
            minimo = i
        }
    }
    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for(i in numeros) {
        suma += i
    }
    return suma
}

fun inverter(texto: String): String {
    var resultado = ""
    for(letra in texto) {
        resultado = letra + resultado
    }
return resultado
}

fun contarVocales(texto: String): Int {
    var contador = 0
    for(letra in texto) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
            || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            contador++
        }
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    var sinEspacios = ""
    var invertido = ""
    for (letra in texto) {
        if (letra != ' ') {
            sinEspacios += letra
        }
    }
    for (letra in sinEspacios) {
        invertido = letra + invertido
    }
    return sinEspacios == invertido
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = mutableListOf<Int>()
    for (i in 1..10) {
        lista.add(numero * i)
    }
    return lista
}
