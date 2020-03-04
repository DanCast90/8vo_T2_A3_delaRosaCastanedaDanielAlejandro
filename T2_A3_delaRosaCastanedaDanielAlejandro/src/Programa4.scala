

object Programa4 {
  def eliminador(lista1: List[String],lista2:List[String]):Unit ={
    var llista1=lista1
    var llista2=lista2
    var cont=0
    for(x<- llista1){
      for(y <- llista2){
        if(y.equalsIgnoreCase(x)){
            llista1=llista2.updated(cont, "")
        }
        cont+=1
      }
      cont=0
    }
    println(llista1)
  }
  def main(args: Array[String]): Unit = {
     var lista=List("photoengrave","concordal","sulphidic","keyserlick","toruliform","anesthesia","glucine","challote","anconagra","metallotherapeutic","meant","Cercopithecus","standergrass","unstunted","cruzeiro","Sagra",
"foreworn","trunkwork","Ferahan","glossoscopy","pithecian","clearedness","proselenic","chevrony","paretically","nuzzerana","musterer","linstock","hexathlon","Madagascan","photofloodlamp","Rupicaprinae")
    
 var lista2=List("photoengrave","concordal","sulphidic","keyserlick","toruliform","anesthesia","glucine","challote","anconagra","metallotherapeutic","meant","Cercopithecus","standergrass","unstunted","cruzeiro","Sagra",
"foreworn","trunkwork")

eliminador(lista, lista2)
  }
}