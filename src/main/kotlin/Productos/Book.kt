package Productos

open class Book(regular_initial_price:Double,publisher:String,YearPublisher:Int):Product(regular_initial_price) {
    override fun computeSpecialCustomerPrice(): Double {
        var valor_especial = 0.0
        valor_especial = regular_price - 2
        return valor_especial

    }

    override fun computer_sale_price():Double{
        var valor = 0.0
        valor = regular_price * 0.5
        return valor

    }


}