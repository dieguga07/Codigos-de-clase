package Productos

abstract class Product:Relationalnterface {
    companion object{
        val Tipo_iva:IntArray = intArrayOf(0,2,10,21)
        private var contador = 0
        fun ver_contador():Int{
            return contador
        }
    }
    var numero_serie = 0
    var regular_price:Double
    var IVA = Tipo_iva[3]
        get() {
            return field
        }
        set(value) {
            if (value in Tipo_iva){
                field = value
            }

        }

    constructor(regular_initial_price:Double){
        regular_price = regular_initial_price
        contador += 1
        numero_serie = contador

    }



    override fun isGreater(a:Any):Boolean{
        a as Product
        if ( a.regular_price > this.regular_price)
            return true
        else
            return false
    }
    override fun isEqual(a: Any): Boolean{
        a as Product

        if (a.regular_price != this.regular_price)
            return false
        else
            return true
    }

    override fun isLess(a:Any):Boolean {
        a as Product
        if (a.regular_price < this.regular_price)
            return true
        else
            return false
    }

abstract fun computeSpecialCustomerPrice():Double
abstract fun computer_sale_price():Double

}
