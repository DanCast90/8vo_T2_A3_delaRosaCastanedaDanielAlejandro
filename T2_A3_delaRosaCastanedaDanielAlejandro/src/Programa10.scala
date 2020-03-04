import scala.io.StdIn._

object Programa10 {
    
  def empaquetar(lista: List[Int], cantidad:Int, numero:Int): Unit = {
    
    var lista1=List.empty[Int]
    var cont1=0
    var cont2=0
    
     for(x <- 0 to lista.length-1){
       if(lista(x)==numero){
         cont1+=1
         if(cont1==cantidad){
          for(x <- 1 to cont1){
            lista1=lista1:+numero
            cont2+=1
          }
          cont1=0
        }
      }else{
        cont1=0
      }
    }
    println(lista1)
       
    
  }
  
  def main(args: Array[String]): Unit ={
    var lista=0::0::1::0::0::1::0::0::1::1::0::0::0::0::1::0::1::0::0::Nil
    println("Ingresa cantidad de caracteres")
    var cantidad=readInt()
    println("Ingresa el caracter (0 y 1)")
    var numero=readInt()
    
    empaquetar(lista, cantidad, numero)
      }
}