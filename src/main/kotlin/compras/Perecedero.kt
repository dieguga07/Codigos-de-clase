package compras

class Perecedero(Nombre:String,Precio:Double,DiasCaducar:Int):Producto(Nombre,Precio){

    var dias_calcular = 0

    init {
        dias_calcular = DiasCaducar
    }

  override fun calcular_precio(cantidad:Int){
      super.calcular_precio(cantidad)
  }


}