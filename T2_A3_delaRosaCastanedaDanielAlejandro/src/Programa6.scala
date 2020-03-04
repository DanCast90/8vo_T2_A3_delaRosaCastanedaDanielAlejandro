

object Programa6 {
  
  
  def sumatoria(lista1: List[Int]): Unit={
    var lista=lista1
    for(x <- 0 to lista.length-1){
      if(x>0){
          lista=lista.updated(x, (lista(x-1)+lista(x)))
        }else{
          lista=lista.updated(x, lista(x))
        }
      }
    println(lista)
  }
  
  def main(args: Array[String]): Unit ={
    
    
    var lista=472::370::165::282::262::461::111::486::85::468::432::215::212::456::251::494::289::212::468::159::200::230::166::418::361::52::388::429::Nil
    sumatoria(lista)
    
  }
  
}