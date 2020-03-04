import scala.util.Random

object Programa8 {
  
  def obtenerCapicula(lista1 :List[Int]):Unit={
    var lista=lista1
    var valor=""
    for(x <- 0 to lista.length-1){
      valor=lista(x).toString()
      if(!valor.equals(valor.reverse)){
        lista=lista.updated(x, 0)
      }
      
    }
    println(lista)
    
    
  }
  
  def main(args: Array[String]): Unit ={
    
    
    var lista1=82::131::269::316::Nil
    obtenerCapicula(lista1)


  }
}