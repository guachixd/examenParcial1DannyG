def myMethod(datos: List[Double]): Double = {
  val promedio = datos.foldLeft(0.0)(_ + _) / datos.length
  val sumaCuadrados = datos.map(x => {
    val d = x - promedio
    d * d
  }).sum
  math.sqrt(sumaCuadrados / datos.length)
}

def transformarNotas(notas: List[Double], politica: Double => Double): List[Double] = {
  notas.foldRight(List[Double]())((n, acc) => politica(n) :: acc)
}

val redondear: Double => Double = n => math.round(n).toDouble
val bonificar: Double => Double = n => n + 1.5
val bajarAltas: Double => Double = n => if (n > 18) n - 1 else n

def generadorSaludo(fraseBase: String): String => String =
  nombre => s"$fraseBase, $nombre
//prompt
ya ahora dame los 3 codigos en base a esto Quiero que generes el codigo en Scala de forma clara, sencilla y usando programacion funcional. Cuando te mande un metodo en Java, transformalo a una version funcional en Scala usando operaciones como map, sum, foldLeft o flatMap, sin usar ciclos for tradicionales. Si te doy un ejercicio donde se aplica una politica o transformacion, crea una funcion que reciba otra funcion como parametro. Si te mando una funcion anonima, conviertela a una funcion con nombre. Cuando te diga "solo dame el codigo", quiero que la respuesta sea unicamente el bloque de codigo sin explicaciones. No uses tildes en tu respuesta.