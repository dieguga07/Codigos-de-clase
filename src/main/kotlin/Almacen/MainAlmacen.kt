package Almacen

fun main(){

    var bebida1 =BebidaAzucarada(1,2.0,1.0,"Pepsi",90.00,false)
    var bebida2 =BebidaAzucarada(2,1.0,1.0,"Pepsi",90.00,false)
    var bebida3 =Aguamineral(3,2.0,1.0,"Cabreiroa","Mulhacen")
    var bebida4 = BebidaAzucarada(4,2.0,1.0,"Lipton",85.00,true)


    var almacen1=Almacen()

    almacen1.agregar_producto_1(bebida1,1)
    almacen1.agregar_producto_1(bebida2,2)
    almacen1.agregar_producto_1(bebida3,3)
    almacen1.agregar_producto_1(bebida4,4)


    almacen1.mostrar()

    almacen1.eliminar_producto(4)
    //mostra que no esta el producto
    println("----------------------------------")
    almacen1.mostrar()
    println("----------------------------------")
    almacen1.precio_estanteria(1)

    almacen1.precio_total()

    almacen1.precio_marca("Pepsi")


}