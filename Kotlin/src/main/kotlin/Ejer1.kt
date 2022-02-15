
import java.util.*


class Ejer1 {
    var serie = IntArray(255)
    fun construirSerie(inicio1: Int, inicio2: Int, patron1: Int, patron2: Int) {
        serie[0] = inicio1
        serie[1] = inicio2
        for (i in 2 until serie.size) {
            if (i % 2 == 0) {
                serie[i] = serie[i - 2] + patron1
            } else {
                serie[i] = serie[i - 2] + patron2
            }
        }
        println(serie.contentToString())
    }

    fun sumaElementos(a: Int, b: Int): Int {
        var resultado = -1
        resultado = if (a < 1 || a > 255 || b < 1 || b > 255) {
            return resultado
        } else {
            serie[a - 1] + serie[b - 1]
        }
        return resultado
    }
}