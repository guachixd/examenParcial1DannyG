
//Ejercicio Numerp1

def myMethod(datos: List[Double]): Double = {
  val promedio = datos.sum / datos.size

  val sumaCuadrados = datos.map(suma => (datos - promedio, 2)).sum / datos.size
}

//Ejercicio Numero2
def transformarNotas(notas: List[Double], politica: Double => Double): List[Double] = {
  notas.map(politica)
  val redondearNotas: Double => Double = nuevaNota => Math.round(nuevaNota)
  val bonificacionNotas: Double => Double = nuevaNota => nuevaNota + 0.5
  val bajarAltasNotas: Double => Double = nuevaNota => if (n > 10) n - 1 else n
}

//Ejercicio Numero3
def generadorSaludo(fraseBase: String) = (nombre: String) => s"$fraseBase, $nombre!"





