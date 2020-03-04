
import scala.io.StdIn._
object Programa2 {
  
  def buscador(lista: List[String], old: String, nueva:String): Unit={
    var lista1=lista
    var cont=0
    for(x <-lista1){
      if(x.equalsIgnoreCase(old)){
        lista1=lista1.updated(cont, nueva)
      }
      cont+=1
    }
    println(lista1)
  }
  
  def main(args: Array[String]): Unit ={
    
    var lista=List("photoengrave","concordal","sulphidic","keyserlick","toruliform","anesthesia","glucine","challote","anconagra","metallotherapeutic","meant","Cercopithecus","standergrass","unstunted","cruzeiro","Sagra",
"foreworn","trunkwork","Ferahan","glossoscopy","pithecian","clearedness","proselenic","chevrony","paretically","nuzzerana","musterer","linstock","hexathlon","Madagascan","photofloodlamp","Rupicaprinae")
    
  println(lista)
  var old=readLine("Ingresa una palabra a buscar")
  
  var nueva=readLine("Ingresa una palabra para reemplazar la anterior")
  
  buscador(lista, old, nueva)
        


  }
}